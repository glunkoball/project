package aaa.project.controller;


import aaa.project.alipay.AlipayConfig;
import aaa.project.alipay.AlipayConfig1;
import aaa.project.entity.OwerContract;
import aaa.project.entity.Tranction;
import aaa.project.service.ContractService;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.internal.util.AlipaySignature;
import com.alipay.api.request.AlipayFundTransToaccountTransferRequest;
import com.alipay.api.request.AlipayTradePagePayRequest;
import com.alipay.api.response.AlipayFundTransToaccountTransferResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.*;

@Controller
@RequestMapping("/admin")
public class PayFdController {

    @Autowired
    private ContractService contractService;
    /**
     * 跳转到支付界面
     * @return
     */
    @RequestMapping("finance/transactionRecord")
    public String transationRecord(){

        return "admin/payfd/transation";
    }
    @RequestMapping("finance/pay")

    public String  pay(HttpServletRequest request,Model model) throws  Exception{
        //商户订单号，商户网站订单系统中唯一订单号，必填
        String out_trade_no = new String(request.getParameter("WIDout_trade_no").getBytes("ISO-8859-1"),"UTF-8");
        //付款金额，必填
        String total_amount = new String(request.getParameter("WIDtotal_amount").getBytes("ISO-8859-1"),"UTF-8");
        //订单名称，必填
        String subject = new String(request.getParameter("WIDsubject").getBytes("ISO-8859-1"),"UTF-8");
        //商品描述，可空
        System.out.println(out_trade_no);
        String body = new String(request.getParameter("WIDbody").getBytes("ISO-8859-1"),"UTF-8");
        AlipayClient alipayClient = new DefaultAlipayClient(AlipayConfig.gatewayUrl,AlipayConfig.app_id,AlipayConfig.merchant_private_key,"json","GBK",AlipayConfig.alipay_public_key,"RSA2");
        AlipayFundTransToaccountTransferRequest request1 = new AlipayFundTransToaccountTransferRequest();
        request1.setBizContent("{" +
                "\"out_biz_no\":\""+ out_trade_no+"\","+
                "\"payee_type\":\"ALIPAY_LOGONID\"," +
                "\"payee_account\":\"nfydmm2165@sandbox.com\"," +
                "\"amount\":\""+total_amount+"\"," +
                "\"payer_show_name\":\"sdd\"," +
                "\"payee_real_name\":\"沙箱环境\"," +
                "\"remark\":\"ddsdd\"" +
                "  }");
        AlipayFundTransToaccountTransferResponse response = alipayClient.execute(request1);
        String i=null;
        if(response.isSuccess()){
            String aptNum = out_trade_no.substring(0, 14);
            System.out.println(aptNum);
            List<OwerContract> contract= contractService.findcontractbyapt(aptNum);
            String date1 = contract.get(0).getNextTime();//下次的时间
            String pway = contract.get(0).getPway();

            //字符串转date
            SimpleDateFormat sm=new SimpleDateFormat("yyyy-MM-dd");
            Date parse = sm.parse(date1);
            System.out.println(parse);
            Calendar c=Calendar.getInstance();
            c.setTime(parse);

            String datenew=null;
            if(pway.equals("月付")){
                c.add(Calendar.MONTH,1);//下次的时间加一
                Date time = c.getTime();//转换后的
                //date转字符串
                datenew = sm.format(time);
            }
            if(pway.equals("季付")){
                c.add(Calendar.MONTH,3);//下次的时间加一
                Date time = c.getTime();//转换后的
                //date转字符串
                datenew = sm.format(time);
            }
            if(pway.equals("半年付")){
                c.add(Calendar.MONTH,6);//下次的时间加一
                Date time = c.getTime();//转换后的
                //date转字符串
                datenew = sm.format(time);
            }
            if(pway.equals("年付")){
                c.add(Calendar.MONTH,12);//下次的时间加一
                Date time = c.getTime();//转换后的
                //date转字符串
                datenew = sm.format(time);
            }
            System.out.println(date1);
            System.out.println(datenew);
            contractService.updateContractTime(date1,datenew,aptNum);


            //将记录插入到数据库中
            Tranction tt=new Tranction();
            Integer owerid = contract.get(0).getOwerid();
            tt.setOwnerId(owerid);


            //当前时间
            Date rightnow = new Date();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            String transactionDate = formatter.format(rightnow);

            tt.setTransactionDate(transactionDate);
            tt.setAptNum(aptNum);//房源编号
            tt.setAmount(total_amount);//金额
            tt.setOrderNum(out_trade_no);//订单编号
            //生成的贸易编号
            Random rand = new Random();
            int shu2 = rand.nextInt(1000);
            SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");
            String f = df.format(rightnow);
            String transactionid=f+shu2;

            tt.setTradeNum(transactionid);


            contractService.addtotransaction(tt);
            System.out.println("调用成功");
            i="转账成功";
        } else {
            System.out.println("调用失败");
             i="转账失败";
        }


        //若想给BizContent增加其他可选请求参数，以增加自定义超时时间参数timeout_express来举例说明
        //alipayRequest.setBizContent("{\"out_trade_no\":\""+ out_trade_no +"\","
        //		+ "\"total_amount\":\""+ total_amount +"\","
        //		+ "\"subject\":\""+ subject +"\","
        //		+ "\"body\":\""+ body +"\","
        //		+ "\"timeout_express\":\"10m\","
        //		+ "\"product_code\":\"FAST_INSTANT_TRADE_PAY\"}");
        //请求参数可查阅【电脑网站支付的API文档-alipay.trade.page.pay-请求参数】章节
        model.addAttribute("info",i);


        return "admin/payfd/success";
    }
    @RequestMapping("finance/findtransaction")
    @ResponseBody
    public List<Tranction> findtransaction(){
        List<Tranction> findtransaction = contractService.findtransaction();
        return  findtransaction;
    }


  /*  *//**
     * 支付 跳转到支付宝支付的界面  要和支付宝对接
     * @return
     *//*
    @RequestMapping("finance/pay")
    @ResponseBody
    public String  pay(HttpServletRequest request) throws  Exception{
//获得初始化的AlipayClient
        AlipayClient alipayClient = new DefaultAlipayClient(AlipayConfig1.gatewayUrl, AlipayConfig1.app_id, AlipayConfig1.merchant_private_key, "json", AlipayConfig1.charset, AlipayConfig1.alipay_public_key, AlipayConfig1.sign_type);

        //设置请求参数
        AlipayTradePagePayRequest alipayRequest = new AlipayTradePagePayRequest();
        alipayRequest.setReturnUrl(AlipayConfig1.return_url);
        alipayRequest.setNotifyUrl(AlipayConfig1.notify_url);

        //商户订单号，商户网站订单系统中唯一订单号，必填
        String out_trade_no = new String(request.getParameter("WIDout_trade_no").getBytes("ISO-8859-1"),"UTF-8");
        //付款金额，必填
        String total_amount = new String(request.getParameter("WIDtotal_amount").getBytes("ISO-8859-1"),"UTF-8");
        //订单名称，必填
        String subject = new String(request.getParameter("WIDsubject").getBytes("ISO-8859-1"),"UTF-8");
        //商品描述，可空
        String body = new String(request.getParameter("WIDbody").getBytes("ISO-8859-1"),"UTF-8");

        alipayRequest.setBizContent("{\"out_trade_no\":\""+ out_trade_no +"\","
                + "\"total_amount\":\""+ total_amount +"\","
                + "\"subject\":\""+ subject +"\","
                + "\"body\":\""+ body +"\","
                + "\"product_code\":\"FAST_INSTANT_TRADE_PAY\"}");

        //若想给BizContent增加其他可选请求参数，以增加自定义超时时间参数timeout_express来举例说明
        //alipayRequest.setBizContent("{\"out_trade_no\":\""+ out_trade_no +"\","
        //		+ "\"total_amount\":\""+ total_amount +"\","
        //		+ "\"subject\":\""+ subject +"\","
        //		+ "\"body\":\""+ body +"\","
        //		+ "\"timeout_express\":\"10m\","
        //		+ "\"product_code\":\"FAST_INSTANT_TRADE_PAY\"}");
        //请求参数可查阅【电脑网站支付的API文档-alipay.trade.page.pay-请求参数】章节

        //请求
        String result = alipayClient.pageExecute(alipayRequest).getBody();
        System.out.println(result);

        return result;
    }


    *//**
     * 支付宝调用的同步的请求
     * @return
     *//*
    @RequestMapping("/paySuccess")
    public String  paySuccess(HttpServletRequest request, Model model) throws  Exception{
        Map<String,String> params = new HashMap<String,String>();
        Map<String,String[]> requestParams = request.getParameterMap();
        for (Iterator<String> iter = requestParams.keySet().iterator(); iter.hasNext();) {
            String name = (String) iter.next();
            String[] values = (String[]) requestParams.get(name);
            String valueStr = "";
            for (int i = 0; i < values.length; i++) {
                valueStr = (i == values.length - 1) ? valueStr + values[i]
                        : valueStr + values[i] + ",";
            }
            //乱码解决，这段代码在出现乱码时使用
            valueStr = new String(valueStr.getBytes("ISO-8859-1"), "utf-8");
            params.put(name, valueStr);
        }
        System.out.println("2222");
        boolean signVerified = AlipaySignature.rsaCheckV1(params, AlipayConfig1.alipay_public_key, AlipayConfig1.charset, AlipayConfig1.sign_type); //调用SDK验证签名

        //——请在这里编写您的程序（以下代码仅作参考）——
        String info="";
        if(signVerified) {
            //商户订单号
            String out_trade_no = new String(request.getParameter("out_trade_no").getBytes("ISO-8859-1"),"UTF-8");

            //支付宝交易号
            String trade_no = new String(request.getParameter("trade_no").getBytes("ISO-8859-1"),"UTF-8");
            System.out.println("adada");
            //付款金额
            String total_amount = new String(request.getParameter("total_amount").getBytes("ISO-8859-1"),"UTF-8");
            info="trade_no:"+trade_no+"<br/>out_trade_no:"+out_trade_no+"<br/>total_amount:"+total_amount;
        //改变交易时间记录什么的
            System.out.println(info);
            String aptNum = out_trade_no.substring(0, 14);
            System.out.println(aptNum);
            List<OwerContract> contract= contractService.findcontractbyapt(aptNum);
            String date1 = contract.get(0).getNextTime();//下次的时间
            String pway = contract.get(0).getPway();

            //字符串转date
            SimpleDateFormat sm=new SimpleDateFormat("yyyy-MM-dd");
            Date parse = sm.parse(date1);
            System.out.println(parse);
            Calendar c=Calendar.getInstance();
            c.setTime(parse);

            String datenew=null;
            if(pway.equals("月付")){
                c.add(Calendar.MONTH,1);//下次的时间加一
                Date time = c.getTime();//转换后的
                //date转字符串
                datenew = sm.format(time);
            }
            if(pway.equals("季付")){
                c.add(Calendar.MONTH,3);//下次的时间加一
                Date time = c.getTime();//转换后的
                //date转字符串
                datenew = sm.format(time);
            }
            if(pway.equals("半年付")){
                c.add(Calendar.MONTH,6);//下次的时间加一
                Date time = c.getTime();//转换后的
                //date转字符串
                datenew = sm.format(time);
            }
            if(pway.equals("年付")){
                c.add(Calendar.MONTH,12);//下次的时间加一
                Date time = c.getTime();//转换后的
                //date转字符串
                datenew = sm.format(time);
            }
            System.out.println(date1);
            System.out.println(datenew);
            contractService.updateContractTime(date1,datenew,aptNum);



        }else {
            info ="验签失败" ;
            System.out.println("验签失败");
        }
        model.addAttribute("info",info);
        return "admin/payfd/success";
    }*/
}

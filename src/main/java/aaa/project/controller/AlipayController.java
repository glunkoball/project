package aaa.project.controller;

import aaa.project.alipay.AlipayConfig;
import aaa.project.common.Constants;
import aaa.project.entity.TransactionRecord;
import aaa.project.entity.User;
import aaa.project.service.CustomerPersonalService;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.internal.util.AlipaySignature;
import com.alipay.api.request.AlipayTradePagePayRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@Controller
public class AlipayController {

    @Autowired
    private CustomerPersonalService customerPersonalService;

    /**
     * 跳转到支付界面
     * @return
     *//*
    @RequestMapping("/toPay")
    public String toPay(){
        return "alipay/pay";
    }
*/

    /**
     * 支付 跳转到支付宝支付的界面  要和支付宝对接
     * @return
     */
    @RequestMapping("/pay")
    @ResponseBody
    public String  pay(HttpServletRequest request,@RequestBody String json) throws  Exception{
//获得初始化的AlipayClient
        AlipayClient alipayClient = new DefaultAlipayClient(AlipayConfig.gatewayUrl, AlipayConfig.app_id, AlipayConfig.merchant_private_key, "json", AlipayConfig.charset, AlipayConfig.alipay_public_key, AlipayConfig.sign_type);

        //设置请求参数
        AlipayTradePagePayRequest alipayRequest = new AlipayTradePagePayRequest();
        alipayRequest.setReturnUrl(AlipayConfig.return_url);
        alipayRequest.setNotifyUrl(AlipayConfig.notify_url);
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


    /**
     * 支付宝调用的同步的请求
     * @return
     */
    @RequestMapping("/paySuccess")
    public String  paySuccess(HttpServletRequest request, Model model, HttpSession session) throws  Exception{
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

        boolean signVerified = AlipaySignature.rsaCheckV1(params, AlipayConfig.alipay_public_key, AlipayConfig.charset, AlipayConfig.sign_type); //调用SDK验证签名

        //——请在这里编写您的程序（以下代码仅作参考）——
        String info="";
        if(signVerified) {

            //获取租房者编号
            User user =(User) session.getAttribute(Constants.SESSION_USER);
            Integer tenantId = user.getId();

            //商户订单号
            String out_trade_no = new String(request.getParameter("out_trade_no").getBytes("ISO-8859-1"),"UTF-8");

            //支付宝交易号
            String trade_no = new String(request.getParameter("trade_no").getBytes("ISO-8859-1"),"UTF-8");

            //付款金额
            String total_amount = new String(request.getParameter("total_amount").getBytes("ISO-8859-1"),"UTF-8");

            TransactionRecord transactionRecord = new TransactionRecord();
            //设置支付宝交易号
            transactionRecord.setTradeNum(trade_no);
            //设置租客编号
            transactionRecord.setTenantId(tenantId);
            //设置付款金额
            transactionRecord.setAmount(total_amount);
            //设置商户订单号
            transactionRecord.setSubject(out_trade_no);
            //设置房源编号
            transactionRecord.setAptNum(out_trade_no.substring(0,14));
            //设置交易时间
            Date rightnow = new Date();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            String transactionDate = formatter.format(rightnow);
            transactionRecord.setTransactionDate(transactionDate);


            int i = customerPersonalService.setIntoRecord(transactionRecord);

            info="trade_no:"+trade_no+"<br/>out_trade_no:"+out_trade_no+"<br/>total_amount:"+total_amount+"<br/>total_amount:";
            System.out.println(info);
        }else {
            info ="验签失败" ;
            System.out.println("验签失败");
        }
        model.addAttribute("info",info);
        System.out.println(info);
        return "redirect:personal";
    }
}

package aaa.project.common;

import aaa.project.alipay.AlipayConfig;
import aaa.project.alipay.AlipayConfig1;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayFundTransToaccountTransferRequest;
import com.alipay.api.response.AlipayFundTransToaccountTransferResponse;

public class Test3 {
    public static void main(String[] args)throws Exception {
        AlipayClient alipayClient = new DefaultAlipayClient(AlipayConfig.gatewayUrl,AlipayConfig.app_id,AlipayConfig.merchant_private_key,"json","GBK",AlipayConfig.alipay_public_key,"RSA2");
        AlipayFundTransToaccountTransferRequest request = new AlipayFundTransToaccountTransferRequest();
        request.setBizContent("{" +
                "\"out_biz_no\":\"3142321423442\"," +
                "\"payee_type\":\"ALIPAY_LOGONID\"," +
                "\"payee_account\":\"nfydmm2165@sandbox.com\"," +
                "\"amount\":\"100\"," +
                "\"payer_show_name\":\"sdd\"," +
                "\"payee_real_name\":\"沙箱环境\"," +
                "\"remark\":\"ddsdd\"" +
                "  }");
        AlipayFundTransToaccountTransferResponse response = alipayClient.execute(request);
        if(response.isSuccess()){
            System.out.println("调用成功");
        } else {
            System.out.println("调用失败");
    }
}}

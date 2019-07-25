package aaa.project.alipayfd.config;

import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayTradeQueryRequest;
import com.alipay.api.response.AlipayTradeQueryResponse;

public class Test {
    public static void main(String[] args) throws  Exception {
        AlipayClient alipayClient = new DefaultAlipayClient("https://openapi.alipaydev.com/gateway.do",AlipayConfig.app_id,AlipayConfig.merchant_private_key,"json","GBK",AlipayConfig.alipay_public_key,"RSA2");
        AlipayTradeQueryRequest request = new AlipayTradeQueryRequest();
        request.setBizContent("{" +
                "\"out_trade_no\":\"11111df1231231\"," +
             //   "\"trade_no\":\"2014112611001004680 073956707\"," +
              //  "\"org_pid\":\"2088101117952222\"," +
                "      \"query_options\":[" +
                "        \"TRADE_SETTE_INFO\"" +
                "      ]" +
                "  }");
        AlipayTradeQueryResponse response = alipayClient.execute(request);
        if(response.isSuccess()){
            System.out.println("调用成功");
        } else {
            System.out.println("调用失败");
        }



    }
}

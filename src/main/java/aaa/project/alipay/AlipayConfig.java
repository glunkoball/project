package aaa.project.alipay;

import java.io.FileWriter;
import java.io.IOException;

public class AlipayConfig {
    //↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
    public static String app_id = "2016101000652278";

    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCMCEeCpu0b+GuE3QsPpNSMT105yB0s3a20QtEyLxWO2eTkj6SoF8b/m0i9HTeQkTv0RFi1oHRywMxBIs3TMYMMWlxhbmlvIS96tRuQaSfJ/hERwRnEoUgVygsN3L1T3RS4XvxR+whN/dot+2wC+i6JovgconWKfiHsH5wkkbcFSgdHC/0aLtEVYjt0BGIXPe7dAaSTq+LyfVo638sNKCobFSh3aoBLlZaB3EIjlQ2mgvOqSZEyGNdzZR4PbWsr1VFMAfOGfJQ0vvYpww4Nn71x1hnXRpI3senSHWxRsFQ91mY7DuJ26gA3WxDmJHv+GsWvwu88t3RYDWtPvEupaOSHAgMBAAECggEAITD9Mjy6yvxxD8cNDiI1tyRApqeGMtJAkA+eYlTCuV9wX7SkhKtOIdv+u8SnHP8vxNBGbpafw2trfqzvOHXt6AmrB/URzKODC4TOCcbDBZ/RD/JDV1YbLf7768c8oRowBRuOlyf3afUXt/p2OaZvTXRxdugTEEahZ8R+UDSxuvDaSJJNmGF8RpyrG0PX+mFt+PjOUL4P5UN+M2edOhsDQCxoZ4ka/uawgjBcD6iZ7grVrywjJ4FHbZ1UT1p3ZdNp15Fhx8rglKgsLNNmcxp+iTTuVSHVuA7Y6lk2cKZ7/heihCOpF0J2eq63CNem8XjGULL3M3/TGWirhqJdJsWz8QKBgQD1czQtcGOdN7mVqDKDVGXbpjtGKHHzOz+dlweVc+y4R9CpuM68iXlqn/QjZXPAjDG+bQsGLGqv8on9NxGi71mfOMdVrbQ/JStfhV/H2cfSs6QiKAnG7W5fPGnQv96xDrT9nMagpsCE1tEm8n/iq6XJmv2eOqURSJs5zaio9dWrawKBgQCSDR4lHf4l2zRFSl7RxWy3+WP+vlhZESIPMJ6eL2TR6r2dCSOVe3tnB/YO2w7ZswqDa45Vb2igWlA0DK+nI7/2Dip6GU6rwNKgi/BBg47ZxgP2h6ZZz4tpNad3Jq8NRdAm/60PsuakuRUbwvMlYiaLItLU5/vMrTqsZPEhSC1uVQKBgQDzHO20iBqSsYxHeLa3sBPHsOoK/qqHQcsr+1kOpij1CmTahut2gTBa9R3rJWS2deYbeIQv1DTEG5aj0TTNzwdVFvcRnSDoXpeMYF3TZJlw0HAlSMUOXUQyXnNsyW74rtmEThHLM/+CVAgL7KvQxzVJ8BN+8xVmfiUJ5vNEj2LZCwKBgBq86A3nhcWscc9VpDJHMHYl5BaZBleX+WJKhl9zUcPUc84yBB+zsY3VOUjS9c8JJh2VLUOa186zegdtYyL4OoZzZXdg9rQe4vCdbeiwixB3XfZeMygyBNXICtaXcGi/pTHekPJU0EDL2X9xm032wBOs1mg/6Cs6c4loGXT8X8TZAoGAX5u6dYFopYC9TREaQ48nrlSoLG/sgrFo+Qiyf6jo0OR8OdVwYHH6VG3JENBYzKE+UbxUf7yWssAT/gLTWQbZFQQe9Em7s5tlhGOJ9Scq9a0juAlpHIhrNKlHWKzN7U/xb/4qFbazyma8yvawm8DZjFH06PiwvJEF2/JoevsENY4=";

    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAqrSc52yHUi+ejX8iF3zwHEOyJIVac1kX1xjzx41LOSnwj0v86lsM0FKJeRm/4GxmvnYeEO1iD6abHxmW8UO4p9+HRUfyYnQVat/yRHDBCkFIcKx5Ugg6Y1bxJdbG2ECCi++luLNn6InWZavb1eUsEd+nzMZ5rf7/dOrwWS5+pbNQ2Ag/scKe6xN/VBKAAAXWBFNX03NcpT//N5fpLXo2tYZoBskLRQW0p6aDG+4uRHsvM3KTM78iKvrlb4iLMTAmgbgA45OCJKlE3aNeRrqDUORwZbi2ytiuYntWjM/MJOgBwVE6oiNrndSSsYmNisJ/k7Jpq6O111hpOWTF3kjdGQIDAQAB";

    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "http://工程公网访问地址/alipay.trade.page.pay-JAVA-UTF-8/notify_url.jsp";

    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String return_url = "http://localhost:8080/project/paySuccess";

    // 签名方式
    public static String sign_type = "RSA2";

    // 字符编码格式
    public static String charset = "utf-8";

    // 支付宝网关https://openapi.alipay.com/gateway.do
    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";

    // 支付宝网关
    public static String log_path = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /**
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(123);
    }
}

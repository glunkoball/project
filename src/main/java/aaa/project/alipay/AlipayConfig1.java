package aaa.project.alipay;

import java.io.FileWriter;
import java.io.IOException;

public class AlipayConfig1 {
    //↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
    public static String app_id = "2016101000652357";

    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key ="MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQCReHIHcrNHG4QgYEvYk2caDNIxydoIGpoc4xVlk8URWaZQqgh6AvspqYFs/XiE/fLMpuJktdfgcRfd/lWM77F9HUUtbKakGrM0uUR2NYyf8R9HskT1HlVJbh6evHave5yAv8sjDBwhZpc2BV6jqLTEP0/UKikQXGaJs6m/JYLGw66+KEndWcmfxIAjwP/UmUp3yFZyPhKprpA1aLU5FgmNoA4A+xfH7xJyki4r0QXiKuRxRtDAIKep2d2g3BE9XgNuSqyGBAglDMo7rfQGgaVd7PSHH+fMyjOcMeF90yCZCi+6Wex0HhFxaetLCw5bvrr9mrI2LGsxwgtUuposBvmLAgMBAAECggEAWj2chzBJNJBGO4thIZ33NHrFnes43RQbjFX2fQfZFTVG7f08uuvEgQjM6B6pN98NUpUoFg+UNoARrT3MNlyu/w08T7x59400pD1V0frQHJwIqoJVMrW5dI7iYdhJy/xjjp7r1fb6MGIi5XkZR28tjBw2Wkg5JxQa68tPPut3H/NmIeP/kqJD3eqodilT4Q+AXnp5AJDg0VtnuwyU3wHv2BNUPe/QeZCbw0H/4KGmxN1Yt65wdmt149O9vy+1/krQSf9FeGkrd7rhx+bfBA15jaQJ5tQ3Iewlx6QlPezKI8qPGM5zRfRDFlc8Dln1KBBAPyFnK/RCJ9sjlwDJ7uaqEQKBgQD79/nVaMoYZcNsIeoFd1V3uXMQqXf0VnkL59ue5mDizbfHd+PhkoFP52lpgK9tiFdMdHkU0S/eVSANKDjdczLz6smb+TxRgVk2efXp9A9AIPILmBHWstZ58bP+QwTb3AK1jQDWobPuDlgr5H4PrDkIfCpJSrMJsWOnubIPeFXdowKBgQCTzEUNMEw5ah8pjMtl0xcEpX4slXlRtmPS1bnFOmCt9m/yP/78KvtP2lgYRK8O+YcJ7FlQ+0oMl67Xb6FMrMz823FmvmVExgE1UtoOP1P3D5HMf3Xz/wzLiBYFa97y1MOakoRDM3iyRa4CPQXPYIGfCh8fFIvJNeGGeHek/k5i+QKBgAFKtC0z7FVTsDzNr7V3dyi1+rELLWJDTzuQZL/bzoNbKqYLJ0/wwFj4hsHTtxKIsGnj7vr8V5J8PT3UBvabsJcvjPkPvg9s6lgtJ+WbKrjZcmQ801qWcCMP6ixTi6LU7e6gWnC/Q3zk9e7DrSHHcENq34ygpWpXTnt9qDwMEeShAoGAInosQX9ayKnwywiFCiPL4tGYNV5JBr69Wplw1IlhtDMguiojmT+NkHsmwcKD88JRtgbkbvevtnBL4QWxYumMiA/IzGbtyLVH4uCI7XnoZGHFaSbypRCCM5hzSqB3Sb5IQu6a2/JN3YhTp0IE8PNaSXda+y0XzsA689t2TY7lSkECgYBJFJju+9EyUJ2fHeys3jsvzapJovn60/GgmgrRGNcE/IVGz/JzwiIupY3BkWAphJL4pOGWsKdZs/6DImFMiiQAcODxzJ1DMVOKrNeXwi8xgUdb0FTCMD47EEGWMpjmwMEa20sAIWFE33uc5X/0fKQ5CGQWuWzHFCTOWrMArH49Zg==";
    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAnekiUMB4X6tfn3WZtWN2CcBaEuxGPRAUFa6Wnct1NMQ6fQNTstL3NNbFvPIYjmOCbZhWXZFJuzwbxr4kfGLoN2XQPC6ZiQy2Hwr9cOt4qbs+czmrliEGI33+Xm/ANWmNh0/Yz02xB/Me0NXvnT8Vt4uAnpFX50b6ZoHMGGEnyynb+NhjuKuboB5+xz4L6v13l/v/z22/ZRovQKQ7qz/fHwjulnlgQBh1nbchFpaIg1dO4pZIDknnD5vPlgECUPM8/TbO2092LGQv0bJlsc0LWhGg8Lkyf9Xqobm3Pt+W+s1iLaMGWC9z2nDdzLkKEwtWLZjWQp8yiwR1hCvDunm7fQIDAQAB";
    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "http://工程公网访问地址/alipay.trade.page.pay-JAVA-UTF-8/notify_url.jsp";

    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String return_url = "http://localhost:8080/project/admin/paySuccess";

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

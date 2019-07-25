package aaa.project.alipayfd.config;

import java.io.FileWriter;
import java.io.IOException;

public class AlipayConfig {
    //↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
    public static String app_id = "2016101000652357";

    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQC6I+3FdbqpvJEFmUa138AZspTS8UKViF6n9MS+gwyCYr5bas7JNjXAXzfXpRoGknkQT+aNN5XC9KJpo0MSnRcOSIgVwUbLBkAkw5UBUgHDjPQ8Z2WU+3kexk/sYWeM7WlcQ6Plx90yrTzbcih5Cw48G0us8QO8J2Z3XQJVCw5Ry2+KLuWGXlQyPmY7cjdPfe7qvnM/PXXHcHrt+VIXtCTE1wZOsUWuxCLs1qU1UoBC5D31Hzo93en3df9eQEHPXu4bSWm55fUwmIfIXrOzhlDd1zxhM4FMIROhW226GCiflNJNTENllJytAeBN7015i6ekx/2Ly/gXSUb0uN5DgUcJAgMBAAECggEAR7lydGTh8Wekpfii44/9MKm8aO/oDUCH4MYTTamnl1I/MXCdj7Dg02idVu3acm/cUGnJV970STQEpRnwzWpUqP9P2Lop8i9NZh0q/GBCJ7zXm7Ln1Jl12WLnBxmdUhNlRtUVgYQa+t0AFzsM119oM8b8yP3xx32TISloraZd9Sv7KJtq6IteXJwQrckkLTP/vzrfIxXH87A/hUl8/122RfHcemBGULK2FWtWqm3ZBkgxlo33I99q9HuUdt9mF6Ad2jIO6DVLv0aYs1raNlIkXJexvEB2PxBo7Jj/35UijYJw7OJ4+ETrOmLoZcoMDkC1bAh675cYDiQnSLH5i1NeUQKBgQDmwAp/tGa2cU92X4u5ao3yG/KUYpDEmF9EtycwVs3lT4wp0+ct8sZOxaDAtMCb7Sxwkfm03czeg3UMEFUz7FysUsnS/jFocgkBve/2bf8wje5WyTZLGVNz7iP+uhePN1IV80j/+9gwutMnJp6Y2cUKsWjaKEbwn611ZjhH0sb2PQKBgQDOgj3oit7sJX37pnpgbnWzUcPzE5HJfRUsYrShDOmjLu/8N6wRnyusG+xddtKYK9FewqKmb1u3+PsXbfQrCqykRm0bdanyTidPrzh/mp4e/zm9RxxhEwk7XrttkyrCZXusVMm2+NOhnEGm6MiAOx+2zb4YfYWUhuI1XGklxScsvQKBgGJzqYcXN4O8EMVWuszfk7SrC/MXouDeijdNVeEgCDVAnXLzQH2wScAuPgo6lLtylDVrcvkicVi3CeedyFyhCmFT6Vymq/n+Pa2Klqm0AN98jyZkL1AXfC3Ie38hcw/d8J4A8TKXB4SzEYhwx9Y7hACt9SivaqUb2+xtMrIiUlWZAoGAbLd4bCIf9eZPCtq79mRwpnTXWfLlf1PQf8t/GII5xeUCBqAwgB5x2Wvh5dqWR/JZiS+ifUiG2rXDSrRiJP67oMhKzHgHfj7Sx0qRzevSbrMi7JixQhHJfG4E8kzV5/2RPEpu31rj32Lp1TsbwxZdPdnWyAHc/zJ7iGgcGvxOAWkCgYBljmBcC5+DcoKsN3SbmCd49Uhm+kERXs5wpHLZiDw91Rgi/Rp67E/H2CYmsI7ANKR9Qrbc0hFMtKWIXdIzDLUN3lE9KCdjLxaY/BwW/jtkhqGaoB1dreRXZE+bESC6a9QdCNF0bX/leK3IpPjUZUOaeNC4zz0intQwhxIxyKjPpQ==";

    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAnekiUMB4X6tfn3WZtWN2CcBaEuxGPRAUFa6Wnct1NMQ6fQNTstL3NNbFvPIYjmOCbZhWXZFJuzwbxr4kfGLoN2XQPC6ZiQy2Hwr9cOt4qbs+czmrliEGI33+Xm/ANWmNh0/Yz02xB/Me0NXvnT8Vt4uAnpFX50b6ZoHMGGEnyynb+NhjuKuboB5+xz4L6v13l/v/z22/ZRovQKQ7qz/fHwjulnlgQBh1nbchFpaIg1dO4pZIDknnD5vPlgECUPM8/TbO2092LGQv0bJlsc0LWhGg8Lkyf9Xqobm3Pt+W+s1iLaMGWC9z2nDdzLkKEwtWLZjWQp8yiwR1hCvDunm7fQIDAQAB";

    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "http://工程公网访问地址/alipay.trade.page.pay-JAVA-UTF-8/notify_url.jsp";

    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String return_url = "http://localhost:8080/paySuccess";

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

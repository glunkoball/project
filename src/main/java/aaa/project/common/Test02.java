package aaa.project.common;

import org.apache.shiro.crypto.hash.SimpleHash;

/**
 * 非对称加密
 */
public class Test02 {
    public static void main(String[] args) {
        //要加密的明文 加盐
        String str ="123";
        //8e109f0f40ca72a15e05cc22786f8e6
        SimpleHash sh = new  SimpleHash("MD5",str,"123",10);
        System.out.println("加密后的字符串："+sh.toString());
    }
}

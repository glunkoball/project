package aaa.project.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 彭
 * 自定义的测试方法
 *
 */
public class Test {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        String format = sdf.format(date);
        System.out.println(format);
    }
}

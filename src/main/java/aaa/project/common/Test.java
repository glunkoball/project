package aaa.project.common;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test {
    public static void main(String[] args) throws ParseException {
        String a="2019-07-01";
        //字符串转date
        SimpleDateFormat sm=new SimpleDateFormat("yyyy-MM-dd");
        Date parse = sm.parse(a);
        System.out.println(parse);


        Calendar c=Calendar.getInstance();
        c.setTime(parse);
        c.add(Calendar.MONTH,1);
        Date time = c.getTime();
        System.out.println(time);
        //date转字符串
        String ss = sm.format(time);
        System.out.println(ss);
    }
}

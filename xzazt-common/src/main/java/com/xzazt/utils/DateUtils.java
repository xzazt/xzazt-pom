package com.xzazt.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtils {

    private static final String format = "yyyyMMddHHmmss";

    /**
     * 获取当前时间
     * @return
     */
    private static Date getCurrentDate(){
        Calendar instance = Calendar.getInstance();
        Date date = instance.getTime();
        return date;
    }
    private static String dateParseToString(Date date){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
        String format = simpleDateFormat.format(date);
        return format;
    }
    private static String dateParseToString(Date date,String pattern){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String format = simpleDateFormat.format(date);
        return format;
    }
    private static Date getCurrentFirstTime(){
        Calendar instance = Calendar.getInstance();
        instance.set(Calendar.HOUR_OF_DAY,0);
        instance.set(Calendar.MINUTE,0);
        instance.set(Calendar.SECOND,0);
        Date time = instance.getTime();
        return time;
    }
    private static Date getCurrentLastTime(){
        Calendar instance = Calendar.getInstance();
        instance.set(Calendar.HOUR_OF_DAY,23);
        instance.set(Calendar.MINUTE,59);
        instance.set(Calendar.SECOND,59);
        Date time = instance.getTime();
        return time;
    }

    public static void main(String[] args) {
        System.out.println(dateParseToString(getCurrentLastTime(),"yyyy-MM-dd HH:mm:ss"));
        System.out.println(dateParseToString(getCurrentFirstTime(),"yyyy-MM-dd HH:mm:ss"));
    }
}

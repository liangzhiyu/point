package com.liam.point.util;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @author: liangzy
 * @date: 2019/01/07 下午2:59
 * @desc: java8 时间操作
 */
public class DateTimeUtil {


    /**
     * @author: liangzy
     * @date: 19-1-7 上午10:23
     * @param: [days]
     * @return: java.time.LocalDateTime
     * @desc: 当前时间增加days天
     */
    public static LocalDateTime plusDays(Integer days){
        LocalDateTime localDateTime = LocalDateTime.now();
        return localDateTime.plusDays(days);
    }


    /**
     * @author: liangzy
     * @date: 19-1-7 下午5:20
     * @param: [localDateTime]
     * @return: java.util.Date
     * @desc: 转换LocalDateTime为Date
     */
    public static Date convertLocalDateTimeToDate(LocalDateTime localDateTime){
        ZoneId zoneId = ZoneId.systemDefault();
        ZonedDateTime zdt = localDateTime.atZone(zoneId);
        Date date = Date.from(zdt.toInstant());
        return date;
    }


    /**
     * @author: liangzy
     * @date: 19-1-7 下午3:00
     * @param: [timestamp]
     * @return: java.time.LocalDateTime
     * @desc: 将long类型的timestamp转为LocalDateTime
     */
    public static LocalDateTime convertTimestampToLocalDateTime(long timestamp) {
        Instant instant = Instant.ofEpochMilli(timestamp);
        ZoneId zone = ZoneId.systemDefault();
        return LocalDateTime.ofInstant(instant, zone);
    }


    /**
     * @author: liangzy
     * @date: 19-1-7 下午5:24
     * @param: [thisEpDay, localDateTime]
     * @return: boolean
     * @desc: 判断时间前后（currentDateTime是否在localDateTime之后）
     */
    public static boolean isAfterOfCurrentDateTime(LocalDateTime localDateTime){
        LocalDateTime currentDateTime = LocalDateTime.now();
        return currentDateTime.isAfter(localDateTime);
    }


    /**
     * @author: liangzy
     * @date: 19-1-11 上午11:25
     * @param: [localDateTime]
     * @return: java.lang.String
     * @desc: 获取当前日期
     */
    public static String getCurrentDate(){
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return currentDate.format(formatter);
    }

}

package com.liam.point.util;

import java.math.BigDecimal;

/**
 * @author: liangzy
 * @date: 2019/01/18 下午4:14
 * @desc: 算术工具
 */
public class ArithUtil {
    public static void main(String[] args) {
        System.out.println( Math.round(-1.5));
    }

    private static final int DEF_DIV_SCALE = 10;

    /**
     * @author: liangzy
     * @date: 19-1-18 下午4:18
     * @param: [v1, v2]
     * @return: double
     * @desc: 相加
     */
    public static Double add(double v1, double v2) {
        BigDecimal b1 = new BigDecimal(Double.toString(v1));
        BigDecimal b2 = new BigDecimal(Double.toString(v2));
        return b1.add(b2).doubleValue();
    }


    /**
     * @author: liangzy
     * @date: 19-1-18 下午4:37
     * @param: [v1被减数, v2减数]
     * @return: double
     * @desc: 相减
     */
    public static Double sub(double v1, double v2) {
        BigDecimal b1 = new BigDecimal(Double.toString(v1));
        BigDecimal b2 = new BigDecimal(Double.toString(v2));
        return b1.subtract(b2).doubleValue();
    }


    /**
     * @author: liangzy
     * @date: 19-1-18 下午4:40
     * @param: [v1, v2]
     * @return: double
     * @desc: 相乘
     */
    public static Double mul(double v1, double v2) {
        BigDecimal b1 = new BigDecimal(Double.toString(v1));
        BigDecimal b2 = new BigDecimal(Double.toString(v2));
        return b1.multiply(b2).doubleValue();
    }


    /**
     * @author: liangzy
     * @date: 19-1-18 下午4:38
     * @param: [v1被除数, v2除数]
     * @return: double
     * @desc: 提供（相对）精确的除法运算，当发生除不尽的情况时，精确到小数点以后10位，以后的数字四舍五入。
     */
    public static Double div(double v1, double v2) {
        return div(v1, v2, DEF_DIV_SCALE);
    }


    /**
     * @author: liangzy
     * @date: 19-1-18 下午4:45
     * @param: [v1被除数, 除数, scale需要精确到小数点以后几位]
     * @return: double
     * @desc: 提供（相对）精确的除法运算。当发生除不尽的情况时，由scale参数指定精度，以后的数字四舍五入。
     */
    public static Double div(double v1, double v2, int scale) {
        if (scale < 0) {
            throw new IllegalArgumentException(
                    "The scale must be a positive integer or zero");
        }
        BigDecimal b1 = new BigDecimal(Double.toString(v1));
        BigDecimal b2 = new BigDecimal(Double.toString(v2));
        return b2.divide(b1, scale, BigDecimal.ROUND_HALF_UP).doubleValue();
    }


    /**
     * @author: liangzy
     * @date: 19-1-18 下午4:43
     * @param: [v需要四舍五入的数字, scale小数点后保留几位]
     * @return: double
     * @desc: 提供精确的小数位四舍五入处理
     */
    public static Double round(double v, int scale) {
        if (scale < 0) {
            throw new IllegalArgumentException("The scale must be a positive integer or zero");
        }
        BigDecimal b1 = new BigDecimal(Double.toString(v));
        BigDecimal b2 = new BigDecimal("1");
        return b1.divide(b2, scale, BigDecimal.ROUND_HALF_UP).doubleValue();
    }


    /**
     * @author: liangzy
     * @date: 19-1-22 下午5:17
     * @param: [v1, scale]
     * @return: double
     * @desc: 直接删除多余的小数位，如2.35会变成2.3
     */
    public static Double scale(double v1, int scale) {
        BigDecimal b1 = new BigDecimal(Double.toString(v1));
        return b1.setScale(scale, BigDecimal.ROUND_DOWN).doubleValue();
    }

    /**
     * @author: liangzy
     * @date: 19-1-28 上午11:16
     * @param: [num]
     * @return: java.lang.Integer
     * @desc: 相反数
     */
    public static Integer contrary(Integer num) {
        return num * -1;
    }
}

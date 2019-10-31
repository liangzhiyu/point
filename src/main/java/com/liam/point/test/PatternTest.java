package com.liam.point.test;

import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternTest {

    public static void main(String[] args) {
        System.out.println(handleNotificationContent2("<a href=\"http\">6KeMMlU</a> 邀请你对 Merge Request <a href='http://codingcorp.coding.com/p/test/git/merge/1'>#1 test</a> 进行评审", "仓库一号"));
        System.out.println(handleNotificationContent2("<a href=\"http://codingcorp.coding.com/u/coding\">coding</a> 允许了合并请求 <a href='http://codingcorp.coding.com/p/test/git/merge/1'>#1 test</a> 并授权了合并权限","仓库一号"));
        System.out.println(handleNotificationContent2("<a href=\"http://codingcorp.coding.com/u/test1\">6KeMMlU</a> 合并了项目 <a href='http://codingcorp.coding.com/p/test'>test</a> 的合并请求 : <a href='http://codingcorp.coding.com/p/test/git/merge/1'>#1 test</a>","仓库一号"));
//        System.out.println(handleNotificationContent("</a> 允许了合并请求 <a href='http://codingcorp.coding.com/p/test/git/merge/1'>#1 test</a> 并授权了合并权限","仓库二号"));
    }

    public static String handleNotificationContent2(String content, String depotName){
        StringBuilder sb = new StringBuilder(content);

        Pattern pattern = Pattern.compile("<a.*?/a>");
        Matcher matcher = pattern.matcher(content);
        if (matcher.find()) {

            System.out.println(matcher.groupCount() +"  "+matcher.start()+"  end   "+matcher.end()+"  " +matcher.group()+ "  " );
        }
        return sb.toString();
    }
}

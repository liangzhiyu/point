package com.liam.point.test;

import com.liam.point.design.proxy.statics.Image;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.BlockingDeque;

import lombok.Data;

public class LambdaTest {





        public static void main(String[] args) throws IOException {
            System.out.println("内外ip：" + getIp());
            System.out.println("外网ip：" + getMyIP());
        }

        /**
         * 获取本机内网ip
         * @return
         * @throws UnknownHostException
         */
        private static String getIp() throws UnknownHostException {
            String ip = InetAddress.getLocalHost().getHostAddress();

            return ip;
        }

        /**
         * 获取本机外网ip
         * @return
         */
        private static String getMyIP() throws IOException {
            String url = "http://ip.chinaz.com/getip.aspx";
            InputStream is = new URL(url).openStream();
            try {
                BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
                StringBuilder sb = new StringBuilder();
                int cp;
                while ((cp = rd.read()) != -1) {
                    sb.append((char) cp);
                }
                String msg = sb.toString();
                String[] msgs = msg.split(",");
                String[] ips = msgs[0].split(":");
                return ips[1].substring(1, ips[1].length()-1);
            } finally {
                is.close();
            }
        }
}

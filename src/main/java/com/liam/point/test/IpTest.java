package com.liam.point.test;

import org.apache.commons.net.util.SubnetUtils;

import java.util.Arrays;

public class IpTest {

    public static void main(String[] args) {

        String subnet1 = "192.168.0.3/78";
        SubnetUtils utils1 = new SubnetUtils(subnet1);

        System.out.println(utils1.getInfo().isInRange("192.168.0.4"));


        String subnet = "192.168.38.1/31";

        SubnetUtils utils = new SubnetUtils(subnet);

        SubnetUtils.SubnetInfo info = utils.getInfo();
        System.out.printf("Subnet Information for %s:\n", subnet);

        System.out.println("--------------------------------------");

        System.out.printf("IP Address:\t\t\t%s\t[%s]\n", info.getAddress(),

                Integer.toBinaryString(info.asInteger(info.getAddress())));

        System.out.printf("Netmask:\t\t\t%s\t[%s]\n", info.getNetmask(),

                Integer.toBinaryString(info.asInteger(info.getNetmask())));

        System.out.printf("CIDR Representation:\t\t%s\n\n", info.getCidrSignature());


        System.out.printf("Supplied IP Address:\t\t%s\n\n", info.getAddress());


        System.out.printf("Network Address:\t\t%s\t[%s]\n", info.getNetworkAddress(),

                Integer.toBinaryString(info.asInteger(info.getNetworkAddress())));

        System.out.printf("Broadcast Address:\t\t%s\t[%s]\n", info.getBroadcastAddress(),

                Integer.toBinaryString(info.asInteger(info.getBroadcastAddress())));

        System.out.printf("Low Address:\t\t\t%s\t[%s]\n", info.getLowAddress(),

                Integer.toBinaryString(info.asInteger(info.getLowAddress())));

        System.out.printf("High Address:\t\t\t%s\t[%s]\n", info.getHighAddress(),

                Integer.toBinaryString(info.asInteger(info.getHighAddress())));


        System.out.printf("Total usable addresses: \t%d\n", Integer.valueOf(info.getAddressCount()));

        System.out.printf("Address List: %s\n\n", Arrays.toString(info.getAllAddresses()));


        System.out.println("全部地址：" + Arrays.toString(info.getAllAddresses()));
    }
}

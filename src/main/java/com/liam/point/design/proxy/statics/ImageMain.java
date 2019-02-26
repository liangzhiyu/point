package com.liam.point.design.proxy.statics;

/**
 * @author: liangzy
 * @date: 2019/02/26 下午5:45
 * @desc:
 */
public class ImageMain {


    public static void main(String[] args) {
        Image image = new ProxyImage("tree.jpg");
        image.display();
    }
}

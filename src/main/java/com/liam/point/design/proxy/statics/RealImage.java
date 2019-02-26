package com.liam.point.design.proxy.statics;

/**
 * @author: liangzy
 * @date: 2019/02/26 下午5:41
 * @desc:
 */
public class RealImage implements Image {

    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        System.out.println("displaying " + fileName);
    }

}

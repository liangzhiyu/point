package com.liam.point.design.proxy.statics;

/**
 * @author: liangzy
 * @date: 2019/02/26 下午5:43
 * @desc:
 */
public class ProxyImage implements Image {

    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }



    @Override
    public void display() {
        if (null == realImage) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}

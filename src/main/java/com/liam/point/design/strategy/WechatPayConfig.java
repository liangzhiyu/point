package com.liam.point.design.strategy;

import lombok.Data;

/**
 * @author: liangzy
 * @date: 2019/03/12 下午2:46
 * @desc:
 */
@Data
public class WechatPayConfig {
    private String appid;
    private String notifyUrl;
    private String mchid;

    @Override
    public String toString() {
        return "WechatPayConfig{" +
                "appid='" + appid + '\'' +
                ", notifyUrl='" + notifyUrl + '\'' +
                ", mchid='" + mchid + '\'' +
                '}';
    }
}

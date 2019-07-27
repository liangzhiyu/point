package com.liam.point.concurrence;

/**
 * @author: liangzy
 * @date: 2019/07/15 上午10:08
 * @desc:
 */
public class DeadLock {

    public static void main(String[] args) {
        new Runnable() {
            @Override
            public void run() {

            }
        }
    }
}

package com.liam.point.concurrence;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author: liangzy
 * @date: 2019/02/19 上午10:32
 * @desc:
 */
public class CountDownLantchDemo {

//    static AtomicInteger a = new AtomicInteger(100);
    static Integer  a =100;
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executors = Executors.newFixedThreadPool(100);
        CountDownLatch countDownLatch = new CountDownLatch(100);
        for (int i = 0; i < 100; i++) {
            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    a--;
                    countDownLatch.countDown();
                    System.out.println(Thread.currentThread().getName() + " " + a);
                }

            };
            executors.execute(runnable);
        }

        countDownLatch.await();
        System.out.println("fffffffffffff" + a);
    }
}

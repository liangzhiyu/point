package com.liam.point.concurrence;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author: liangzy
 * @date: 2019/02/19 上午10:32
 * @desc:
 */
public class CountDownLantchDemo {

    static Integer a = 1000;

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executors = Executors.newFixedThreadPool(1000);
        CountDownLatch countDownLatch = new CountDownLatch(1000);
        CountDownLantchDemo countDownLantchDemo = new CountDownLantchDemo();
        for (int i = 0; i < 1000; i++) {
            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    countDownLantchDemo.decrement();
                    countDownLatch.countDown();
                    System.out.println(Thread.currentThread().getName() + " " + a);
                }
            };
            executors.execute(runnable);
        }

        countDownLatch.await();
        System.out.println("fffffffffffff" + a);
    }

    public synchronized void decrement() {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        a--;
    }
}

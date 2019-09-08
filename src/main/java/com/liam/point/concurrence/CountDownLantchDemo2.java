package com.liam.point.concurrence;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author: liangzy
 * @date: 2019/02/19 上午10:32
 * @desc: 模拟并发
 */
public class CountDownLantchDemo2 {

    private static final ReentrantLock lock = new ReentrantLock();

    public static void main(String[] args) throws Exception {
        concurrence();
    }

    public static void concurrence() throws Exception {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1000,1000,1,
                TimeUnit.SECONDS,new LinkedBlockingQueue());
        CountDownLatch countDownLatch = new CountDownLatch(1000);
        CountDownLatch gate = new CountDownLatch(1);
        for (int i = 0; i < 1000; i++) {
            threadPoolExecutor.submit(() -> {
                System.out.println(Thread.currentThread().getName()+" is reading");
                //让所有线程（用户）处于准备状态
                gate.await();
                int stock = getStock();
                countDownLatch.countDown();
                return stock;
            });
        }
        //开抢
        gate.countDown();
        //阻塞等待所有线程（用户）完成
        countDownLatch.await();
        threadPoolExecutor.shutdown();
        System.out.println("剩余库存"+stock);
    }

    static int stock = 10;
    public static Integer getStock(){
        lock.lock();
        try {
            System.out.println("即将下单，当前库存为："+stock);
            if(stock<=0){
                return stock;
            }

            stock--;
            System.out.println(Thread.currentThread().getName() + "库存剩余" + stock+"  ,"+LocalTime.now());
            return stock;
        }finally {
            lock.unlock();
        }
    }
}

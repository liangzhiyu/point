package com.liam.point.concurrence;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class MyCallable implements Callable<Integer> {

    public static void main(String[] args) throws Exception {
        MyCallable myCallable = new MyCallable();
        FutureTask<Integer> futureTask = new FutureTask(myCallable);
        Thread thread = new Thread(futureTask);
        thread.start();
        System.out.println("end");
    }


    @Override
    public Integer call() throws Exception {
        Thread.sleep(3000);
        System.out.println("in 666");
        return 666;
    }
}

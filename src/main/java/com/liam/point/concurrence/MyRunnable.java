package com.liam.point.concurrence;

public class MyRunnable implements Runnable {

    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();
        System.out.println("end");
        thread.interrupt();
    }


    @Override
    public void run() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("I'm MyRunnable");
    }
}

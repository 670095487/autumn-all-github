package com.yun.autumn.thread.th04;

import org.junit.Test;

/**
 * ThreadJoin
 *
 * @Author: Bff
 * @CreateTime: 2020-04-23
 * @Description: thread join
 */
@SuppressWarnings("all")
public class ThreadJoin {

    public static void main(String[] args) {
        try {
            /**
             * 会让你的程序一直处于运行状态，
             * 代码的意思就是当前线程在等待它自己结束以后再结束
             * main方法在等待main方法结束以后再结束自己，所以这是一个死循环，
             * 想一下httpClient的监听机制
             */
            Thread.currentThread().join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    @Test
    public void thread01() {
        Thread thread01 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println("thread01¢¢的名字==>" + Thread.currentThread().getName());
            }
        });
        thread01.start();
        try {
            thread01.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Thread thread02 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println("thread02的名字==>" + Thread.currentThread().getName());
            }
        });
        thread02.start();
    }
}

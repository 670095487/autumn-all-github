package com.yun.autumn.test;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * ThreadPoolClient
 *
 * @author: yunN
 * @createTime: 2021/01/18 14:57:25
 * @description:
 */
public class ThreadPoolClient {


    private final static Executor pool = Executors.newFixedThreadPool(5);

    public static void main(String[] args) {
        //使用一个新线程去执行任务
        pool.execute(() -> {
            System.out.println(Thread.currentThread().getName());
        });
        //等待线程池内线程完成所有任务才会关闭线程池
        ((ExecutorService) pool).shutdown();
    }
}

package com.yun.autumn.design.strategy;

/**
 * Comparator
 *
 * @Author: Bff
 * @CreateTime: 2020-07-07
 * @Description: 策略模式接口
 */
@FunctionalInterface
public interface Comparator<T> {
    /**
     * 比较大小：
     * o1 > o2 return 1
     * o1 < o2 return -1
     * o1 = o2 return 0
     *
     * @param o1
     * @param o2
     * @return
     */
    int compare(T o1, T o2);


    default void sayHello() {
        System.out.println("1.8以后接口里可以有默认方法实现");
    }
}

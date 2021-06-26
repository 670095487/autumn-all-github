package com.yunn.autumn.designpatterns.strategy;

/**
 * CatComparator
 *
 * @Author: Bff
 * @CreateTime: 2020-07-07
 * @Description: 猫类型的比较实现
 */
public class CatComparator implements Comparator<Cat> {
    /**
     * 按照猫咪的身高进行排序
     *
     * @param o1
     * @param o2
     * @return
     */
    @Override
    public int compare(Cat o1, Cat o2) {
        if (o1.getHeight() > o2.getHeight()) {
            return 1;
        } else if (o1.getHeight() < o2.getHeight()) {
            return -1;
        } else {
            return 0;
        }
    }
}

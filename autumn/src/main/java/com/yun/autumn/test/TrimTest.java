package com.yun.autumn.test;

import org.junit.Test;

import java.math.BigDecimal;
import java.util.stream.Stream;

/**
 * TrimTest
 *
 * @author: yunN
 * @createTime: 2021/01/11
 * @description:
 */
public class TrimTest {

    /**
     * 去除字符串中的空格和换行符
     *
     * @param args /
     */
    public static void main(String[] args) {
        String str = "20000|1000" +
                "|1000 ";
        String trim = str.trim();
        System.out.println(trim);
        String[] split = trim.split("\\|");
        Stream.of(split).forEach(System.out::println);
        BigDecimal bigDecimal = new BigDecimal(split[1]);
        System.out.println(bigDecimal);
    }

    @Test
    public void get() {
        BigDecimal bigDecimal = BigDecimal.ZERO ;
        System.out.println(bigDecimal);
        System.out.println(bigDecimal.abs());
    }
}

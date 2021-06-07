package com.yun.autumn.design.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Angle
 *
 * @author: yunN
 * @createTime: 2020/09/04
 * @description: 天使是怎么移动的
 * 本示例代码将演示如何使用动态代理
 */
public class Angle implements Movable {
    @Override
    public void move() {
        System.out.println("天使，使用魔法进行空间移动");
    }

    public static void main(String[] args) {
        Angle angle1 = new Angle();
        System.getProperties().put("jdk.proxy.ProxyGenerator.saveGeneratedFiles", "true");
        Object obj = Proxy.newProxyInstance(Angle.class.getClassLoader(),
                new Class[]{Movable.class},
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("proxy_start");
                        method.invoke(angle1, args);
                        System.out.println("proxy_end");
                        return null;
                    }
                });
        // obj.move();
    }
}



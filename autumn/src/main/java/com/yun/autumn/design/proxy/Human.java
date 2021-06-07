package com.yun.autumn.design.proxy;

/**
 * Humen
 *
 * @author: yunN
 * @createTime: 2020/09/04
 * @description: 人类如何移动 ？
 * 本处代码为静态代理，被代理对象是固定的
 */
@SuppressWarnings("all")
public class Human implements Movable {


    @Override
    public void move() {
        System.out.println("人类，骑马移动");
    }

    public static void main(String[] args) {
        new HumanProxyA(//代理a
                new HumanProxyB(//代理b
                        new Human()//本身
                )
        )
                .move();
    }

}

class HumanProxyA implements Movable {
    Movable movable;

    public HumanProxyA(Movable movable) {
        this.movable = movable;
    }

    @Override
    public void move() {
        System.out.println("代理A开始");
        movable.move();
        System.out.println("代理A结束");
    }
}

class HumanProxyB implements Movable {
    Movable movable;

    public HumanProxyB(Movable movable) {
        this.movable = movable;
    }

    @Override
    public void move() {
        System.out.println("代理B开始");
        movable.move();
        System.out.println("代理B结束");
    }
}
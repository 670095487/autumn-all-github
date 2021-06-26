package com.yun.hellospringbootstarter.service;

/**
 * Created by yunN on 2021/05/31.
 */
public class HelloworldService {
    private String words;

    private String getWords() {
        return words;
    }

    public void setWords(String words) {
        this.words = words;
    }

    public String sayHello() {
        return "hello, " + words;
    }

}

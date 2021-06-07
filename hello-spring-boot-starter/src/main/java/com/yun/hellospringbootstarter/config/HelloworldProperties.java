package com.yun.hellospringbootstarter.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by yunN on 2021/05/31.
 */

@ConfigurationProperties(prefix = "helloworld")
@SuppressWarnings("all")
public class HelloworldProperties {
    public static final String DEFAULT_WORDS = "world";

    private String words = DEFAULT_WORDS;

    public String getWords() {
        return words;
    }

    public void setWords(String words) {
        this.words = words;
    }
}

package com.yun.autumn.design.mystrategy;

/**
 * CommonMsgReq
 *
 * @Author: yunN
 * @CreateTime: 2020/08/25
 * @Description: 公共请求报文类
 */
public class CommonMsgReq {

    private String userName;

    private String passWord;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}

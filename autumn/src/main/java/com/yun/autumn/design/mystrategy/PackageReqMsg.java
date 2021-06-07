package com.yun.autumn.design.mystrategy;

/**
 * PackageReqMsg
 *
 * @Author: yunN
 * @CreateTime: 2020/08/25
 * @Description: 打包请求同一个接口的报文--提供打包逻辑【共同部分】
 */
public interface PackageReqMsg<T> {
    /**
     * 假设所有请求commonService的应用都要将自己的报文转化为CommonMsgReq格式的
     *
     * @param t
     * @return
     */
    CommonMsgReq packageMsgReq(T t);

    /**
     * 相同点抽出来，
     * 不同点各自实现
     */


}

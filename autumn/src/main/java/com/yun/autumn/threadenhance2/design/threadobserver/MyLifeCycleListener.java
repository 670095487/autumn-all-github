package com.yun.autumn.threadenhance2.design.threadobserver;

/**
 * MyLifeCycleListener
 *
 * @author: yunN
 * @createTime: 2021/01/13
 * @description:
 */
public interface MyLifeCycleListener {

    /**
     * 监测事件
     * @param event
     */
    void onEvent(ObserverRunnable.RunnableEvent event);
}

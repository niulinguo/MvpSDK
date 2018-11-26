package com.niles.mvp;

/**
 * Created by Niles
 * Date 2018/11/26 10:38
 * Email niulinguo@163.com
 */
public interface BasePresenter<V extends BaseView> {

    V getView();

    void start();
}

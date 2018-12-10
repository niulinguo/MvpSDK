package com.niles.mvpsdk;

import com.niles.mvp.BasePresenter;

/**
 * Created by Niles
 * Date 2018/12/10 09:19
 * Email niulinguo@163.com
 */
public class MainPresenter implements BasePresenter<MainView> {

    private final MainView mMainView;

    MainPresenter(MainView mainView) {
        mMainView = mainView;
    }

    @Override
    public MainView getView() {
        return mMainView;
    }

    @Override
    public void start() {
        loadData();
    }

    @Override
    public void loadData() {
        getView().showLoadingDialog();
    }
}

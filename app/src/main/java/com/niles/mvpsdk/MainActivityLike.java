package com.niles.mvpsdk;

import android.app.Activity;

import com.niles.mvp.MvpActivityLike;

/**
 * Created by Niles
 * Date 2018/12/10 09:22
 * Email niulinguo@163.com
 */
public class MainActivityLike extends MvpActivityLike<MainPresenter, MainView> implements MainView {

    @Override
    protected MainPresenter createPresenter() {
        return new MainPresenter(this);
    }

    @Override
    public void onStart(Activity activity) {
        super.onStart(activity);
        mPresenter.start();
    }
}

package com.niles.mvp;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.widget.Toast;

import com.niles.separate.activity.AbsActivityLike;

/**
 * Created by Niles
 * Date 2018/11/26 10:34
 * Email niulinguo@163.com
 */
public abstract class MvpActivityLike<P extends BasePresenter<V>, V extends BaseView> extends AbsActivityLike implements BaseView {

    protected P mPresenter;
    private Activity mActivity;

    @Override
    public void onCreate(Activity activity, @Nullable Bundle savedInstanceState) {
        super.onCreate(activity, savedInstanceState);
        mActivity = activity;
        mPresenter = createPresenter();
    }

    protected abstract P createPresenter();

    @Override
    public void log(String tag, String msg) {
        if (BuildConfig.DEBUG) {
            Log.i(tag, msg);
        }
    }

    @Override
    public void toast(String msg) {
        Toast.makeText(mActivity, msg, Toast.LENGTH_SHORT).show();
    }
}

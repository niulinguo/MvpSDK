package com.niles.mvp;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.niles.separate.activity.AbsActivityLike;

/**
 * Created by Niles
 * Date 2018/11/26 10:34
 * Email niulinguo@163.com
 */
public class MvpActivityLike<P extends BasePresenter<V>, V extends BaseView> extends AbsActivityLike implements BaseView {

    protected P mPresenter;
    protected Activity mActivity;
    private View mProgressBar;
    private ViewGroup mContentView;

    @Override
    public void onCreate(Activity activity, @Nullable Bundle savedInstanceState) {
        super.onCreate(activity, savedInstanceState);
        mActivity = activity;
        mPresenter = createPresenter();

        mContentView = mActivity.findViewById(android.R.id.content);
    }

    @Override
    public void onDestroy(Activity activity) {
        super.onDestroy(activity);
        mActivity = null;
    }

    protected P createPresenter() {
        return null;
    }

    @Override
    public void log(String tag, String msg) {
        if (BuildConfig.DEBUG) {
            Log.i(tag, msg);
        }
    }

    @Override
    public void toast(String msg) {
        if (mActivity != null) {
            Toast.makeText(mActivity, msg, Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void showLoadingDialog() {
        if (mProgressBar == null) {
            mProgressBar = new ProgressBar(mActivity);
            mContentView.addView(mProgressBar);
        } else {
            mProgressBar.setVisibility(View.VISIBLE);
        }
    }

    @Override
    public void hideLoadingDialog() {
        if (mProgressBar != null) {
            mContentView.removeView(mProgressBar);
        }
    }
}

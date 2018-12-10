package com.niles.mvpsdk;

import android.os.Bundle;
import android.view.View;

import com.niles.separate.activity.ActivityLikeManager;
import com.niles.separate.activity.SeparateActivity;

public class MainActivity extends SeparateActivity {

    @Override
    protected void onRegisterActivityLikeManager(ActivityLikeManager likeManager) {
        super.onRegisterActivityLikeManager(likeManager);
        likeManager.register(new MainActivityLike());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onShowDialogClicked(View view) {

    }
}

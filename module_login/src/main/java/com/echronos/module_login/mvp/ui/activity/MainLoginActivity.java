package com.echronos.module_login.mvp.ui.activity;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.jess.arms.base.BaseActivity;
import com.jess.arms.di.component.AppComponent;
import com.jess.arms.utils.ArmsUtils;

import com.echronos.module_login.di.component.DaggerMainLoginComponent;
import com.echronos.module_login.mvp.contract.MainLoginContract;
import com.echronos.module_login.mvp.presenter.MainLoginPresenter;

import com.echronos.module_login.R;


import static com.jess.arms.utils.Preconditions.checkNotNull;


/**
 * ================================================
 * 作者：hexingbo
 * 时间：08/13/2020 14:35
 * Description:
 * ================================================
 */
public class MainLoginActivity extends BaseActivity<MainLoginPresenter> implements MainLoginContract.View {

    @Override
    public void setupActivityComponent(@NonNull AppComponent appComponent) {
        DaggerMainLoginComponent //如找不到该类,请编译一下项目
                .builder()
                .appComponent(appComponent)
                .view(this)
                .build()
                .inject(this);
    }

    @Override
    public int initView(@Nullable Bundle savedInstanceState) {
        return R.layout.activity_main_login; //如果你不需要框架帮你设置 setContentView(id) 需要自行设置,请返回 0
    }

    @Override
    public void initData(@Nullable Bundle savedInstanceState) {

    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void showMessage(@NonNull String message) {
        checkNotNull(message);
        ArmsUtils.snackbarText(message);
    }

    @Override
    public void launchActivity(@NonNull Intent intent) {
        checkNotNull(intent);
        ArmsUtils.startActivity(intent);
    }

    @Override
    public void killMyself() {
        finish();
    }
}

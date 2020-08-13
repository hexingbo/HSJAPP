package com.echronos.module_login.mvp.model;

import android.app.Application;

import com.google.gson.Gson;
import com.jess.arms.integration.IRepositoryManager;
import com.jess.arms.mvp.BaseModel;

import com.jess.arms.di.scope.ActivityScope;

import javax.inject.Inject;

import com.echronos.module_login.mvp.contract.MainLoginContract;


/**
 * ================================================
 * 作者：hexingbo
 * 时间：08/13/2020 14:35
 * Description:
 * ================================================
 */
@ActivityScope
public class MainLoginModel extends BaseModel implements MainLoginContract.Model {
    @Inject
    Gson mGson;
    @Inject
    Application mApplication;

    @Inject
    public MainLoginModel(IRepositoryManager repositoryManager) {
        super(repositoryManager);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        this.mGson = null;
        this.mApplication = null;
    }
}
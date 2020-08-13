package com.echronos.module_login.di.module;

import com.jess.arms.di.scope.ActivityScope;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

import com.echronos.module_login.mvp.contract.MainLoginContract;
import com.echronos.module_login.mvp.model.MainLoginModel;


/**
 * ================================================
 * 作者：hexingbo
 * 时间：08/13/2020 14:35
 * Description:
 * ================================================
 */
@Module
public abstract class MainLoginModule {

    @Binds
    abstract MainLoginContract.Model bindMainLoginModel(MainLoginModel model);
}
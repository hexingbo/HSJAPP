package com.echronos.module_login.di.component;

import dagger.BindsInstance;
import dagger.Component;

import com.jess.arms.di.component.AppComponent;

import com.echronos.module_login.di.module.MainLoginModule;
import com.echronos.module_login.mvp.contract.MainLoginContract;

import com.jess.arms.di.scope.ActivityScope;
import com.echronos.module_login.mvp.ui.activity.MainLoginActivity;


/**
 * ================================================
 * 作者：hexingbo
 * 时间：08/13/2020 14:35
 * Description:
 * ================================================
 */
@ActivityScope
@Component(modules = MainLoginModule.class, dependencies = AppComponent.class)
public interface MainLoginComponent {
    void inject(MainLoginActivity activity);

    @Component.Builder
    interface Builder {
        @BindsInstance
        MainLoginComponent.Builder view(MainLoginContract.View view);

        MainLoginComponent.Builder appComponent(AppComponent appComponent);

        MainLoginComponent build();
    }
}
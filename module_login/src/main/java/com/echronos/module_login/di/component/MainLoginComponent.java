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
 * Description:
 * <p>
 * Created by MVPArmsTemplate on 08/13/2020 10:45
 * <a href="mailto:jess.yan.effort@gmail.com">Contact me</a>
 * <a href="https://github.com/JessYanCoding">Follow me</a>
 * <a href="https://github.com/JessYanCoding/MVPArms">Star me</a>
 * <a href="https://github.com/JessYanCoding/MVPArms/wiki">See me</a>
 * <a href="https://github.com/JessYanCoding/MVPArmsTemplate">模版请保持更新</a>
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
package me.jessyan.armscomponent.commonsdk.base.observer;

import com.jess.arms.integration.AppManager;
import com.jess.arms.utils.DataHelper;

import me.jessyan.armscomponent.commonsdk.base.bean.MyHttpResult;
import me.jessyan.armscomponent.commonsdk.core.Constants;
import me.jessyan.armscomponent.commonsdk.http.Api;
import me.jessyan.rxerrorhandler.core.RxErrorHandler;
import me.jessyan.rxerrorhandler.handler.ErrorHandleSubscriber;


/**
 * @Author :hexingbo
 * @Date :2019/10/6
 * @FileName： MyHttpResultObserver
 * @Describe :
 */
public abstract class MyHttpResultObserver<T extends MyHttpResult> extends ErrorHandleSubscriber<T> {

    public MyHttpResultObserver(RxErrorHandler rxErrorHandler) {
        super(rxErrorHandler);
    }

    @Override
    public void onNext(T httpResult) {
        switch (httpResult.getErrcode()) {
            case Api.REQUEST_SUCCESS://请求成功
                onResult(httpResult);
                break;
            case Api.REQUEST_Login_Error://登录失效
                onError(new Throwable("登录失效，请重新登录"));
                break;
            default://其他
                onError(new Throwable(httpResult.getMsg()));
                break;
        }
    }

    public abstract void onResult(T result);

}

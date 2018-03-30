package com.geziwulian.netlibrary;


import com.geziwulian.netlibrary.model.LoginMode;

import java.util.List;

import io.reactivex.Observable;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;


/**
 * Created by yyx on 16/3/1.
 */
public class ApiWrapper extends HttpClient {

    /**
     * 登陆接口
     *
     * @param userName
     * @param password
     * @return
     */
    public Observable<LoginMode> login(String userName, String password) {
        return getService().getLogin(userName, password)
                .compose(this.<LoginMode>applySchedulers());
    }

}

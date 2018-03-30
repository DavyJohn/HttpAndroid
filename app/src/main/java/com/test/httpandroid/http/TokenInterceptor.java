package com.test.httpandroid.http;

import android.util.Log;

import com.test.httpandroid.BaseApplication;

import java.io.IOException;
import java.nio.charset.Charset;

import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.Buffer;
import okio.BufferedSource;
import retrofit2.Call;


/**
 * Created by 腾翔信息 on 2018/3/19.
 */

public class TokenInterceptor  implements Interceptor {
    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();
        Response response = chain.proceed(request);
//        LogUtil.print("response.code=" + response.code());

        if (isTokenExpired(response)) {//根据和服务端的约定判断token过期
//            LogUtil.print("静默自动刷新Token,然后重新请求数据");
            //同步请求方式，获取最新的Token
            String newSession = getNewToken();
            //使用新的Token，创建新的请求
            Request newRequest = chain.request()
                    .newBuilder()
                    .header("Cookie", "JSESSIONID=" + newSession)
                    .build();
            //重新请求
            return chain.proceed(newRequest);
        }
        return response;
    }

    /**
     * 根据Response，判断Token是否失效
     *
     * @param response
     * @return
     */
    private boolean isTokenExpired(Response response) {
        if (response.code() == 404) {
            return true;
        }
        return false;
    }

    /**
     * 同步请求方式，获取最新的Token
     *
     * @return
     */
    private String getNewToken() throws IOException {
//        // 通过一个特定的接口获取新的token，此处要用到同步的retrofit请求
//        Response_Login loginInfo = CacheManager.restoreLoginInfo(this);
//        String username = loginInfo.getUserName();
//        String password = loginInfo.getPassword();
//
//        Call<Response_Login> call = WebHelper.getSyncInterface().synclogin(new Request_Login(username, password));
//        loginInfo = call.execute().body();
//
//        loginInfo.setPassword(password);
//        CacheManager.saveLoginInfo(loginInfo);
//        return loginInfo.getSession();
        return null;
    }
}

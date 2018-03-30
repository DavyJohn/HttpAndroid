package com.test.httpandroid.http;



import com.test.httpandroid.mode.LoginMode;
import com.test.httpandroid.mode.collectMode;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;


/**
 * Created by 腾翔信息 on 2018/3/19.
 */

public interface  ApiService {
//    @GET("/api/shop/member/AppBylogin.do")
//    Call<LoginMode> login(@Query("username")String username, @Query("password")String password);
//    @GET("/api/shop/collect/add-collect.do")
//    Call<collectMode> collect(@Query("goods_id") String id );

    @GET("/api/shop/member/AppBylogin.do")
    Observable<LoginMode> login(@Query("username")String username, @Query("password")String password);
    @GET("/api/shop/collect/add-collect.do")
    Observable<collectMode> collect(@Query("goods_id") String id );
}

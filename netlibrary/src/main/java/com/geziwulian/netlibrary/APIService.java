package com.geziwulian.netlibrary;

import android.database.Observable;

import com.geziwulian.netlibrary.model.LoginMode;


import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by yyx on 16/3/1.
 */
public interface APIService {
    @FormUrlEncoded
    @POST("/api/shop/member/AppBylogin.do")
    Observable<LoginMode> getLogin(@Query("username")String username, @Query("password") String password);

}

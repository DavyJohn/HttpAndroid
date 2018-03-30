package com.test.httpandroid;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.test.httpandroid.http.ApiManager;
import com.test.httpandroid.mode.LoginMode;


import rx.Subscriber;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private EditText mName,mPass;
    private Button mLogin,mSc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mName = findViewById(R.id.name);
        mPass = findViewById(R.id.pass);
        mLogin = findViewById(R.id.login);
        mSc = findViewById(R.id.sc);
        mLogin.setOnClickListener(this);
        mSc.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.login :
                ApiManager manager = ApiManager.getInstence();
                Subscription observable =  manager.getService(MainActivity.this).login("13218677730","111111")
                        .subscribeOn(Schedulers.io())
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribe(new Subscriber<LoginMode>() {
                            @Override
                            public void onCompleted() {
                                //wancheng
                            }

                            @Override
                            public void onError(Throwable e) {
                                System.out.print(e);
                            }

                            @Override
                            public void onNext(LoginMode loginMode) {
                                System.out.print(loginMode);
                            }
                        });

//                Call<LoginMode> call  = manager.getService(MainActivity.this).login("13218677730","111111");
//                call.enqueue(new Callback<LoginMode>() {
//                    @Override
//                    public void onResponse(Call<LoginMode> call, Response<LoginMode> response) {
//                        Toast.makeText(MainActivity.this,response.body().getMessage(),Toast.LENGTH_LONG).show();
//                    }
//
//                    @Override
//                    public void onFailure(Call<LoginMode> call, Throwable t) {
//
//                    }
//                });
                break;
            case R.id.sc :
                ApiManager apiManager = ApiManager.getInstence();
//                Call<collectMode> call1 = apiManager.getService(MainActivity.this).collect(mName.getText().toString());
//                call1.enqueue(new Callback<collectMode>() {
//                    @Override
//                    public void onResponse(Call<collectMode> call, Response<collectMode> response) {
//                        System.out.print(response);
//                        Toast.makeText(MainActivity.this,response.body().getMessage(),Toast.LENGTH_LONG).show();
//                    }
//
//                    @Override
//                    public void onFailure(Call<collectMode> call, Throwable t) {
//
//                    }
//                });
                break;
        }
    }
}

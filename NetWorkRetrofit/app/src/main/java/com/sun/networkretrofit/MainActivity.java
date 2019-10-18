package com.sun.networkretrofit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.sun.networkretrofit.entity.TeacherEntity;
import com.sun.networkretrofit.http.CallBackListener;
import com.sun.networkretrofit.http.HandlerCallBack;
import com.sun.networkretrofit.http.HttpManager;

import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity {

    private Button click_me_bn;
    private TextView result_tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        click_me_bn = findViewById(R.id.click_me_BN);
        result_tv = findViewById(R.id.result_TV);
        click_me_bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HttpManager.getRequest()
                        .getTeaHome(4644)
                        .subscribeOn(Schedulers.io())
                        .unsubscribeOn(Schedulers.io())
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribe(new HandlerCallBack<TeacherEntity>(MainActivity.this, new CallBackListener<TeacherEntity>() {
                            @Override
                            public void onNext(TeacherEntity o) {
                                result_tv.setText(o.getIntro());
                            }
                        }));
            }
        });
    }
}

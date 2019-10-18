package com.sun.networkretrofit.http;

import android.content.Context;
import android.widget.Toast;
import com.sun.networkretrofit.entity.Response;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import rx.Subscriber;


public class HandlerCallBack<T> extends Subscriber<Response<T>> {

    private Context mContext;
    private CallBackListener mListener;

    public HandlerCallBack(Context context, CallBackListener listener){
        this.mContext=context;
        this.mListener=listener;
    }

    @Override
    public void onCompleted() {

    }

    @Override
    public void onError(Throwable e) {
        if (e instanceof SocketTimeoutException) {
            Toast.makeText(mContext, "网络中断，请检查您的网络状态", Toast.LENGTH_SHORT).show();
        } else if (e instanceof ConnectException) {
            Toast.makeText(mContext, "网络中断，请检查您的网络状态", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(mContext, "error:" + e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onNext(Response<T> tResponse) {
        if(mListener!=null){
            mListener.onNext(tResponse.getData());
        }
    }

}

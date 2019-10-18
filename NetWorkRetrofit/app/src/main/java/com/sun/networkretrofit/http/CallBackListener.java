package com.sun.networkretrofit.http;

public interface CallBackListener<T> {

    void onNext(T t);
}

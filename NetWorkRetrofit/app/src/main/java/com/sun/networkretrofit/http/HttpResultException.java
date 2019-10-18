package com.sun.networkretrofit.http;

import java.io.IOException;

public class HttpResultException extends IOException {

    public HttpResultException(int code,String msg){
        super(msg);
    }
}

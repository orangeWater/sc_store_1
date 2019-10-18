package com.sun.networkretrofit.http;

public class HttpErrorResponseEntity {

    public int errorCode;
    public String errorMessage;

    public HttpErrorResponseEntity(int errorCode,String errorMessage){
        this.errorCode=errorCode;
        this.errorMessage=errorMessage;
    }
}

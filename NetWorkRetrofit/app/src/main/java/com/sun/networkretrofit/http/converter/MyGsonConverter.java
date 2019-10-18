package com.sun.networkretrofit.http.converter;

import android.support.annotation.NonNull;
import android.text.TextUtils;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.sun.networkretrofit.entity.Response;
import com.sun.networkretrofit.http.HttpErrorResponseEntity;
import com.sun.networkretrofit.http.HttpResultException;
import java.io.IOException;
import java.lang.reflect.Type;

import okhttp3.ResponseBody;
import retrofit2.Converter;

public class MyGsonConverter<T> implements Converter<ResponseBody, T> {
    private final Gson gson;
    private final Type type;

    public MyGsonConverter(Gson gson, Type type) {
        this.gson = gson;
        this.type = type;
    }

    @Override
    public T convert(@NonNull ResponseBody responseBody) throws IOException {
        String responseStr = responseBody.string();

        if (TextUtils.isEmpty(responseStr)) {
            HttpErrorResponseEntity errorResponse = new HttpErrorResponseEntity(-200, "The result of the request is returned as null");
            HttpResultException resultException = new HttpResultException(errorResponse.errorCode,errorResponse.errorMessage);
            throw resultException;
        }

        Response httpResult = null;
        try {
            httpResult = gson.fromJson(responseStr, Response.class);
        } catch (JsonSyntaxException e) {
            HttpResultException resultException = new HttpResultException(-201, "Json conversion exception");
            throw resultException;
        }

        if (httpResult.getCode() == 0) {
            try {
                return gson.fromJson(responseStr, type);
            } catch (JsonSyntaxException e) {
                HttpErrorResponseEntity errorResponse = new HttpErrorResponseEntity(-202, "Json conversion exception");
                throw new HttpResultException(errorResponse.errorCode, errorResponse.errorMessage);
            }
        }
        return null;
    }
}

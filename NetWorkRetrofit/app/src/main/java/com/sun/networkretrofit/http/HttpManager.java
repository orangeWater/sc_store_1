package com.sun.networkretrofit.http;


import com.sun.networkretrofit.http.converter.MyGsonConverterFactory;
import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;

public class HttpManager {

    private static HttpManager mInstance;
    private static Retrofit mRetrofit;
    private static volatile RequestApi request = null;


    public static HttpManager getInstance(){
        if(mInstance==null){
            synchronized (HttpManager.class){
                if(mInstance==null){
                    mInstance=new HttpManager();
                }
            }
        }
        return mInstance;
    }

    public void init(){
        //初始化okhttp
        OkHttpClient client=new OkHttpClient.Builder()
                .addInterceptor(new Interceptor() {
                    @Override
                    public Response intercept(Chain chain) throws IOException {
                        Request request = chain.request();
                        Request.Builder builder1 = request.newBuilder();
                        Request build = builder1.addHeader("token","92b65f27d747400482b2cb7d28f4eb85@1253@0")
                                .addHeader("equipType","111")
                                .addHeader("equipId","111")
                                .addHeader("Content-Type","application/json")
                                .build();
                        return chain.proceed(build);
                    }
                }).build();
        //初始化retrofit
        mRetrofit=new Retrofit.Builder()
                .client(client)
                .baseUrl(RequestApi.HOST)
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(MyGsonConverterFactory.create())
                .build();
    }

    public static RequestApi getRequest() {
        if (request == null) {
            synchronized (RequestApi.class) {
                request = mRetrofit.create(RequestApi.class);
            }
        }
        return request;
    }

}

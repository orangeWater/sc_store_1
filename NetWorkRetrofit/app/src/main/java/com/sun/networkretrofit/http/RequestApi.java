package com.sun.networkretrofit.http;


import com.sun.networkretrofit.entity.Response;
import com.sun.networkretrofit.entity.TeacherEntity;
import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

public interface RequestApi {

    public static final String HOST="http://116.62.65.65:38070/coachParentApp/";

   @GET("teacher/{id}")
    Observable<Response<TeacherEntity>> getTeaHome(@Path("id") int id);


}

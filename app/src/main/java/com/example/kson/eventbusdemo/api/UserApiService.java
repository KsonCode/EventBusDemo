package com.example.kson.eventbusdemo.api;

import com.example.kson.eventbusdemo.bean.UserRegBean;

import java.util.HashMap;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;
import retrofit2.http.Url;

public interface UserApiService {
    @POST("small/user/v1/register")
    @FormUrlEncoded
    Call<UserRegBean> register(@Field("phone") String mobile, @Field("pwd") String p);
//    @POST("small/user/v1/register")
//    @FormUrlEncoded
//    Call<UserRegBean> register(@FieldMap HashMap<String,String> params);

    @GET("small/user/v1/register")
    Call<UserRegBean> reg(@Query("phone") String mobile, @Query("pwd") String p);


    @POST
    @FormUrlEncoded
    Call<ResponseBody> reg2(@Url String url, @FieldMap HashMap<String,String> params);
    //https://api.github.com/users/{user}/repos
    @GET("users/{user}/repos")
    Call<UserRegBean> listRepos(@Path("user") String user);

    @PUT
    Call<UserRegBean> updateNickname(@Url String url, @Header("userId")String id, @Header("sessionId")String sid,@Field("nickName") String name);

    @POST
    @FormUrlEncoded
    @Headers({"Content-Type: application/json","Accept: application/json"})//请求头添加，作用：要求http协议遵循我们设置的请求头
    Call<UserRegBean> updateNickname1(@Url String url, @Header("userId")String id, @Header("sessionId")String sid,@Field("nickName") String name);






}

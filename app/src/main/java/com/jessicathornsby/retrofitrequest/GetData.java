package com.jessicathornsby.retrofitrequest;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetData {
    @GET("/users")
    Call<List<RetroUsers>> getAllUsers();
}

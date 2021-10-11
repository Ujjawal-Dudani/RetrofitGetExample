package com.notification.retrofitgetexample.retrofit

import com.notification.retrofitgetexample.model.DataModel
import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {

    @GET("photos")
    fun getPhotos(): Call<List<DataModel>>

}
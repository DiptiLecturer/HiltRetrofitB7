package org.freedu.retrofithilt

import dagger.Provides
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.http.GET
import javax.inject.Singleton

interface ApiService {

    @GET("products")
    fun getProducts(): Call<List<Product>>

}
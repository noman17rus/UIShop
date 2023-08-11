package com.example.uishop.model

import com.example.uishop.data.ApiInterface
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class Retrifit(baseUrl: String) {

    val retrofit = Retrofit.Builder()
        .baseUrl(baseUrl)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val apiInterface = retrofit.create(ApiInterface::class.java)

    //"https://run.mocky.io/v3/"
}

package com.arctouch.giphy.data.giphy

import com.arctouch.giphy.data.CustomService
import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class GiphyService : CustomService<GiphyApi> {

    private val host: String = "http://api.giphy.com"

    override fun createService(okHttpClient: OkHttpClient): GiphyApi {

        val retrofit = Retrofit.Builder()
            .baseUrl(host)
            .client(okHttpClient)
            .addCallAdapterFactory(CoroutineCallAdapterFactory())
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        return retrofit.create(GiphyApi::class.java)
    }


}
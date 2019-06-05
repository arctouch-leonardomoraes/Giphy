package com.arctouch.giphy.data.giphy

import com.arctouch.giphy.BuildConfig
import kotlinx.coroutines.Deferred
import retrofit2.http.GET
import retrofit2.http.Query

/**
 *  Giphy Api
 *  https://developers.giphy.com/docs/
 *  Example cURL-- http://api.giphy.com/v1/gifs/search?q=ryan+gosling&api_key=YOUR_API_KEY&limit=5
 */

interface GiphyApi {

    @GET("/v1/gifs/search")
    fun searchGiphy(
        @Query("api_key") apiKey: String = BuildConfig.GIPHY_API_KEY,
        @Query("q") query: String
    ): Deferred<SearchResponse>
}
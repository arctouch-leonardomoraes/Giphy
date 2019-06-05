package com.arctouch.giphy.data

import okhttp3.OkHttpClient

interface CustomService<out T> {

    fun createService(okHttpClient: OkHttpClient): T
}
package com.arctouch.giphy.data

abstract class Response<T> {
    abstract val data: List<T>
    abstract val meta: Meta
    abstract val pagination: Pagination
}

data class Meta(val status: Int, val msg: String)

data class Pagination(val totalCount: Int, val count: Int, val offset: Int)
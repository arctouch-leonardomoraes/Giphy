package com.arctouch.giphy.data.giphy

import com.arctouch.giphy.data.Meta
import com.arctouch.giphy.data.Pagination
import com.arctouch.giphy.data.Response

data class SearchResponse(
    override val data: List<GiphyResponse>,
    override val meta: Meta,
    override val pagination: Pagination
) : Response<GiphyResponse>()
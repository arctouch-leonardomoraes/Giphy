package com.arctouch.giphy.presentation.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.arctouch.giphy.data.giphy.GiphyResponse

class MainViewModel : ViewModel(){

    private val _gifs = MutableLiveData<List<GiphyResponse>>()
    val gifs: LiveData<List<GiphyResponse>>
        get() = _gifs

    fun loadData(){
        _gifs.postValue(listOf(GiphyResponse(1, "Teste"), GiphyResponse(2, "Teste2")))
    }
}

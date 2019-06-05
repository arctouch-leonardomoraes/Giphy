package com.arctouch.giphy.presentation.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.arctouch.giphy.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupViews()
    }

    private fun setupViews() {
        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
        viewModel.gifs.observe(this, Observer {

            exampleTextView.text = it.joinToString(", ") { it.name }
        })

        getDataButton.setOnClickListener {
            viewModel.loadData()
        }
    }
}

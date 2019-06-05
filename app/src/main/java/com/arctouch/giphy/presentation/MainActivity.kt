package com.arctouch.giphy.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.arctouch.giphy.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        exampleTextView.text = getString(R.string.app_name)
    }
}

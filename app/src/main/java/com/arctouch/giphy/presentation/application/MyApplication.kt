package com.arctouch.giphy.presentation.application

import android.app.Application
import com.arctouch.giphy.presentation.ComponentProvider

class MyApplication : Application(), ComponentProvider {
    override val component: ApplicationComponent by lazy {
        DaggerApplicationComponent
            .factory()
            .create(this)
    }
}
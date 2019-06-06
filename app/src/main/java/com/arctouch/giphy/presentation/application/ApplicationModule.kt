package com.arctouch.giphy.presentation.application

import android.content.Context
import androidx.annotation.StringRes
import dagger.Module
import dagger.Provides

@Module
object ApplicationModule {

    @JvmStatic
    @Provides
    fun provideContext(context: Context): Context = context.applicationContext
}


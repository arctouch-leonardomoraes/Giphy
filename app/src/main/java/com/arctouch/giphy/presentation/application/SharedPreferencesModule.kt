package com.arctouch.giphy.presentation.application

import android.content.Context
import android.content.SharedPreferences
import androidx.annotation.StringRes
import dagger.Module
import dagger.Provides

@Module
object SharedPreferencesModule {

    @JvmStatic
    @Provides
    fun provideSharedPreferencesByName(context: Context, @StringRes sharedPreferencesName: Int): SharedPreferences =
        context.getSharedPreferences(context.getString(sharedPreferencesName), Context.MODE_PRIVATE)
}
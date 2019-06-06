package com.arctouch.giphy.presentation.application

import android.content.Context
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Component(modules = [SharedPreferencesModule::class, ApplicationModule::class])
@Singleton
interface ApplicationComponent {

    @Component.Factory
    interface Factory {
        fun create(
            @BindsInstance applicationContext: Context
        ): ApplicationComponent
    }
}
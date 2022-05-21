package com.felix.koinroom

import android.app.Application
import com.felix.koinroom.di.databaseModule
import com.felix.koinroom.di.repositoryModule
import com.felix.koinroom.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class MainApp : Application(){

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger()
            androidContext(this@MainApp)
            modules(
                listOf(
                    databaseModule,
                    repositoryModule,
                    viewModelModule,
                )
            )
        }
    }
}
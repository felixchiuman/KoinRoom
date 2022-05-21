package com.felix.koinroom.di

import androidx.room.Room
import com.felix.koinroom.data.room.Database
import com.felix.koinroom.data.room.DbHelper
import org.koin.android.ext.koin.androidContext
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

val databaseModule = module {
    single {
        Room
            .databaseBuilder(
                androidContext().applicationContext,
                Database::class.java,
                "database"
            )
            .build()
    }
    single {
        get<Database>().dao()
    }
    singleOf(::DbHelper)
}
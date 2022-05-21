package com.felix.koinroom.di

import com.felix.koinroom.data.room.Repository
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

val repositoryModule = module {
    singleOf(::Repository)
}
package com.felix.koinroom.data.room

import androidx.room.Dao
import androidx.room.Database
import androidx.room.RoomDatabase

@androidx.room.Entity
@Database(entities = [Entity::class], version = 1)
abstract class Database: RoomDatabase() {
    abstract fun dao(): Dao
}
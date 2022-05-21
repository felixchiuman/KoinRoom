package com.felix.koinroom.data.room

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query

@Dao
interface ProfileDao {
    @Insert(onConflict = REPLACE)
    suspend fun insert(entity: Entity)

    @Delete
    suspend fun delete(entity: Entity)
}
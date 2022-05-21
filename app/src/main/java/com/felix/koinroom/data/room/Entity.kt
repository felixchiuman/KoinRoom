package com.felix.koinroom.data.room

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "table_test")
data class Entity(
   @PrimaryKey(autoGenerate = true) var id: Int = 0,
   @ColumnInfo(name = "name") var name: String,
   @ColumnInfo(name = "age") var age: String,
)

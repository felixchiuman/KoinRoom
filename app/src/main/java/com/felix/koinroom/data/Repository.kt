package com.felix.koinroom.data.room


class Repository(private val dbHelper:DbHelper) {

    suspend fun post(entity: Entity) = dbHelper.insert(entity)

    suspend fun clear(entity: Entity) = dbHelper.delete(entity)
}
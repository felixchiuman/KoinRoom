package com.felix.koinroom.data.room

class DbHelper(private val dao: Dao) {
    suspend fun insert(entity: Entity) = dao.insert(entity)

    suspend fun delete(entity: Entity) = dao.delete(entity)
}
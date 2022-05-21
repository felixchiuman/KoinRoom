package com.felix.koinroom.data.room

class DbHelper(private val profileDao: ProfileDao) {
    suspend fun insert(entity: Entity) = profileDao.insert(entity)

    suspend fun delete(entity: Entity) = profileDao.delete(entity)
}
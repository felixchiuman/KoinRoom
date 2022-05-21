package com.felix.koinroom.ui

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.felix.koinroom.data.room.Database
import com.felix.koinroom.data.room.Entity
import com.felix.koinroom.data.room.Repository
import kotlinx.coroutines.launch

class MainActivityViewModel(private val repository: Repository): ViewModel(){
    private val _post = MutableLiveData<List<Database>>()
    val posts: LiveData<List<Database>>
    get() = _post

    fun insert(entity: Entity) = viewModelScope.launch {
        repository.post(entity)
    }

    fun delete(entity: Entity) = viewModelScope.launch {
        repository.clear(entity)
    }
}
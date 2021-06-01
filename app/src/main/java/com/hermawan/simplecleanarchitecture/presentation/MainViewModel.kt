package com.hermawan.simplecleanarchitecture.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.hermawan.simplecleanarchitecture.domain.MessageEntity
import com.hermawan.simplecleanarchitecture.domain.MessageUseCase

class MainViewModel(private val messageUseCase: MessageUseCase): ViewModel() {
    private val _message = MutableLiveData<MessageEntity>()
    val message: LiveData<MessageEntity> = _message

    fun setName(name: String) {
        _message.value = messageUseCase.getMessage(name)
    }
}
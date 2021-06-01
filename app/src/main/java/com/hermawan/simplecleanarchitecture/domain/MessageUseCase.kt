package com.hermawan.simplecleanarchitecture.domain

interface MessageUseCase {
    fun getMessage(name:String): MessageEntity
}
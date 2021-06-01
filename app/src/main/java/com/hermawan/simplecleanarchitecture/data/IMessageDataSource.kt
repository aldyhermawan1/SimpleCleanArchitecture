package com.hermawan.simplecleanarchitecture.data

import com.hermawan.simplecleanarchitecture.domain.MessageEntity

interface IMessageDataSource {
    fun getMessageFromSource(name: String): MessageEntity
}
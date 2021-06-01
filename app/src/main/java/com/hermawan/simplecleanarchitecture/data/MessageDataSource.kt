package com.hermawan.simplecleanarchitecture.data

import com.hermawan.simplecleanarchitecture.domain.MessageEntity

class MessageDataSource: IMessageDataSource {
    override fun getMessageFromSource(name: String): MessageEntity {
        return MessageEntity("Hello $name! Welcome to Clean Architecture")
    }
}
package com.hermawan.simplecleanarchitecture.data

import com.hermawan.simplecleanarchitecture.domain.IMessageRepository
import com.hermawan.simplecleanarchitecture.domain.MessageEntity

class MessageRepository(private val messageDataSource: IMessageDataSource): IMessageRepository {
    override fun getWelcomeMessage(name: String): MessageEntity {
        return messageDataSource.getMessageFromSource(name)
    }
}
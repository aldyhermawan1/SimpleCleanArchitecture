package com.hermawan.simplecleanarchitecture.di

import com.hermawan.simplecleanarchitecture.data.IMessageDataSource
import com.hermawan.simplecleanarchitecture.data.MessageDataSource
import com.hermawan.simplecleanarchitecture.data.MessageRepository
import com.hermawan.simplecleanarchitecture.domain.IMessageRepository
import com.hermawan.simplecleanarchitecture.domain.MessageInteractor
import com.hermawan.simplecleanarchitecture.domain.MessageUseCase

object Injection {
    fun provideUseCase(): MessageUseCase {
        val messageRepository = provideRepository()
        return MessageInteractor(messageRepository)
    }

    private fun provideRepository(): IMessageRepository {
        val messageDataSource = provideDataSource()
        return MessageRepository(messageDataSource)
    }

    private fun provideDataSource(): IMessageDataSource {
        return MessageDataSource()
    }
}
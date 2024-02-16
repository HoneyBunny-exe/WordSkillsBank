package com.example.wordskillsbank.domain.usecase

import com.example.wordskillsbank.domain.model.UserModel
import com.example.wordskillsbank.domain.repository.UserModelRepository

class GetProfileUseCase(private val userModelRepository: UserModelRepository) {
    fun execute():UserModel{
        return userModelRepository.getUserProfile()
    }
}
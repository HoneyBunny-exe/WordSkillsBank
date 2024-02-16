package com.example.wordskillsbank.domain.usecase

import com.example.wordskillsbank.domain.model.LoginPasswordModel
import com.example.wordskillsbank.domain.model.TFATokenModel
import com.example.wordskillsbank.domain.repository.LoginPasswordRepository

class SendNewLoginUseCase(private val loginPasswordRepository: LoginPasswordRepository) {
    fun execute(login:String):TFATokenModel{
        return loginPasswordRepository.sendNewLogin(login)
    }
}
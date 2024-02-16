package com.example.wordskillsbank.domain.usecase

import com.example.wordskillsbank.domain.model.LoginPasswordModel
import com.example.wordskillsbank.domain.model.TFATokenModel
import com.example.wordskillsbank.domain.repository.LoginPasswordRepository

class SendAuthorizedDataUseCase(private val loginPasswordRepository:LoginPasswordRepository) {
    fun execute(loginPassword: LoginPasswordModel):TFATokenModel{
        if(loginPassword.login.isEmpty() or loginPassword.password.isEmpty())
            return TFATokenModel("", "-1")
        return loginPasswordRepository.sendLoginPassword(loginPassword)
    }
}
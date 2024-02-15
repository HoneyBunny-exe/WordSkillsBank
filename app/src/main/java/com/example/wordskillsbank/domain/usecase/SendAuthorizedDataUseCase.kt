package com.example.wordskillsbank.domain.usecase

import com.example.wordskillsbank.domain.model.LoginPasswordModel
import com.example.wordskillsbank.domain.repository.LoginPasswordRepository

class SendAuthorizedDataUseCase(private val loginPasswordRepository:LoginPasswordRepository) {
    fun execute(loginPassword: LoginPasswordModel):Boolean{
        if(loginPassword.login.isEmpty() or loginPassword.password.isEmpty())
            return false
        return loginPasswordRepository.sendLoginPassword(loginPassword)
    }
}
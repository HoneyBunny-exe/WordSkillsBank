package com.example.wordskillsbank.domain.usecase

import com.example.wordskillsbank.domain.model.ConfirmPasswordModel
import com.example.wordskillsbank.domain.model.TFATokenModel
import com.example.wordskillsbank.domain.repository.LoginPasswordRepository

class SendNewPasswordUseCase(private val loginPasswordRepository: LoginPasswordRepository) {
    fun execute(confirmPasswordModel: ConfirmPasswordModel):TFATokenModel {
        return loginPasswordRepository.sendNewPassword(confirmPasswordModel)
    }
}
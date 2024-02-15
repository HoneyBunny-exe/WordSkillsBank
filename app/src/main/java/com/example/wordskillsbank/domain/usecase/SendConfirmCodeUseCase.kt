package com.example.wordskillsbank.domain.usecase

import com.example.wordskillsbank.domain.model.ConfirmCodeModel
import com.example.wordskillsbank.domain.repository.ConfirmCodeRepository

class SendConfirmCodeUseCase(private val confirmCodeRepository: ConfirmCodeRepository) {
    fun execute(confirmCode: ConfirmCodeModel):Boolean{
        return confirmCodeRepository.sendConfirmCode(confirmCode)
    }
}
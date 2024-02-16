package com.example.wordskillsbank.domain.usecase.confirm

import com.example.wordskillsbank.domain.model.ConfirmCodeModel
import com.example.wordskillsbank.domain.model.TFATokenModel
import com.example.wordskillsbank.domain.model.UserModel
import com.example.wordskillsbank.domain.repository.ConfirmCodeRepository

class SendCreateProfileConfirmCodeUseCase(private val confirmCodeRepository: ConfirmCodeRepository) {
    fun execute(confirmCode: ConfirmCodeModel, tfaTokenModel: TFATokenModel):UserModel{
        return confirmCodeRepository.sendCreateProfileConfirmCode(confirmCode, tfaTokenModel)
    }
}
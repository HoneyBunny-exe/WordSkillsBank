package com.example.wordskillsbank.domain.usecase.confirm

import com.example.wordskillsbank.domain.model.ConfirmCodeModel
import com.example.wordskillsbank.domain.model.TFATokenModel
import com.example.wordskillsbank.domain.repository.ConfirmCodeRepository

class SendYourselfConfirmCodeUseCase(private val confirmCodeRepository: ConfirmCodeRepository) {
    fun execute(confirmCode: ConfirmCodeModel, tfaToken: TFATokenModel):Boolean{
        return confirmCodeRepository.sendYourselfTransferConfirmCode(confirmCode, tfaToken)
    }
}
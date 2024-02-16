package com.example.wordskillsbank.domain.usecase.confirm

import com.example.wordskillsbank.domain.model.ConfirmCodeModel
import com.example.wordskillsbank.domain.model.TFATokenModel
import com.example.wordskillsbank.domain.repository.ConfirmCodeRepository

class SendAnotherPeopleTransferConfirmCodeUseCase(private val confirmCodeRepository: ConfirmCodeRepository) {
    fun execute(confirmCode: ConfirmCodeModel, tfaToken: TFATokenModel):Boolean{
        return confirmCodeRepository.sendAnotherPeopleTransferConfirmCode(confirmCode, tfaToken)
    }
}
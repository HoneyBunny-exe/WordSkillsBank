package com.example.wordskillsbank.domain.usecase.confirm

import com.example.wordskillsbank.domain.model.ConfirmCodeModel
import com.example.wordskillsbank.domain.model.TFATokenModel
import com.example.wordskillsbank.domain.repository.ConfirmCodeRepository

class SendAuthConfirmCodeUseCase(private val confirmCodeRepository: ConfirmCodeRepository) {
    fun execute(confirmCode: ConfirmCodeModel, tfaToken: TFATokenModel):Boolean{ //Код, кто вызвал(чтобы знать, какому api методу отправить запрос)
        return confirmCodeRepository.sendAuthConfirmCode(confirmCode, tfaToken)
    }
}
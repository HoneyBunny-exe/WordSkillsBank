package com.example.wordskillsbank.domain.repository

import com.example.wordskillsbank.domain.model.ConfirmCodeModel
import com.example.wordskillsbank.domain.model.ResultModel
import com.example.wordskillsbank.domain.model.TFATokenModel
import com.example.wordskillsbank.domain.model.UserModel

// Отправляет код подтверждения.
// В зависимости от того, кто отправляет данные, вызовет нужный метод
interface ConfirmCodeRepository {
    fun sendAuthConfirmCode(confirmCode: ConfirmCodeModel, tfaToken: TFATokenModel):Boolean
    fun sendAnotherPeopleTransferConfirmCode(confirmCode: ConfirmCodeModel, tfaToken: TFATokenModel):Boolean
    fun sendYourselfTransferConfirmCode(confirmCode: ConfirmCodeModel, tfaToken: TFATokenModel):Boolean
    fun sendPaymentConfirmCode(confirmCode: ConfirmCodeModel, tfaToken: TFATokenModel):Boolean
    fun sendNewLoginConfirmCode(confirmCode: ConfirmCodeModel, tfaToken: TFATokenModel):ResultModel
    fun sendNewPasswordConfirmCode(confirmCode: ConfirmCodeModel, tfaToken: TFATokenModel):ResultModel
    fun sendCreateProfileConfirmCode(confirmCode: ConfirmCodeModel, tfaToken: TFATokenModel):UserModel
}
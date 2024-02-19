package com.example.wordskillsbank.data.mapper

import com.example.wordskillsbank.data.network.model.SendTFATokenModel
import com.example.wordskillsbank.domain.model.ConfirmCodeModel
import com.example.wordskillsbank.domain.model.TFATokenModel

class TFATokenToSendTFAToken {
    fun map(tfaTokenModel: TFATokenModel, confirmCodeModel: ConfirmCodeModel):SendTFATokenModel{
        return SendTFATokenModel(
            tfa_token = tfaTokenModel.tfa_token,
            confirm_code = confirmCodeModel.confirmCode,
        )
    }
}
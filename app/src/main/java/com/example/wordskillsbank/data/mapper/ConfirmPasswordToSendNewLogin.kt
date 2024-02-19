package com.example.wordskillsbank.data.mapper

import com.example.wordskillsbank.data.network.model.SendNewPasswordModel
import com.example.wordskillsbank.domain.model.ConfirmPasswordModel

class ConfirmPasswordToSendNewLogin {
    fun map(confirmPasswordModel: ConfirmPasswordModel):SendNewPasswordModel{
        return SendNewPasswordModel(
            password = confirmPasswordModel.password,
            re_password = confirmPasswordModel.re_password,
        )
    }
}
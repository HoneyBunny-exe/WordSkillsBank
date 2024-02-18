package com.example.wordskillsbank.data.mapper

import com.example.wordskillsbank.data.network.model.SendLoginPasswordModel
import com.example.wordskillsbank.domain.model.LoginPasswordModel

class LoginPasswordToSendLoginPassword {
    fun map(loginPasswordModel: LoginPasswordModel):SendLoginPasswordModel{
        return SendLoginPasswordModel(
            login = loginPasswordModel.login,
            password = loginPasswordModel.password,
        )
    }
}
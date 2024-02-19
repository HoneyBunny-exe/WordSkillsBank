package com.example.wordskillsbank.data.mapper

import com.example.wordskillsbank.data.network.model.SendRegistrationDataModel
import com.example.wordskillsbank.domain.model.RegistrationDataModel

class RegistrationDataToSendRegistrationData {
    fun map(registrationDataModel: RegistrationDataModel):SendRegistrationDataModel{
        return SendRegistrationDataModel(
            account = registrationDataModel.account,
            login = registrationDataModel.login,
            password = registrationDataModel.password,
            re_password = registrationDataModel.re_password,
        )
    }
}
package com.example.wordskillsbank.domain.repository

import com.example.wordskillsbank.domain.model.ConfirmPasswordModel
import com.example.wordskillsbank.domain.model.LoginPasswordModel
import com.example.wordskillsbank.domain.model.TFATokenModel

interface LoginPasswordRepository {
    fun sendLoginPassword(loginPassword:LoginPasswordModel):TFATokenModel//отправить логин и пароль для входа, вернет tfa
    fun sendNewLogin(login: String):TFATokenModel
    fun sendNewPassword(confirmPasswordModel: ConfirmPasswordModel):TFATokenModel
}
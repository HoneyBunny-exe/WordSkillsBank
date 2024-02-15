package com.example.wordskillsbank.domain.repository

import com.example.wordskillsbank.domain.model.LoginPasswordModel

interface LoginPasswordRepository {
    fun sendLoginPassword(loginPassword:LoginPasswordModel):Boolean//отправить логин и пароль для входа, вернет результат выполнения
}
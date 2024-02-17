package com.example.wordskillsbank.data.network.model

// То, что получаем с сервера
class GetTFATokenModel(
    val tfa_token:String,
    val expiration_confirm_code_in_seconds:String,
    val details:String, //Хранит результат вычислений в некоторых запросах
)
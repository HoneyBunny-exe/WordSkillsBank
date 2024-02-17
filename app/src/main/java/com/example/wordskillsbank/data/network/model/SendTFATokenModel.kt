package com.example.wordskillsbank.data.network.model

// То, что отправляется на сервер
class SendTFATokenModel(
    val tfa_token: String,
    val confirm_code: String,
)
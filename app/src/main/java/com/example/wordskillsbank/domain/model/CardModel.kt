package com.example.wordskillsbank.domain.model

class CardModel(
    val payment_system:String,
    val account:String,     //Номер счета, к которому привязана карта
    val is_activated: Boolean,
    val type_account: String,
    val card_name: String,
    val balance: Double,
    val currency: String,
    val token_card: String,
)
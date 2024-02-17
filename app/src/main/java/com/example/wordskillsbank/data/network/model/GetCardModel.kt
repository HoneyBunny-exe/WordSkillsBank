package com.example.wordskillsbank.data.network.model

class GetCardModel(
    val account_number: Long,
    val type_account: String,
    val currency: String,
    val balance: Double,
    val card_name: String,
    val token_card: String,
    val end_date: String,
    val is_activated: Boolean,
    val payment_system: String,
)
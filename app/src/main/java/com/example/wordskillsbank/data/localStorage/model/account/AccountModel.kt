package com.example.wordskillsbank.data.localStorage.model.account

class AccountModel(
    val account_number: String,
    val type_account: String,
    val currency: String,
    val balance: String,
    val description: AccountDescriptionModel,
)
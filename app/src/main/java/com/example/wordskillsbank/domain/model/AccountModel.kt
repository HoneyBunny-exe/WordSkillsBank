package com.example.wordskillsbank.domain.model

class AccountModel(
    val account_number: String,
    val type_account: String,
    val currency: String,
    val balance: String,
    val description:List<String>,
)
// TODO: Написать реализацию
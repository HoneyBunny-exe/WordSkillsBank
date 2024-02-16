package com.example.wordskillsbank.domain.repository

import com.example.wordskillsbank.domain.model.AccountModel

interface AccountModelRepository {
    fun createAccount(accountModel:AccountModel):AccountModel
}
package com.example.wordskillsbank.domain.repository

import com.example.wordskillsbank.domain.model.AccountModel
import com.example.wordskillsbank.domain.model.OperationModel

interface AccountModelRepository {
    fun createAccount(accountModel:AccountModel):AccountModel
    fun getOperations(accountModel: AccountModel):List<OperationModel>
}
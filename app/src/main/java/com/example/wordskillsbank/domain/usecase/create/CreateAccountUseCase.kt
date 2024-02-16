package com.example.wordskillsbank.domain.usecase.create

import com.example.wordskillsbank.domain.model.AccountModel
import com.example.wordskillsbank.domain.repository.AccountModelRepository

class CreateAccountUseCase(private val accountModelRepository: AccountModelRepository) {
    fun execute(accountModel:AccountModel):AccountModel{
        return accountModelRepository.createAccount(accountModel)
    }
}
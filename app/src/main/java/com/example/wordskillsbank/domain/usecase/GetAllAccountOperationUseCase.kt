package com.example.wordskillsbank.domain.usecase

import com.example.wordskillsbank.domain.model.AccountModel
import com.example.wordskillsbank.domain.model.OperationModel
import com.example.wordskillsbank.domain.repository.AccountModelRepository

class GetAllAccountOperationUseCase(private val accountModelRepository: AccountModelRepository) {
    fun execute(accountModel: AccountModel):List<OperationModel>{
        // TODO: Логика обработки полученной информации
        return accountModelRepository.getOpeartions(accountModel)
    }
}
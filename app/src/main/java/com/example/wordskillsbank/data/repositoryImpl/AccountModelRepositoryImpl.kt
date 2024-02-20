package com.example.wordskillsbank.data.repositoryImpl

import com.example.wordskillsbank.data.network.api.OperationApi
import com.example.wordskillsbank.domain.model.AccountModel
import com.example.wordskillsbank.domain.model.OperationModel
import com.example.wordskillsbank.domain.repository.AccountModelRepository
import retrofit2.Retrofit


// TODO: Получить токен из localStorage
class AccountModelRepositoryImpl(private val service:Retrofit) : AccountModelRepository{

    private val api:OperationApi = service.create(OperationApi::class.java)

    override fun createAccount(accountModel: AccountModel): AccountModel {
        TODO("Not yet implemented")
    }

    override fun getOperations(accountModel: AccountModel): List<OperationModel> {
        return null as List<OperationModel>
    }
}
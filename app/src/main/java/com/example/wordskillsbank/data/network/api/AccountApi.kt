package com.example.wordskillsbank.data.network.api

import com.example.wordskillsbank.data.network.model.GetAccountModel
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface AccountApi {
    // TODO: Обработать вариант, когда пришел объект, содержащий details
    @GET("/api/v1/has_account")
    suspend fun checkAccount(@Header("Authorization") token:String, @Query("account_number") accountNumber:String):Boolean

    // TODO: Обработать вариант, когда пришел объект, содержащий details
    @GET("api/v1/get_accounts")
    suspend fun getAllAccounts(@Header("Authorization") token:String):List<GetAccountModel>
}
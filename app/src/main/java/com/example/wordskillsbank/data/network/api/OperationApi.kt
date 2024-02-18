package com.example.wordskillsbank.data.network.api

import com.example.wordskillsbank.data.network.model.GetOperationModel
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface OperationApi {
    // TODO:  
    @GET("/api/v1/get_operations")
    suspend fun getAllOperations(
        @Header("Authorization") token:String,
        @Query("account_number") accountNumber:String
    ):List<GetOperationModel>
}
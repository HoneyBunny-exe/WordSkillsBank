package com.example.wordskillsbank.data.network.api

import com.example.wordskillsbank.data.network.model.SendLoginPasswordModel
import com.example.wordskillsbank.data.network.model.SendTFATokenModel
import com.example.wordskillsbank.data.network.model.GetTFATokenModel
import com.example.wordskillsbank.data.network.model.GetTokenPairModel
import retrofit2.http.Body
import retrofit2.http.POST
import retrofit2.http.PUT

interface AuthDataApi{
    // TODO: Обработать вариант, когда пришел объект, содержащий details
    @POST("auth")
    suspend fun authentication(@Body sendLoginPasswordModel: SendLoginPasswordModel):GetTFATokenModel

    @PUT("auth")
    suspend fun confirm(@Body sendTFATokenModel: SendTFATokenModel):GetTokenPairModel
}
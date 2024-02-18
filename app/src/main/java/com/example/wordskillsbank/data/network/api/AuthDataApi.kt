package com.example.wordskillsbank.data.network.api

import com.example.wordskillsbank.data.network.model.SendLoginPasswordModel
import com.example.wordskillsbank.data.network.model.SendTFATokenModel
import com.example.wordskillsbank.data.network.model.GetTFATokenModel
import com.example.wordskillsbank.data.network.model.GetTokenPairModel
import com.example.wordskillsbank.data.network.model.SendNewPasswordModel
import com.example.wordskillsbank.data.network.model.StatusModel
import retrofit2.http.Body
import retrofit2.http.Header
import retrofit2.http.POST
import retrofit2.http.PUT

interface AuthDataApi {
    // TODO: Обработать вариант, когда пришел объект, содержащий details
    @POST("auth")
    suspend fun authentication(@Body sendLoginPasswordModel: SendLoginPasswordModel): GetTFATokenModel

    @PUT("auth")
    suspend fun confirmAuthentication(@Body sendTFATokenModel: SendTFATokenModel): GetTokenPairModel

    @POST("auth/change_auth")
    suspend fun changePassword(
        @Header("Authorization") token: String,
        sendNewPasswordModel: SendNewPasswordModel
    ): GetTFATokenModel

    @PUT("auth/change_auth")
    suspend fun confirmChangePassword(@Header("Authorization") token:String, sendTFATokenModel:SendTFATokenModel):StatusModel
}
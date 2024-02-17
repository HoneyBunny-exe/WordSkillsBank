package com.example.wordskillsbank.data.network.api

import com.example.wordskillsbank.data.network.model.SendRegistrationDataModel
import com.example.wordskillsbank.data.network.model.SendTFATokenModel
import com.example.wordskillsbank.data.network.model.GetTFATokenModel
import com.example.wordskillsbank.data.network.model.GetTokenPairModel
import retrofit2.http.Body
import retrofit2.http.POST
import retrofit2.http.PUT

interface RegistrationDataApi {
    // TODO: Обработать вариант, когда пришел объект, содержащий details
    @POST("auth/registration")
    suspend fun registration(@Body sendRegistrationDataModel: SendRegistrationDataModel): GetTFATokenModel

    // TODO: Обработать вариант, когда код/tfa неверный
    @PUT("auth/registration")
    suspend fun confirm(@Body sendTfaToken: SendTFATokenModel):GetTokenPairModel
}
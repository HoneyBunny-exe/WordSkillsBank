package com.example.wordskillsbank.data.network.api

import com.example.wordskillsbank.data.network.model.GetTFATokenModel
import com.example.wordskillsbank.data.network.model.GetTransferModel
import com.example.wordskillsbank.data.network.model.SendTFATokenModel
import com.example.wordskillsbank.data.network.model.SendTransferModel
import retrofit2.http.Header
import retrofit2.http.POST
import retrofit2.http.PUT

// Здесь в заголовок передаем строку а не SendTokenPairModel в виду того, что @Header требует строку
interface TransferMoneyApi {
    // TODO: Обработать вариант, когда пришел объект, содержащий details
    @POST("api/v1/transfer_money")
    suspend fun transfer(@Header("Authorization") token:String, sendTransferModel: SendTransferModel ):GetTFATokenModel

    // TODO: Обработать вариант, когда код/tfa неверный
    @PUT("api/v1/transfer_money")
    suspend fun confirm(@Header("Authorization") token: String, sendTFATokenModel: SendTFATokenModel):GetTransferModel
}
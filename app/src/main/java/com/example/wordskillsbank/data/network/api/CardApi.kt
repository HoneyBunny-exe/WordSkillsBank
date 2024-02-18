package com.example.wordskillsbank.data.network.api

import com.example.wordskillsbank.data.network.model.GetCardModel
import com.example.wordskillsbank.data.network.model.GetChangeStatusCardModel
import com.example.wordskillsbank.data.network.model.SendCardModel
import com.example.wordskillsbank.data.network.model.SendChangeStatusCardModel
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST

interface CardApi {
    // TODO:  
    @GET("api/v1/get_cards")
    suspend fun getAllCards(@Header("Authorization") token:String):List<GetCardModel>

    // TODO:  
    @POST("api/v1/create_card")
    suspend fun create(@Header("Authorization") token:String, sendCardModel: SendCardModel):GetCardModel

    // TODO:  
    @POST("api/v1/change_status_card")
    suspend fun changeStatusCard(
        @Header("Authorization") token:String,
        sendChangeStatusCardModel: SendChangeStatusCardModel
    ):GetChangeStatusCardModel
}
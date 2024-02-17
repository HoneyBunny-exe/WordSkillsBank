package com.example.wordskillsbank.data.network.api

import com.example.wordskillsbank.data.network.model.GetCardModel
import retrofit2.http.GET
import retrofit2.http.Header

interface CardApi {
    @GET("api/v1/get_cards")
    suspend fun getAllCards(@Header("Authorization") token:String):List<GetCardModel>
}
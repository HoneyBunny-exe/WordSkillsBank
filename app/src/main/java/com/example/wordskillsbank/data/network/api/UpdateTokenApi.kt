package com.example.wordskillsbank.data.network.api

import com.example.wordskillsbank.data.network.model.GetTokenPairModel
import retrofit2.http.POST

interface UpdateTokenApi {
    // TODO:
    @POST("auth/update_api_tokens")
    suspend fun update(refreshToken:String):GetTokenPairModel
}
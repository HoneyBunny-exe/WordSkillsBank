package com.example.wordskillsbank.data.network.api

import com.example.wordskillsbank.data.network.model.GetUserModel
import retrofit2.http.GET
import retrofit2.http.Header

interface UserDataApi {
    // TODO: Обработать вариант, когда пришел объект, содержащий details
    @GET("api/v1/user_info")
    suspend fun getUser(@Header("Authorization") token:String):GetUserModel
}
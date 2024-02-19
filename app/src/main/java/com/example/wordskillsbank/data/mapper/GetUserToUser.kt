package com.example.wordskillsbank.data.mapper

import com.example.wordskillsbank.data.network.model.GetUserModel
import com.example.wordskillsbank.domain.model.UserModel

class GetUserToUser {
    fun map(getUserModel: GetUserModel):UserModel{
        return UserModel(
            first_name = getUserModel.first_name,
            second_name = getUserModel.second_name,
            third_name = getUserModel.third_name,
            phone_number = getUserModel.phone_number,
            email = getUserModel.email,
        )
    }
}
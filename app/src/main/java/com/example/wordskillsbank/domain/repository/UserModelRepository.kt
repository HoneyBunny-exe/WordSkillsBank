package com.example.wordskillsbank.domain.repository

import com.example.wordskillsbank.domain.model.RegistrationDataModel
import com.example.wordskillsbank.domain.model.TFATokenModel
import com.example.wordskillsbank.domain.model.UserModel

interface UserModelRepository {
    fun getUserProfile():UserModel
    fun createUserProfile(registrationDataModel: RegistrationDataModel):TFATokenModel
}
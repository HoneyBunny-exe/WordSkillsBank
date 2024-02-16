package com.example.wordskillsbank.domain.repository

import com.example.wordskillsbank.domain.model.UserModel

interface UserModelRepository {
    fun getUserProfile():UserModel
}
package com.example.wordskillsbank.domain.repository

import com.example.wordskillsbank.domain.model.ConfirmCodeModel

interface ConfirmCodeRepository {
    fun sendConfirmCode(confirmCode: ConfirmCodeModel):Boolean
}
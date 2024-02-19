package com.example.wordskillsbank.data.mapper

import com.example.wordskillsbank.data.network.model.GetTokenPairModel
import com.example.wordskillsbank.domain.model.TokenPairModel

class GetTokenPairToTokenPair {
    fun map(getTokenPairModel: GetTokenPairModel):TokenPairModel{
        return TokenPairModel(
            accessToken = getTokenPairModel.accessToken,
            refreshToken = getTokenPairModel.refreshToken,
        )
    }
}
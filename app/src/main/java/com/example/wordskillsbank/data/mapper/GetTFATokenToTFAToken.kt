package com.example.wordskillsbank.data.mapper

import com.example.wordskillsbank.data.network.model.GetTFATokenModel
import com.example.wordskillsbank.domain.model.TFATokenModel

class GetTFATokenToTFAToken {
    fun map(getTFATokenModel: GetTFATokenModel):TFATokenModel{
        return TFATokenModel(
            tfa_token = getTFATokenModel.tfa_token,
            details = getTFATokenModel.details,
        )
    }
}
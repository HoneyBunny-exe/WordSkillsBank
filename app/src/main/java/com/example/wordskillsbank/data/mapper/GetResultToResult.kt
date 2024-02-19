package com.example.wordskillsbank.data.mapper

import com.example.wordskillsbank.data.network.model.GetResultModel
import com.example.wordskillsbank.domain.model.ResultModel

class GetResultToResult {
    fun map(getResultModel: GetResultModel):ResultModel{
        return ResultModel(
            details = getResultModel.details,
        )
    }
}
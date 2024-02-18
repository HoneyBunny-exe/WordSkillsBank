package com.example.wordskillsbank.data.mapper

import com.example.wordskillsbank.data.network.model.GetOperationModel
import com.example.wordskillsbank.domain.model.OperationModel

class GetOperationToOperation {
    fun map(getOperationModel: GetOperationModel):OperationModel{
        return OperationModel(
            status_operation = getOperationModel.status_operation,
            description = listOf(
                getOperationModel.description.To.account_number,
                getOperationModel.description.To.card_number,
                getOperationModel.description.To.full_name,

                getOperationModel.description.From.account_number,
                getOperationModel.description.From.card_number,
                getOperationModel.description.From.full_name,
                ),
            about = getOperationModel.about,
            currency = getOperationModel.currency,
            amount_money = getOperationModel.amount_money,
        )
    }
}
package com.example.wordskillsbank.data.network.model

import com.example.wordskillsbank.data.network.model.submodel.GetOperationDescriptionModel

class GetOperationModel(
    val status_operation: String,
    val start_transaction: String,
    val end_transaction: String,
    val description: GetOperationDescriptionModel,
    val about: String,
    val currency: String,
    val amount_money: String,
)
package com.example.wordskillsbank.data.localStorage.model.operation

import com.example.wordskillsbank.data.localStorage.model.operation.OperationDescriptionModel

class OperationModel(
    val status_operation:String,
    val start_transaction:String,
    val end_transaction:String,

    val description: OperationDescriptionModel,

    val about:String,
    val currency:String,
    val amount_money:String,
)
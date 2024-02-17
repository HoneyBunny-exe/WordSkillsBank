package com.example.wordskillsbank.data.network.model

class GetAccountModel(
    val account_number: String,
    val type_account: String,
    val currency: String,
    val balance: String,
    // TODO: Что-то придумать с description
    /*
    Card data:

    "account_number": "40817810514159265351",
    "type_account": "credit",
    "currency": "RUB",
    "balance": "-11135.00",
    "description": {
        "url_scans": "",
        "description": {
            "debt_arrear": "0.1",
            "grace_period": "222",
            "percent_rate": "12"
        },
        "max_debt_amount": "99999"
    }

    */
)
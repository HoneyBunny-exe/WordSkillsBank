package com.example.wordskillsbank.data.mapper

import com.example.wordskillsbank.data.network.model.SendTransferModel
import com.example.wordskillsbank.domain.model.TransferModel

class TransferToSendTransfer {
    fun map(transferModel: TransferModel):SendTransferModel{
        return SendTransferModel(
            amount_money = transferModel.amount_money,
            account_send = transferModel.account_send,
            account_recv = transferModel.account_recv,
            description = transferModel.description,
        )
    }
}
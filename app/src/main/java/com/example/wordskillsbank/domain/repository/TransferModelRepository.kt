package com.example.wordskillsbank.domain.repository

import com.example.wordskillsbank.domain.model.TFATokenModel
import com.example.wordskillsbank.domain.model.TransferModel

interface TransferModelRepository {
    fun sendTransfer(transferModel: TransferModel):TFATokenModel
}
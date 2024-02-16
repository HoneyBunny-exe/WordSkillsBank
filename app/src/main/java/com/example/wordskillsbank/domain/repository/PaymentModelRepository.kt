package com.example.wordskillsbank.domain.repository

import com.example.wordskillsbank.domain.model.TFATokenModel
import com.example.wordskillsbank.domain.model.TransferModel

interface PaymentModelRepository {
    fun sendPayment(payment: TransferModel):TFATokenModel
}
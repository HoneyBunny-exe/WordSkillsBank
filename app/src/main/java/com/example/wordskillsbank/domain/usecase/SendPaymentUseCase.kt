package com.example.wordskillsbank.domain.usecase

import com.example.wordskillsbank.domain.model.TFATokenModel
import com.example.wordskillsbank.domain.model.TransferModel
import com.example.wordskillsbank.domain.repository.PaymentModelRepository

class SendPaymentUseCase(private val paymentModelRepository: PaymentModelRepository) {
    fun execute(payment: TransferModel):TFATokenModel {
        return paymentModelRepository.sendPayment(payment)
    }
}
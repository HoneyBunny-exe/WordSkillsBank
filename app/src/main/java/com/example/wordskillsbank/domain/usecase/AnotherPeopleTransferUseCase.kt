package com.example.wordskillsbank.domain.usecase

import com.example.wordskillsbank.domain.model.TFATokenModel
import com.example.wordskillsbank.domain.model.TransferModel
import com.example.wordskillsbank.domain.repository.ConfirmCodeRepository
import com.example.wordskillsbank.domain.repository.TransferModelRepository

class AnotherPeopleTransferUseCase(private val transferModelRepository: TransferModelRepository) {
    fun execute(anotherPeopleTransfer: TransferModel):TFATokenModel{
        return transferModelRepository.sendTransfer(anotherPeopleTransfer)
    }
}
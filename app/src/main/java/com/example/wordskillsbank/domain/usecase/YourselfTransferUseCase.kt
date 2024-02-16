package com.example.wordskillsbank.domain.usecase

import com.example.wordskillsbank.domain.model.TFATokenModel
import com.example.wordskillsbank.domain.model.TransferModel
import com.example.wordskillsbank.domain.repository.TransferModelRepository

class YourselfTransferUseCase(private val transferModelRepository: TransferModelRepository){
    fun execute(yourselfTransfer: TransferModel):TFATokenModel{
        return transferModelRepository.sendTransfer(yourselfTransfer)
    }
}
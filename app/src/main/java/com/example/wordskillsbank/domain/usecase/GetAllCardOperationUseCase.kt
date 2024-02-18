package com.example.wordskillsbank.domain.usecase

import com.example.wordskillsbank.domain.model.CardModel
import com.example.wordskillsbank.domain.model.OperationModel
import com.example.wordskillsbank.domain.repository.CardModelRepository

class GetAllCardOperationUseCase(private val cardModelRepository: CardModelRepository) {
    fun execute(cardModel: CardModel):List<OperationModel> {
        // TODO: Написать логику выбора операций по данной карте
        return cardModelRepository.getOperations(cardModel)
    }
}
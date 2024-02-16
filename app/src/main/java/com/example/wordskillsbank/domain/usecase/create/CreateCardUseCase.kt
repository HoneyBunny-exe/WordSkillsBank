package com.example.wordskillsbank.domain.usecase.create

import com.example.wordskillsbank.domain.model.CardModel
import com.example.wordskillsbank.domain.model.TFATokenModel
import com.example.wordskillsbank.domain.repository.CardModelRepository

class CreateCardUseCase(private val cardModelRepository: CardModelRepository) {
    fun execute(cardModel: CardModel):CardModel{
        return cardModelRepository.createCard(cardModel)
    }
}
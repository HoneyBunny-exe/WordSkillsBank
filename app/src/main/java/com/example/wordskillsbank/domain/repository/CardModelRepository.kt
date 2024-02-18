package com.example.wordskillsbank.domain.repository

import com.example.wordskillsbank.domain.model.CardModel
import com.example.wordskillsbank.domain.model.OperationModel

interface CardModelRepository {
    fun createCard(cardModel:CardModel):CardModel
    fun getOperations(cardModel:CardModel):List<OperationModel>
}
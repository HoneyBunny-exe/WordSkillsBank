package com.example.wordskillsbank.domain.repository

import com.example.wordskillsbank.domain.model.CardModel

interface CardModelRepository {
    fun createCard(cardModel:CardModel):CardModel
}
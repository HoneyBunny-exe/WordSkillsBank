package com.example.wordskillsbank.data.mapper

import com.example.wordskillsbank.data.network.model.GetCardModel
import com.example.wordskillsbank.domain.model.CardModel

class GetCardToCard {
    fun map(getCardModel: GetCardModel):CardModel{
        return CardModel(
            payment_system = getCardModel.payment_system,
            account = getCardModel.account_number.toString(),
            is_activated = getCardModel.is_activated,
            type_account = getCardModel.type_account,
            card_name = getCardModel.card_name,
            balance = getCardModel.balance,
            currency = getCardModel.currency,
            token_card = getCardModel.token_card,
        )
    }
}
package com.example.wordskillsbank.domain.usecase

import com.example.wordskillsbank.domain.repository.ValuteModelRepository

class GetAllValuteNamesUseCase(private val valuteModelRepository: ValuteModelRepository) {
    fun execute():List<String>{
        val valuteModels = valuteModelRepository.getAllValute()
        // TODO: Протестить строку ниже 
        return listOf(valuteModels.forEach { it.charCode }.toString())
    }
}
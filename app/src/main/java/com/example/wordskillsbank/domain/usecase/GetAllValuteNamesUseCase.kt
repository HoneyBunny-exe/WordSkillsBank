package com.example.wordskillsbank.domain.usecase

import com.example.wordskillsbank.domain.repository.ValuteRepository

class GetAllValuteNamesUseCase(private val valuteRepository: ValuteRepository) {
    fun execute():List<String>{
        val valuteModels = valuteRepository.getAllValute()
        // TODO: Протестить строку ниже 
        return listOf(valuteModels.forEach { it.charCode }.toString())
    }
}
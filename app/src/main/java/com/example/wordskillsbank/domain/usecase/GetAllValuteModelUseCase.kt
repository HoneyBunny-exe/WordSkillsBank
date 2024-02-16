package com.example.wordskillsbank.domain.usecase

import com.example.wordskillsbank.domain.model.ValuteModel
import com.example.wordskillsbank.domain.repository.ValuteModelRepository

class GetAllValuteModelUseCase(private val valuteModelRepository: ValuteModelRepository) {
    fun execute():List<ValuteModel>{
        return valuteModelRepository.getAllValute()
    }
}
package com.example.wordskillsbank.domain.repository

import com.example.wordskillsbank.domain.model.ValuteModel

interface ValuteRepository {
    fun getAllValute():List<ValuteModel>
    //fun getValute(charCode:String):ValuteModel
}
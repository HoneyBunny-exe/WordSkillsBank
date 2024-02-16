package com.example.wordskillsbank.domain.repository

import com.example.wordskillsbank.domain.model.ValuteModel

interface ValuteModelRepository {
    fun getAllValute():List<ValuteModel>
    //fun getValute(charCode:String):ValuteModel
}
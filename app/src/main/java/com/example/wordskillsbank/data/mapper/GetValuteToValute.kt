package com.example.wordskillsbank.data.mapper

import com.example.wordskillsbank.data.network.model.GetValuteModel
import com.example.wordskillsbank.domain.model.ValuteModel

class GetValuteToValute {
    fun map(getValuteModel: GetValuteModel):ValuteModel{
        return ValuteModel(
            charCode = getValuteModel.charCode,
            name = getValuteModel.name,
            nominal = getValuteModel.nominal,
            salePrice = getValuteModel.salePrice,
            purchasePrice = getValuteModel.purchasePrice,
        )
    }
}
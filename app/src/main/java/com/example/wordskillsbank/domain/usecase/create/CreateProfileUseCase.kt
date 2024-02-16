package com.example.wordskillsbank.domain.usecase.create

import com.example.wordskillsbank.domain.model.RegistrationDataModel
import com.example.wordskillsbank.domain.model.TFATokenModel
import com.example.wordskillsbank.domain.repository.UserModelRepository

class CreateProfileUseCase(private val userModelRepository: UserModelRepository) {
    fun execute(registrationDataModel: RegistrationDataModel):TFATokenModel{
        return userModelRepository.createUserProfile(registrationDataModel)
    }
}
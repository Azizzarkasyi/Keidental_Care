package com.example.fantasticten.view_model

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.fantasticten.repository.AuthRepository
import java.security.InvalidParameterException

class LoginActivityViewModelFactory(private val authRepository: AuthRepository, private val application: Application): ViewModelProvider.Factory {
    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(LoginActivityViewModel::class.java)) {
            return LoginActivityViewModel(authRepository, application) as T
        }

        throw InvalidParameterException("unable to construct LoginActivityViewModel")
    }
}
package com.example.carteirinhadigitalapp.feature.carteirinha.presentation

import com.example.carteirinhadigitalapp.feature.carteirinha.domain.model.Carteirinha

data class CarteirinhaUiState(
    val isLoading: Boolean = false,
    val carteirinha: Carteirinha? = null,
    val errorMessage: String? = null
)
package com.example.carteirinhadigitalapp.feature.unidadecurricular.presentation

import com.example.carteirinhadigitalapp.feature.unidadecurricular.domain.model.UnidadeCurricular

data class UnidadeCurricularUiState(
    val isLoading: Boolean = false,
    val unidadesCurriculares: List<UnidadeCurricular> = emptyList(),
    val errorMessage: String? = null
)

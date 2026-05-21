package com.example.carteirinhadigitalapp.feature.unidadecurricular.data.repository

import com.example.carteirinhadigitalapp.feature.unidadecurricular.domain.model.UnidadeCurricular

interface UnidadeCurricularRepository {
    suspend fun buscarUnidadesCurriculares(): Result<List<UnidadeCurricular>>
}
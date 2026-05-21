package com.example.carteirinhadigitalapp.feature.carteirinha.data.repository

import com.example.carteirinhadigitalapp.feature.carteirinha.domain.model.Carteirinha

interface CarteirinhaRepository {
    suspend fun buscarCarteirinha(): Result<Carteirinha>
}
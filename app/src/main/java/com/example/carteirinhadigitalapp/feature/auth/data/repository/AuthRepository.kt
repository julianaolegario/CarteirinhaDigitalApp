package com.example.carteirinhadigitalapp.feature.auth.data.repository

import com.example.carteirinhadigitalapp.feature.auth.domain.model.UsuarioLogado

interface AuthRepository {
    suspend fun login(login: String, senha: String): Result<UsuarioLogado>
}
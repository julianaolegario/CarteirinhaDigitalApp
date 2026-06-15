package com.example.carteirinhadigitalapp.feature.auth.data.repository

import com.example.carteirinhadigitalapp.feature.auth.domain.model.UsuarioLogado
import kotlinx.coroutines.delay

class FakeAuthRepository : AuthRepository {
    override suspend fun login(login: String, senha: String): Result<UsuarioLogado> {
        delay(1500)

        return if (login == "aluno" && senha == "123") {
            Result.success(
                UsuarioLogado(
                    id = "1",
                    nome = "Juliana Santos Olegario",
                    token = "token-fake-para-aula"
                )
            )
        } else {
            Result.failure(IllegalArgumentException("Login ou senha inválidos. Use aluno / 123."))
        }
    }
}

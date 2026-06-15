package com.example.carteirinhadigitalapp.feature.carteirinha.data.repository

import com.example.carteirinhadigitalapp.feature.carteirinha.domain.model.Carteirinha
import kotlinx.coroutines.delay

class FakeCarteirinhaRepository : CarteirinhaRepository {
    override suspend fun buscarCarteirinha(): Result<Carteirinha> {
        delay(1500)

        return Result.success(
            Carteirinha(
                nome = "Juliana Santos Olegario",
                curso = "Técnico em Desenvolvimento de Sistemas",
                turma = "4DEVM-T1",
                matricula = "24247616",
                unidade = "SENAI Anchieta",
                status = "Ativo",
                qrCodeContent = "MATRICULA:24247616;ALUNO:Juliana Santos Olegario;TURMA:4DEVM-T1"
            )
        )
    }
}
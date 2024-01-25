package formacao

import aluno.Aluno
import conteudoo.ConteudoEducacional


data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Aluno>()

    fun matricular(aluno: Aluno) {
        inscritos.add(aluno)
        println("Aluno(a) ${aluno.nome} se matriculou em:")
        conteudos.forEach { println(it.nome) }
    }
}
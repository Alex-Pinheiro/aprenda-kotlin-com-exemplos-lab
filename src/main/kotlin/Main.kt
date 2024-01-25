import conteudoo.ConteudoEducacional
import formacao.Formacao
import aluno.Aluno


enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

fun main() {

    val materiaUm = ConteudoEducacional("Java",  90, Nivel.INTERMEDIARIO)
    val materiaDois = ConteudoEducacional("Kotlin", dificuldade = Nivel.INTERMEDIARIO)
    val materiaTres = ConteudoEducacional("Javascript", 45, Nivel.INTERMEDIARIO)
    val materiaQuatro = ConteudoEducacional("HTML", 45, Nivel.BASICO)
    val materiaCinco = ConteudoEducacional("GO", dificuldade = Nivel.DIFICIL)

    val aluno1 = Aluno("Pedro", 15)
    val aluno2 = Aluno("Fernanda", 13)
    val aluno3 = Aluno("Pedro", 16)
    val aluno4 = Aluno("Jennifer", 19)
    val aluno5 = Aluno("Leonardo", 17)

    val Java = Formacao("Java", listOf(materiaUm, materiaQuatro))
    val Javascript = Formacao("Javascript", listOf(materiaTres))
    val Kotlin = Formacao("Kotlin", listOf(materiaDois))
    val GO = Formacao("GO", listOf(materiaCinco))

    Java.matricular(aluno1)
    GO.matricular(aluno2)
    Javascript.matricular(aluno5)
    Kotlin.matricular(aluno3)
    Javascript.matricular(aluno4)

}
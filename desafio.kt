// [Execute no Kotlin Playground](https://pl.kotl.in/1y3Pu0-tZ)

enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

data class Usuario(val nome: String)

data class ConteudoEducacional(var nome: String, val duracao: Int, val nivel: Nivel)

data class Formacao(val nome: String, val nivel: Nivel, var conteudos: List<ConteudoEducacional>) {
    val inscritos = mutableListOf<Usuario>()

    fun matricular(vararg usuarios: Usuario) {
        inscritos.addAll(usuarios)
    }
}

fun main() {
    val formacao = Formacao(
        nome = "Formação Kotlin",
        nivel = Nivel.BASICO,
        conteudos = listOf(
            ConteudoEducacional(nome = "Introdução ao Kotlin", duracao = 60, nivel = Nivel.BASICO),
            ConteudoEducacional(nome = "Fundamentos do Kotlin", duracao = 120, nivel = Nivel.BASICO),
            ConteudoEducacional(nome = "Programação Orientada a Objetos em Kotlin", duracao = 300, nivel = Nivel.INTERMEDIARIO)
        )
    )

    val usuario1 = Usuario(nome = "Márcio")
    val usuario2 = Usuario(nome = "Luiza")
    val usuario3 = Usuario(nome = "Sophia")

    formacao.matricular(usuario1, usuario2, usuario3)

    for (usuario in formacao.inscritos) {
        println("Usuario: ${usuario.nome}")
        println("Formação: ${formacao.nome}")
        val conteudosFormatados = formacao.conteudos.joinToString(separator = ", ") {
            "${it.nome} no nível ${it.nivel} (Duração: ${it.duracao} min)"
        }
        println("Conteúdo educacional: $conteudosFormatados.")
        println()
    }
}





fun main() {
    println("Digite o nome do usuário: ")
    val nome = readLine()!!.toString()

    println("Digite a idade do usuário: ")
    val idade: Int = readLine()!!.toInt()

    println("Digite o e-mail do usuário: ")
    val email = readLine()!!.toString()

    println("Digite se o usuário está ativo ou não (true/false): ")
    val ativo = readLine()!!.toBoolean() // Convertendo para booleano

    if (ativo) {
        println("$nome tem $idade anos, possui o email $email e sua conta se encontra ativa.")
    } else {
        println("$nome tem $idade anos, possui o email $email e sua conta se encontra inativa.")
    }
}

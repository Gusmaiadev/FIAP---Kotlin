fun main() {
    println("Informe um número para saber se é primo ou não: ")
    val num = readLine() ?: run {
        println("Entrada inválida!")
        return
    }

    val numInt = num.toIntOrNull()

    if (numInt == null || numInt <= 0) {
        println("Número inválido. Por favor, insira um número inteiro positivo!")
        return
    }


    var isPrime = true

    for (i in 2 until numInt) {
        if (numInt % i == 0) {
            isPrime = false
            break
        }
    }

    if (isPrime) {
        println("$numInt é um número primo")
    } else {
        println("$numInt não é um número primo")
    }
}
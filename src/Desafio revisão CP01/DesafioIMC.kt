import java.util.Scanner;

fun main() {
    val scanner = Scanner(System.`in`)
    var continuar: Char = 's'

    do {
        val imc = coletarDados()

        val categoria = when {
            imc < 18.5 -> "Excesso de Magreza"
            imc >= 18.5 && imc < 25 -> "Peso Normal"
            imc >= 25 && imc < 30 -> "Excesso de Peso"
            imc >= 30 && imc < 35 -> "Obesidade - Grau I"
            imc >= 35 && imc < 40 -> "Obesidade - Grau II"
            else -> "Obesidade - Grau III"
        }

        println("Seu IMC é: %.2f".format(imc))
        println("Categoria: $categoria")

        println("Deseja calcular novamente? (S/N):")
        continuar = scanner.next().single().lowercaseChar()
    } while (continuar != 'n')

    println("Obrigado por usar a calculadora de IMC!")
}

fun coletarDados(): Double {
    val scanner = Scanner(System.`in`)
    println("Digite seu peso em kg:")
    val peso: Double = scanner.nextDouble()

    println("Digite sua altura em metros:")
    val altura: Double = scanner.nextDouble()

    return peso / (altura * altura)
}

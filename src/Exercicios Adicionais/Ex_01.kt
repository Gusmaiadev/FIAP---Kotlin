// Crie um array de inteiros e calcule a soma de todos os elementos. Exiba o resultado na tela.

fun main(){

    val numeros = intArrayOf(3,6,9,8,2,1)
    var soma : Int = 0

    for (numero in numeros){
        soma += numero
    }

    println("A soma dos elementos é: $soma")

}




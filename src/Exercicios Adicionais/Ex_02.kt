// Dada uma lista de inteiros, encontre e exiba o maior número presente na lista.

fun main(){
    var numeros = listOf(4,6,2,9,3,12,18,10)

    var max = numeros[0]
    var min = numeros[0]

    for(numero in numeros){
        if(numero > max){
            max = numero
        }

        if(numero < min){
            min = numero
        }
    }

    println("O maior número é $max")
    println("O menor número é $min")

    
}


fun main() {
    
    val numeros = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    var somaPares = 0
    val pares = mutableListOf<Int>()

    
    for (numero in numeros) {
        if (numero % 2 == 0) {
            somaPares += numero
            pares.add(numero)
        }
    }
    
    println("Lista original: $numeros")
    println("Números pares: $pares")
    println("Soma dos números pares: $somaPares")
}
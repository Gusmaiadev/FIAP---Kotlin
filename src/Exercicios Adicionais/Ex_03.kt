// Crie um programa que percorra uma lista de inteiros e exiba todos os números pares presentes na lista.


fun main(){
    var numeros = listOf(1,4,2,8,44,12,19,3)
    val listaVazia = mutableListOf<Int>()

    for(numero in numeros){ // OPÇÃO 1
        if(numero %2==0){
            listaVazia.add(numero)
        }
    }

    for (numero in numeros) { // OPÇÃO 2
        if (numero % 2 == 0) {
            println(numero)
        }
}

    println("Números pares $listaVazia")


}
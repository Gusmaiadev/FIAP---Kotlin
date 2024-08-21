fun main(){
    println("Digite um número:")
    val numero = readLine()

     if(numero == null){
        println("Digita ai parceiro!!!")
        return
    }

    val numeroInt = numero.toIntOrNull()


    if(numeroInt == null){
        println("Numero inválido. Por favor, insira um número válido!!!")
        return
    }

    if(numeroInt %2 == 0){
        println("O numero e par")
    } else{
        println("O numero é impar")
    }
}
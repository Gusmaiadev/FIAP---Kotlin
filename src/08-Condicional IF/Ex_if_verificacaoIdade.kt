fun main(){
    print("Digite sua idade: ")
    val idade = readLine()

    // Verifica se a entrada é nula
    if(idade == null){
        println("Digita ai parceiro!!!")
        return
    }

    // Converte a entrada para Inteiro
    val idadeInt = idade.toIntOrNull()

    // Verifica se a conversão falhou (idadeInt é nulo)
    if(idadeInt == null){
        println("Idade inválida. Por favor, insira um número válido!!!")
        return
    }
    else if(idadeInt >= 18){
        println("Você é maior de idade!")
    } else{
        println("Você é menor de idade")
    }
}

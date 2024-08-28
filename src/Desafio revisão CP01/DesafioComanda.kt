fun main() {
    println("Bem vindo à Lanchonete do Gustavinho O Bala")
    println("Digite a opção que deseja pedir:")
    println("1 - coxinha R$5.00")
    println("2 - cerveja R$15.00")
    
    // Coxinha
    println("Digite a quantidade de coxinha que irá consumir: ")
    var coxinha = readLine()

    if (coxinha == null) {
        println("Quantidade necessária mesmo se for 0")
        return
    }

    var coxinhaInt = coxinha.toIntOrNull()

    if (coxinhaInt == null) {
        println("Quantidade inválida. Por favor, insira um número válido")
        return
    }

    // Cerveja 
    println("Digite a quantidade de cerveja que irá consumir: ")
    var cerveja = readLine()

    if (cerveja == null) {
        println("Quantidade necessária mesmo se for 0")
        return
    }

    var cervejaInt = cerveja.toIntOrNull()

    if (cervejaInt == null) {
        println("Quantidade inválida. Por favor, insira um número válido")
        return
    }

    var valorCerveja = 15.00 * cervejaInt
    var valorCoxinha = 5.00 * coxinhaInt
    var valorTotal = valorCerveja + valorCoxinha
    var valorTaxa = valorTotal * 0.1
    var valorTotalComTaxa = valorTotal + valorTaxa

    println("---------------------------------------")
    println(".: Lanchonete do Gustavinho o bala :.")
    println("---------------------------------------")
    println("$coxinhaInt coxinha\t\t\tR$${"%.2f".format(valorCoxinha)}")
    println("$cervejaInt cerveja\t\t\tR$${"%.2f".format(valorCerveja)}")
    println("Somatória\t\t\tR$${"%.2f".format(valorTotal)}")
    println("Taxa de serviço (10%)\t\tR$${"%.2f".format(valorTaxa)}")
    println("-----------------------------------------")
    println("Total com taxa\t\t\tR$${"%.2f".format(valorTotalComTaxa)}")
}
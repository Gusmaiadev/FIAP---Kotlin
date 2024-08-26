fun main() {
    val palavras = listOf("maçã", "banana", "maçã", "laranja", "maçã", "uva")
    val palavraParaContar = "maçã"
    var somaStrings = 0

    for (palavra in palavras) {
        if (palavra == palavraParaContar) {
            somaStrings += 1
        }
    }

    println("A quantidade de vezes que '$palavraParaContar' aparece é $somaStrings")
}

fun main(){
    println("Digite a nota da primeira avaliação:")
    var notaUm = readLine()!!.toDouble()

    println("Digite a nota da primeira avaliação:")
    var notaDois = readLine()!!.toDouble()

    println("Digite a nota da primeira avaliação:")
    var notaTres = readLine()!!.toDouble()

    fun media(a: Double, b: Double, c: Double): Double{
        var media: Double = (a + b + c) / 2
        return media
    }
    println("A média do aluno é " + String.format("%.2f", media(notaUm, notaDois, notaTres)))
}
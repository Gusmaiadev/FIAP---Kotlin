fun main() {
    var notaUm: Double = 5.0
    var notaDois: Double = 6.0
    var notaTres: Double = 2.5

    fun media(a: Double, b: Double, c: Double): Double {
        val media: Double = (a + b + c) / 3
        return media
    }

    println(media(notaUm, notaDois, notaTres))
}

fun main() {
    println("Digite sua temperatura: ")
    println("1 - Celsius")
    println("2 - Fahrenheit")
    println("3 - Kelvin")
    var temperatura = readLine()!!.toString()

    if (temperatura == "1") {
        println("Digite sua temperatura em Celsius: ")
        var celsius = readLine()!!.toDouble()
        var fahrenheit: Double = (celsius * 9 / 5) + 32
        var kelvin: Double = celsius + 273.15
        println("A temperatura convertida em Fahrenheit é $fahrenheit, e convertida em Kelvin é $kelvin")
    } else if (temperatura == "2") {
        println("Digite sua temperatura em Fahrenheit: ")
        var fahrenheit = readLine()!!.toDouble()
        var celsius: Double = (fahrenheit - 32) * 5 / 9
        var kelvin: Double = (fahrenheit - 32) * 5 / 9 + 273.15
        println("A temperatura convertida em Celsius é $celsius, e convertida em Kelvin é $kelvin")
    } else {
        println("Digite sua temperatura em Kelvin: ")
        var kelvin = readLine()!!.toDouble()
        var celsius: Double = kelvin - 273.15
        var fahrenheit: Double = (kelvin - 273.15) * 9 / 5 + 32
        println("A temperatura convertida em Celsius é $celsius, e convertida em Fahrenheit é $fahrenheit")
    }
}

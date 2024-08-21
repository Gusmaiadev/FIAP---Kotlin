fun main(){

    val nomeCerto = "Gusmaia"
    val senhaCerta = "123456"


    println("Digite o nome do usuáriao:")
    val nome = readLine();
    println("Digite o nome do senha:")
    val senha = readLine();

    if(nome == nomeCerto && senha == senhaCerta){
        println("Acesso aceito!!")
    } else{
        println("Acesso negado!!")
    }
}
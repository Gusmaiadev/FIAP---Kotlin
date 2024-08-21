fun main(){
   val idade = 25 
   val cartreiraMotorista = true

   if(idade >= 18 && cartreiraMotorista == true){
        println("Pode dirigir legamente")
   } else{
    println("Não pode dirigir!")
   }


   val ingresso = true
   val camisetaTime = false

   if(ingresso || camisetaTime){
    println("Você pode entrar")
   } else{
    println("Não pode entrar")
   }
}
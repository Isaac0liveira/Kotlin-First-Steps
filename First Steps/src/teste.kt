
fun main(){
    val Isaac = Usuario("Isaac", "Oliveira", 20)
    println(Isaac.nomeCompleto)
}

fun loop(){
    for(i in 0..60 step 2){
        println("Olá Mundo! Contagem = $i")
        Thread.sleep(1000)
    }
}

fun testeWhen(y: Int){
    println(y)
    var x = 10
    when{
        x == y -> println("Fim do programa")
        x < y -> testeWhen(y - 1)
        x > y -> testeWhen(y + 1)
    }
}

fun testeLength(){
    var palavra: String? = "Reuniones"
    println(palavra?.length?.plus(25) ?: 0)
}

fun testeLista() {
    /* val tArray = mutableMapOf(
        "nome" to "Isaac Oliveira",
        "idade" to "20",
        "cidade" to "Maracanaú",
        "estado" to "Ceará",
        "país" to "Brasil"
    )
    println(tArray)
    tArray.put("idade", "21")
    println(tArray)
    tArray.put("cidade", "Fortaleza")
    println(tArray)
    tArray.put("estado", "California")
    println(tArray)
    tArray.put("país", "EUA")
    println(tArray)
    tArray.put("nome", "George Washington")
    println(tArray)
    println("Uma nova pessoa. Identidade alterada!\nBoa Sorte George!!!")  */

    /* val array = mutableListOf<Any>(2,3,6,9,4,6,52,8,2,3,2,16,2)
    while(2 in array){
        println(array)
        array.remove(2)  }*/

    val array = mutableListOf<Int>(1,2,3,2,1,4,3,5,2,4,5,5)
    println(array.map {
        it - 10
    })
}

fun testeLambda(){
    val teste: (Int) -> Int = {
        it * it
    }
    println(teste(16))

    fun Lambda(x: Int, y: Int, function: (Int, Int) -> Int){
        println(function(x, y))
    }

    Lambda(2, 3){
        x, y -> x * y
    }
}

class Usuario(var nome: String, var sobrenome: String, var idade: Int){
    val nomeCompleto get() = "$nome $sobrenome"
}

import kotlin.random.Random

fun main(args: Array<String>) {
    println("Hello World!")


    // VIDEO 1

    var num1 = 0
    num1++

    val num2 = 0
    // num2++

    var lista1 = mutableListOf(1,2,3,4,5)

    val lista2 = mutableListOf(6,7,8,9,10)


    val num3 : Int? = 1

    // val num4 = num3 + num2 Esto no me deja xq num3 es de tipo INT? que es distinto del tipo INT

    if (num3 != null) {
        val num4 = num3 + num2
    } else {
        println("No puedo hacer la operación xq num3 es null")
    }

    num3?.let { // Si num3 no es un null, ejecuta el siguiente código
        val num4 = it + num2
    } ?: run {
        println("No puedo hacer la operación xq num3 es null")
    }

    when (num3) {
        0 -> println("Valor 0")
        1 -> {
            println("Valor 1")
            println(":)")
        }
        null -> {
            println("Valor nulo")
            println(":(")
        }
        else -> {
            println("Cualquier otra cosa")
        }
    }

    // Quiero tener un variable num4 que sea la suma de num3 y num2.
    // En caso de que num3 sea null, entonces multiplicamos num2 * num2

    // Método Java style - old school
    var num4 = 0
    if (num3 != null) {
        num4 = num2  + num3
    } else {
        num4 = num2 * num2
    }
    println("el resultado es $num4")

    val num5 = if (num3 != null) {
        println("Esto no afecta al resutlado.")

        num2  + num3
    } else {
        println("estoy en el else")
        num2 * num2
    }

    println("el resultado es $num5")


    var num6 = if (num3 != null) num2 + num3 else num2 * num2


    var num7 = when (num3) {
        0 -> "Valor 0"
        1 -> "Valor 1"
        null -> "Valor nulo"
        else -> "Cualquier otra cosa"
    }
    println(num7)

    // Que sería igual a :
    println(when (num3) {
        0 -> "Valor 0"
        1 -> "Valor 1"
        null -> "Valor nulo"
        else -> "Cualquier otra cosa"
    })


    // Video 2

    // Suma en num8 numeros aleatorios hasta que llegue a 100 (incluido)
    var condicionCumplida = false
    var num8 = 0

    while (!condicionCumplida) {
        num8 += Random.nextInt(10)
        if (num8 >= 100) condicionCumplida = true
        println(num8)
    }

    // Equivalente a los anterior
    num8 = 0
    while (num8 <= 100) {
        num8 += Random.nextInt(10)
        println(num8)
    }

    num8 = 0
    do { // Muy parecido a lo anterior pero forzando la entrada una vez
        num8 += Random.nextInt(10)
        println(num8)
    } while (num8 <= 100)

    repeat(10) {
        println("Estoy en la repetición $it")
    }

    num8 = 0
    for (i in 0..20) {
        println("Estoy en la repetición $i")
        num8 += Random.nextInt(10)
        if (num8 > 100) break
    }



}
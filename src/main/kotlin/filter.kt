var l1 = mutableListOf("Carlos", "Sergio", "Javier", "Ignacio","Manuel", "Stefanel", "Néstor")
var listadeVocales = listOf("a", "e", "i", "o", "u")

fun main() {

    println("Lista original = $l1")

    // Filtrado
    val r1 = l1.filter { true }
    println(r1)

    val r2 = l1.filter {
        it.startsWith("C")
    }
    println(r2)

    println("--------------EJER1--------------")
    val r3 = l1.filter {
        it.toLowerCase().contains("s") && !it.contentEquals("Sergio")}
    println(r3)


    println("--------------EJER2--------------")
    val r4 = l1.filter {
        it.length % 2 == 0}
    println(r4)

    println("--------------EJER3--------------")

    val r5 = l1.filter { nombre ->
        var empiezaVocal = false
        listadeVocales.forEach{ vocal ->
            if (nombre.startsWith(vocal, true)) empiezaVocal = true
        }
        nombre.length > 6 && empiezaVocal
    }
    println( "$r5")


        println("--------------EJER4--------------")
    val r6 = l1.filter {
        contarVocales(it) >= 3
    }
    println("$r6")
}
fun contarVocales(s: String):Int {
    var out = 0
    s.toLowerCase().forEach {
        if (listadeVocales.contains(it.toString())) out++
    }
    return out}
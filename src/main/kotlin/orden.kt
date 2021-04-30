


var l1 = mutableListOf("Carlos", "Sergio", "Javier", "Ignacio","Manuel", "Stefanel", "Néstor")

fun main() {

    println("Lista original = $l1")

    // Filtrado
    val r1  = l1.filter { true }
    println(r1)

    val r2  = l1.filter {
        it.startsWith("C")
    }
    println(r2)

    // Ej1: Busca a todas las personas que no se llaman Sergio pero que tienen una "s" en su nombre.
    // Ej2: Busca a todas las personas cuyo nombre tiene un número de letras par.
    // Ej3: Busca a todas las personas cuyo nombre tiene un número de letras superior a y que su nombre empieza por vocal.
    // Ej4: Busca a todas las personas cuyo nombre tiene que tengan más de 3 vocales distintas.

    // Orden


}
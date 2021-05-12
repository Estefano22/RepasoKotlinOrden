import kotlin.random.Random

class AlumnosComparables(var Nombre : String, var Nota : Int) : Comparable<AlumnosComparables>{
    override fun compareTo(other: AlumnosComparables): Int {
        return Nota - other.Nota
    }

    override fun toString(): String {
        return "$Nombre y ha sacado un $Nota "
    }
}
val listadeAlumnos = mutableListOf<AlumnosComparables>()

fun main() {

    var numeros = 0

    val listNumAleatorios = mutableListOf<Int>()

    repeat(100){
        numeros = (0..100).random()
        listNumAleatorios.add(numeros)
    }

    listNumAleatorios.sort()
    println("----------Ordénalos de menor a mayor----------")
    println("Numeros ordenados de menor a mayor es: $listNumAleatorios")

    listNumAleatorios.sortDescending()
    println("----------Ordénalos de mayor a menor----------")
    println("Numeros ordenados de mayor a menor es: $listNumAleatorios")



    println("Lista nueva de los numeros ordenados de menor a mayor :${listNumAleatorios.sorted()}")
    println("Lista nueva de los numeros ordenados de mayor a menor :${listNumAleatorios.sortedDescending()}")


    repeat(100){
    val alumno = AlumnosComparables("Alumno ${it+1}", Nota = Random.nextInt(0,10))
    listadeAlumnos.add(alumno)
}
    println("----------Ordenados por Nota----------")
    listadeAlumnos.sortByDescending { it.Nota }
    listadeAlumnos.forEach { println(it.toString()) }


    println("----------Ordenados Alfabeticamnete----------")

    listadeAlumnos.sortBy { it.Nombre }
    listadeAlumnos.forEach { println(it.toString()) }

    println("----------Ordenados longhitud----------")
    listadeAlumnos.sortBy { it.Nombre.length }
    listadeAlumnos.forEach { println(it.toString()) }
    

}
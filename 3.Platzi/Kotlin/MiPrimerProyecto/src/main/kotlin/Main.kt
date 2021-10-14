
const val pi=3.1416 //para declarar constantes, se hacen fuera de la función main

fun main(args: Array<String>) {
    println("Hello World!")
    var dinero =10
    println(dinero)
    dinero=5
    println(dinero)

    val nombre="maria"     //variables de solo lectura
    println(nombre)
    println(pi)

    val boolean=true
    val numeroLargo =748547885500000000L
    val double =2.7182
    val float =1.1f

    val primerValor=20
    val segundoValor=10
    val tercerValor= primerValor.minus(segundoValor)//función para realizar esta entre el primer valor y el segundo valor
    tercerValor.inc()
    tercerValor.dec()
    println(tercerValor)

    val apellido="Ajset"
    val name="Edgar"
    val nombreCompleto= "Mi nombre es $name $apellido"//simbolo de dolar se utiliza para usar variables, dentro del texto.. esto es denominado un template
    println(nombreCompleto)
}
fun main(args: Array<String>){
    val nombre = ""

    if(nombre.isNotEmpty()) println("El largo de nuestra variable nombre es: ${nombre.length}")
    else println("Error, la variable es vacia")

    val mensaje: String = if(nombre.length>4) "Tu nombre es largo!"
    else if(nombre.isEmpty()) "No ha ingresado un nombre"
    else "Tienes un nombre corto"

    println(mensaje)

    val nombreColor="Carmesi"
    when(nombreColor){
        "Amarillo" -> println("El amarillo es el color de la alegria")
        "Rojo","Carmesi" -> println("El rojo simboliza el calor")
        else -> println("Error no tengo información del color")
    }

    val code=620
    when(code){
        in 200..299 -> println("Esta en el rango")
        in 400..500 -> println("No esta en el rango")
        else -> println("Codigo desconocido")
    }

    val tallaDeZapatos=49
    val mensaje2=when(tallaDeZapatos){
        41,43 -> println("Si está disponible")
        42,44 -> println("Poca existencia")
        45 -> println("No disponible")
        else -> println("No existe registro de esa talla")
    }
}
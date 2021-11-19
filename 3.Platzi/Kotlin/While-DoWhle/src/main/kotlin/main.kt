fun main(args: Array<String>){
    var contador=10
    while(contador >0){
        println("El valor de contador es $contador")
        contador--
    }
    do{
        println("Generando numero aleatorio...")
        val numeroAleatorio = (0..100).random()
        println("El numero generado es $numeroAleatorio")
    }while(contador>50)

    //Declaración de una lista en Kotlin
    var listaDeFrutas = listOf("Manzana","Pera","Frambuesa","Durazno")

    //For común en Kotlin
    for(fruta in listaDeFrutas) println("Hoy voy a comer: $fruta")

    //Sintaxis de For Each
    listaDeFrutas.forEach { fruta->println("La fruta es: $fruta") }

    //Declaración explicita de una lista de enteros
    val caracterDeFrutas: List<Int> = listaDeFrutas.map { fruta-> fruta.length }
    println(caracterDeFrutas)

    //función filter para traer elementos en base a una condición
    val listaFiltrada = caracterDeFrutas.filter { largoNombre-> largoNombre>5 }
    println(listaFiltrada)
}
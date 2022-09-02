fun main() {
    println("Ingresa el nombre")
    var nom = readLine()!!.toString()

    println("Ingresa la edad")
    var ed = readLine()!!.toInt()

    println("Ingresa la calificacion")
    var cal = readLine()!!.toInt()

    val cons1 = Alumno(nom)
    val cons2 = Alumno(nom, ed, cal)

    cons1.printInfo()
    cons1.mayorEdad()
    cons1.promedio()
    println("------")
    cons2.printInfo()
    cons2.mayorEdad()
    cons2.promedio()
}

class Alumno(){
    var nombe:String = ""
    var edad:Int = 0
    var calificacion:Int =0

    constructor(nombe:String):this(){
        this.nombe = nombe
    }

    constructor(nombe:String, edad:Int, calificacion:Int):this(){
        this.nombe = nombe
        this.edad = edad
        this.calificacion = calificacion
    }

    fun printInfo(){
        println("Los datos son: \nNombre: ${nombe} \t  Edad: ${edad} \t Calificacion: ${calificacion}")
    }

    fun mayorEdad(){
        if (edad >= 18) {
            println("Es mayor de edad")
        }else{
            println("No es mayor de edad")
        }
    }

    fun promedio(){

        when(calificacion){
            in 0..7 -> { println("Reprobado") }
            in 8..9 -> { println("Aprobado")}
            10 -> println("Excelente")
            else -> println("El dato esta mal")
        }
    }
}
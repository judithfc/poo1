def calificaciones()={
println("Ingrese las siguientes calificaciones")
println("Primera calificacion")
val calificacion1=readFloat()

println("Segunda calificacion")
val calificacion2=readFloat()

println("Tercera calificacion")
val calificacion3=readFloat()

println("Examen final")
val calificacionfinal=readFloat()

println("Trabajo final")
val trabajofinal=readFloat()

val promedio= (calificacion1 + calificacion2 + calificacion3)/3

val ultima= promedio *.55 
+ trabajofinal *.15 
+ calificacionfinal *.3

println("calificacion =" +ultima)
}

def hospital()={

println("Ingrese el presupuesto anual")

val cantidading = readFloat()
val ginecologia = cantidading *.4
val traumatologia = cantidading *.3
val pediatria = cantidading *.3

println ("Cantidad de dinero que recibira el area de Ginecologia:" + ginecologia)
println ("cantidad de dinero que recibira el area de Traumatologia:"+ traumatologia)
println ("Cantidad de dinero que recibira el area de Pediatria:"+ pediatria)

}

def porcentajes()={
println("Cantidad 1")
val cantidad1 = readFloat()

println("Cantidad 2")
val cantidad2 = readFloat()

println("Cantidad 3") 
val cantidad3 = readFloat()

val total= cantidad1 + cantidad2 + cantidad3

println("porcentaje 1")
val porcentaje1= (cantidad1 * 100)/total
println("" + porcentaje1)

println("porcentaje2")
val porcentaje2=(cantidad2 * 100)/total
println(" "+ porcentaje2)

println("porcentaje3")
val porcentaje3= (cantidad3 *100)/total
println(" "+ porcentaje3)

}

println("Elija el programa que desea ejecutar")
println("1.- Calificacion")
println("2.- Presupuesto de un hospital")
println("3.- Porcentaje de una inversion")

val opcion=readInt()

opcion match{
case 1 => calificaciones()
case 2 => hospital()
case 3 => porcentajes()
case default => println("Opcion invalida")
}


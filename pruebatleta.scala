println("Programa que determinara si un atleta es apto")

var promedio=0


for(i <- 1 to 10)
{

println("Ingrese el tiempo de la prueba"+i)
val tiempo=readInt()

if(tiempo > 16 ){

println("No es apto para la prueba")
} else {
 
 println("Es apto para la prueba")
}

promedio = promedio + tiempo
}

val total=promedio/10

println("Su promedio de tiempos es: + total")

if (total <= 15){
println("Es apto para la prueba")

} else {
println("No es apto para la prueba")
}































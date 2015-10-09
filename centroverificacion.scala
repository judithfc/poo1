var puntoscontaminantes = 0
var maximo = -1
var minimo = 101 
var suma = 0

for (i <- 1 to 25){

println("Ingresa los puntos contaminantes: " )
puntoscontaminantes=readInt()
 
if (puntoscontaminantes < minimo){
minimo = puntoscontaminantes
}

if (puntoscontaminantes > maximo){
maximo = puntoscontaminantes
}

suma +=puntoscontaminantes
}


println("El promedio de puntos contaminantes es: " +(suma/25))
println("Los puntos del  mas contaminante son: " + maximo )
println("Los puntos del que menos contamino son: " + minimo)




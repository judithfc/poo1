println("Ingrese el numero de piezas que se adquiriran")
val pieza=readFloat()

println("Ingrese el costo de la pieza: $")
val cos=readFloat()

val mtotal=(pieza*cos)
println("la cantidad total que pagara es de:" + mtotal)


if (mtotal > 500){
val emp=mtotal*.55
println("La empresa invertira de su propio dinero la cantidad de: $ " + emp)

val banc=mtotal*.30
println("La Prestacion del banco es de: $" + banc)

val fab=(mtotal*.15)*.20
println ("Cantidad que pagara a credito al fabricante es de: $ " + fab)

}

if(mtotal <=500){

val emp=mtotal*.70
println("La empresa invertira de su propio dinero la cantidad de: " + emp)

val fab=(mtotal*.30)*.20
println("Cantidad que pagara a credito al fabricante" + fab)
}



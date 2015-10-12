def salario()={
println("ingrese el numero de horas trabajadas")

val hrsn = readFloat()

if(hrsn <=40) 
{
val ss = hrsn*160
println("el salario semanal es de: "+ss)


} 

if (hrsn >40)
{
val ss=(hrsn*160)+200

println("el salario semanal es de: "+ss)
}


}

def fabrica()={
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

}


println("Elija el programa que desea ejecutar")
println("1)Salario semana de un obrero")
println("2)Fabrica de refacciones")

val opcion=readInt()
opcion match{

case 1 => salario()
case 2 => fabrica()
case default => println("opcion invalida")
}

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

println("Ingrese el total de su compra: $")
val total=readFloat()

println("Se realizara un descuento correspondiente al color de la bolita que salga")

println("blanca 0%, verde 10%, amarilla 25%, azul 50%, roja 100%")

println("Ingrese el color de la bolita que saco: ")
val bol=readLine()


if(bol == "blanca"){
val desc=(total*100)/100
println ("El total de su compra con el descuento realizado es:$ " +desc)
}
if (bol == "verde"){
val desc=(total*10)/100
println("El total de su compra con el descuento realizado es:$"+ desc)
}
if (bol == "amarilla"){
val desc=(total*25)/100
println("El total de su compra con el descuento realizado es:$" + desc)
}
if (bol == "azul"){
val desc=(total*50)/100
println("EL total de su compra con el descuento realizado es:$ " + desc)
}
if (bol == "roja"){
val desc=(total*0)/100
println("El total de su compra con el descuento realizado es:$ " + desc)
}
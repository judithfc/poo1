println("Selecciona un programa")
println("1) Numeros positivos, negativos y neutros")
println("2) Cual es la calificacion menor de un grupo de 40 alumnos")
println("3) Reloj")
println("4) Expendio de naranjas -descuento-")

val eleccion = readInt ()

eleccion match{
         case 1 => numeros()
         case 2 => calificacionmenor()
         case 3 => reloj()
         case 4 => expendionaranjas()
         case default => println("numero invalido")
}

def numeros(){
var numero = 0.0
var cantidadpositivos = 0
var cantidadnegativos = 0
var cantidadneutros = 0

for (i <- 1 to 20){
    println("Ingresa un numero")
    numero=readFloat()

if (numero >0){
    cantidadpositivos +=1
}else if (numero < 0){
    cantidadnegativos +=1
}else{
    cantidadneutros +=1
}
}
println("Ingresaste" + cantidadpositivos + "numeros positivos")
println("Ingresaste" + cantidadnegativos + "numeros negativos")
println("Ingresaste" + cantidadneutros + "numeros neutros")
}

def calificacionmenor(){
var menor = 11.0
var calificacion = 0.0
 for (i <- 1 to 40) 
{
 
println("Ingresa tu calificacion")
 calificacion = readFloat()
 

if(calificacion < menor){
    menor = calificacion
 }
} 
println("La calificacion menor es:" + menor)
}
def reloj(){
println ("Reloj")
 for (horas <- 0 to 23){
      for (minutos <- 0 to 59){
           for (segundos <- 0 to 59){
 
println(horas + ":" + minutos + ":" + segundos + ":")

}
}
}
}

def expendionaranjas(){
var kilos = 0.0
var totalcliente = 0.0
var totaltienda = 0.0

println("Cuanto cuesta el kilo de naranja?")
val preciokilo = readFloat()

for (i <- 1 to 15) {
    println("cuantos kilos compraste")
    kilos=readFloat()
    totalcliente= preciokilo * kilos

if (kilos > 10){
   totalcliente = totalcliente * .85
}
   totaltienda = totalcliente
println("Vas a pagar: " + totalcliente)
}
println("La tienda va a recibir: " + totaltienda)
}
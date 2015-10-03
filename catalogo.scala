
var nombre = new Array[String](50)
var precios = new Array[Float](50)
var codigos = new Array[String](50)
var opcion = 3 
var i = 0
catalogo()

def catalogo(){

do {
   mostrarmenuprincipal()
   opcion = readInt()
   opcion match {
      case 1 => agregarproductos()
      case 2 => println("Aun no hay que hacerlo...")
      case default => println ("Adios...")
   } 
 }while (opcion !=3)
}

def mostrarmenuprincipal(){ 
    println("1) Agregar productos")
    println("2) Nota")
    println("3) Salir")
}

def agregarproductos() {
   var continuar = 'N'
   do {
     i += 1
       capturardatosproducto()
       mostrarcatalogoproductos()
       println("Quieres agregar otro producto? (S/N)")
       continuar = readChar()
  } while (continuar == 'S')
}

def capturardatosproducto(){
    println("Ingresa los datos del producto")
    println("Nombre")
    nombre(i) = readLine()
    println("Precio")
    precios(i) = readFloat()
    println("Codigo de barras")
    codigos(i) = readLine()
}

def mostrarcatalogoproductos(){
    println("Nombre | Precio | Codigo")
    for (j <- 1 to i){
    println(nombre(j) + " | " + precios(j) + " | " + codigos(j))
  }
}






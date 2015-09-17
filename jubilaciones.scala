println("Para saber en que tipo de jubilacion sera, ingrese su edad: ")
val edad=readFloat()

println("Ingrese la antiguedad en su empleo: ")
val anti=readFloat()


if ((edad >=60)&&(anti <25)){
println("La jubilacion es por EDAD")}

if ((edad < 60)&&(anti >=25)){
println("La antiguedad es por ANTIGUEDAD JOVEN")}

if ((edad >=60)&&(anti >=25)){
println("La jubilacion es por ANTIGUEDAD ADULTA")}

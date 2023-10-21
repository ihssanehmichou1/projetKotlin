package tp3
 data class Circle(val radius: Double) {
 }
fun main(){
    fun Circle.calculerPerimetre(): Double {
        return 2 * Math.PI * radius
    }
    val myCircle = Circle(10.0)
    val perimetre = myCircle.calculerPerimetre()
    println("Le périmètre du cercle est ${perimetre}")

}


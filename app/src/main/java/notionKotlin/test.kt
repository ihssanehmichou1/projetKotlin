package notionKotlin

fun isOldEnough(age:Int):Boolean{
    return age>=5
}
fun describePeople(prenom:String, age:Int, height:Float){
    var canPlayBasket = when(isOldEnough(age)){
        true -> "peut pratiquer le basketball"
        false -> "ne peut pas pratiquer le basketball"
    }
    println("$prenom a $age ans et $height m")
}
fun describePeople(prenom:String, age:Int, height:Float, details:String="pas de detail"){
    var canPlayBasket = when(isOldEnough(age)){
        true -> "peut pratiquer le basketball"
        false -> "ne peut pas pratiquer le basketball"
    }
    println("$prenom a $age ans et $height m ($details) ")
}
fun main() {
    var prenom: String = "Ihssane"
    var age: Int = 21
    var height: Float = 1.7f
    isOldEnough(age)
    describePeople("Ihssane", 21,1.7f)
    describePeople("Ihssane", 21,1.7f, details = "champion")

}
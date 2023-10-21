package exerciceKotlin

class Animal(var nom:String, var age:Int) {
    fun afficherInfos(){
        println(" le nom de l'animal:$nom")
        println("l'age del'animal: $age")
    }
}
fun main(){
    var a1=Animal("ch1",2)
    var a2=Animal("ch2",3)
    a1.afficherInfos()
    a2.afficherInfos()
}
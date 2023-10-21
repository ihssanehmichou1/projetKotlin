package notionKotlin

 open class personne(var nom:String, var age:Int) {
    init {
        println("personne cree")
    }
      open fun afficherInfos(){
         println("$nom a l'age de $age")
     }
}
class Student(nom: String,age: Int, var moy:Float):personne(nom,age){
    init {
        println("student created")
    }
    override fun afficherInfos(){
        println("$nom a l'age de $age , $moy")
    }
}
fun main(){
    var s1= Student("ihssane",21,1.7f)
    s1.afficherInfos()
    var s2:personne = Student("ihsane",23,1.63f)
    s2.afficherInfos()
}
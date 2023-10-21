package notionKotlin

//class personneP(var nom:String, var age:Int) {
//    init {
//        var n:String=nom
//        var a:Int=age
//        println("****init****")
//    }
//    fun afficherInfos(){
//        println("${nom} est agee de ${age} ")
//    }
//
//}
//fun main(){
//    var p1=personneP("ihssane",21)
//    println(p1)
//    p1.afficherInfos()
//}

class joueurP(var nom:String,var age:Int, var height:Float){
    constructor(a:Int,h:Float):this ("Joueur",a,h)
    constructor(a:Int):this(a,1.57f)
    constructor(n:String):this (18)

    init {
        var canPlay = age>5 && height>1.6f
        var message = when(canPlay){
            true -> "Can play basket"
            false -> "Can't play basket"
        }
    }
}
fun main(){
    var j1=joueurP("ihsane",23,1.6f)
    var j2=joueurP("khaoula",21,1.71f)
    var j3=joueurP("elaziza",24,1.73f)
    var j4=joueurP("ihssane",21,1.7f)

}
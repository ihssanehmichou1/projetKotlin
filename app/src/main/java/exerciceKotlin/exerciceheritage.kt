package exerciceKotlin

open class Forme(var couleur:String) {
    fun afficherCouleur(){
        println("${couleur} est la couleur de forme")
    }

}
class Cercle(couleur: String,var rayon:Double):Forme(couleur){
    fun aireCercle(){
//    var aire=Math.PI * rayon * rayon
//        println("l'aire de cercle est: ${aire}")
        println("l'aire d'un cercle est:${(rayon*2)*3.14}")
    }
}
class Rectangle(couleur: String,var largeur:Double,var hauteur:Double):Forme(couleur){
    fun aireRectangle(){
        println("l'aire du rectangle est: ${largeur*hauteur} ")
    }
}
fun main(){
    var c1=Cercle("bleu",3.5)
    var r1=Rectangle("noir",5.0,7.0)
    c1.afficherCouleur()
    r1.afficherCouleur()
    r1.aireRectangle()
    c1.aireCercle()
}
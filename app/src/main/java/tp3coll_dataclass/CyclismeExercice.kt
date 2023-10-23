package tp3coll_dataclass

import java.util.Date

data class Etape(
    var nom:String,
    var dateDebut:Date,
    var dateFin:Date,
    var distance:Double,
    val difficulte:String){

}
sealed class Resultat(
    var tempseffectue:Int,
    var classement:Int){
    data class Termine(var tempseffectueT: Int,var classementT: Int) : Resultat(tempseffectueT,classementT)
    data class abandonne(var distanceParcourue:Int,var raison:String) : Resultat(0,0)

}
class Cycliste(
    var nomC:String,
    var prenomC:String,
    var nationalite:String,
    var age:Short) {
    var  list_cycliste: HashMap<Etape, Resultat> =hashMapOf()

    fun nouvelleEtape(etape: Etape, resultat: Resultat) {
        list_cycliste[etape] = resultat
    }

    override fun toString(): String {
        return "Le cycliste $nomC $prenomC de $age ans est de nationalité $nationalite et participe à l'étape $list_cycliste"
    }
}
fun main(){
    val cycliste=Cycliste("Hmichou","Ihssane","Marocaine",21)
    val dateDebut=Date()
    val dateFin=Date()

    var etape1=Etape("E1",dateDebut,dateFin,100.0,"facile")
    var etape2=Etape("E2",dateDebut,dateFin,120.0,"moyenne")
    var etape3=Etape("E3",dateDebut,dateFin,140.0,"difficile")

    var resultat1=Resultat.Termine(30,1)
    var resultat2=Resultat.abandonne(25,"probleme")
    var resultat3=Resultat.Termine(31,3)

    cycliste.nouvelleEtape(etape1,resultat1)
    cycliste.nouvelleEtape(etape2,resultat2)
    cycliste.nouvelleEtape(etape3,resultat3)

     println(cycliste)

}
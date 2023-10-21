package exerciceKotlin

class compteB(var titulaire:String, var solde:Double) {
    fun depot(montant:Double){
        if (solde>0){
            solde+=montant
            println("montant ajoute")
        }
        else{
            println("montant non ajoute")
        }
    }
    fun retrait(montant: Double){
        if (montant<solde && solde>0 ){
            solde-=montant
            println("montant retire")
        }
        else{
            println("montant non retire")
        }
    }
    fun afficherSolde(){
        println("$solde")
    }
}
fun main(){
   var c1=compteB("ih",1500.0)
    var c2=compteB("ihss",3500.0)
    c1.depot(3000.0)
    c2.retrait(500.0)
    c1.afficherSolde()
    c2.afficherSolde()

}
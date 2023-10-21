package exerciceKotlin

open class Produit(var code:Int,var prix:Float) {
//    init {
//
//    }
    fun getCode(){
        return println("${code}")
    }
    fun setCode(){

    }
    open fun prixProduit(){
        println("le prix est: ${prix}")
    }

    override fun toString(): String {
        return super.toString()
    }
}
class ProduitEnSolde(code: Int,prix: Float,var remise:Float):Produit(code, prix){
//    constructor(code: Int,prix: Float,remise: Float) : this(1,1500.0f,12.5f)
    override fun prixProduit() {
        super.prixProduit()
    }
//    override fun toString() {
//        println("le produit en solde du code ${code} et le prix ${prix}")
//    }
}
class Boutique(val Produits: ArrayList<Produit> = arrayListOf()){
    
}
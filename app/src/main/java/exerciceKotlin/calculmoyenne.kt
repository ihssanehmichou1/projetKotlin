package exerciceKotlin

fun main(){
    println("Veuillez entrez un nombre n:")
    val n = readLine()?.toIntOrNull() ?: 0

    var S = 0

    for ( i in 1..n){
        println("entrez le nombre $i :")
        S+=n
    }
    val moyenne=S/n

    println("la moyenne des nombres est:$moyenne")
}
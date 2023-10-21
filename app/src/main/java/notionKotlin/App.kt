package notionKotlin
fun main() {
    var nom: String = "Hmichou"
    var prenom: String = "Ihssane"
    var age: Short = 21
    var age1: Number=7
    var height: Float = 1.70F

    println("${nom.uppercase()} ${prenom} a ${age} ans , et ${height} m ")

    println("$nom $prenom a $age ans , et $height m")

    println(
        "les informations"
                + "\nNom:${nom}"
                + "\nPrenom:${prenom}"
                + "\nAge:${age}ans"
                + "\nHeight:${height}m"
    )

    println(
        """Raw String
        |NOm:${nom}
        |prenom:${prenom}
        |Age:${age}
        |Height:${height}
    """.trimMargin()
    )

    val nameT: String? = "Firdaous"
    nameT == null
    println("${nameT?.length}")
//    if (nameT!=null)
//        println("${nameT.length}")
    if (age < 5) {
        println("$prenom est petite")
    }
    if (age > 7 && height > 1.55F) {
        println("$prenom peut pratiquer basketball")
    } else {
        println("$prenom ne peut pas pratiquer le basketball")
    }
    if (prenom == "Ihssane") {
        println("$prenom est une fille")
    } else if (prenom == "Hassan") {
        println("$prenom est un garçon")
    } else {
        println("il n'a pas de genre")
    }
    when(prenom){
        "Ihssane" -> println("$prenom est une fille")
        "Hassan" -> println("$prenom est un garçon")
    }
    var type = if (prenom == "Ihssane") "fille" else "garçon"
    println(type)
    println("$prenom est un $type")

    when{
        age1 in 1..6 -> println("$prenom est petit")
        age1 in 7..20 -> println("$prenom peut pratiquer le basket")
        age1 !in 1..25 -> println("$prenom ne peut pas jouer le basket")
        else -> println("condition non geree")
    }
    var canPlay = when(age1){
        in 6..10 -> true
        else -> false
    }
    when(age1){
        is Int -> println("c'est un entier")
        is Byte -> println("c'est un byte")
        is Float -> println("c'est un reel")
    }


}

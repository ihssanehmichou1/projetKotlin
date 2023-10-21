package notionKotlin

fun main(){
    for (i in 0..9){
        println(i)
    }
    //definer une liste
    val names: Array<String> = arrayOf("ihssane","firdaous","jihane","meryem")

    for (name in names){
        println(name)
    }
    //avec index
    for ((index, name) in names.withIndex()){
        println("${name} est a l'index ${index}")
    }
    //while
    var age:Int = 0
    while (age < 5){
        println(" Tu as maintenant ${age} ans , tu peut jouer au basket!")
    }
    //for + continue
    for (name in names){
        if (name == "FatimaEzahra"){
            println("${name} est absent")
            continue
        }
        println("${name} est present")
    }
    //for + break
    val captainName: String = "FatimaEzahra"
    for(name in names){
        if(name == captainName){
            println("nous avons trouve le capitain ${name}")
            break
        }
        println("${name} n'est pas capitaine")
    }
}
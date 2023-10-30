package function_high_order

class Module(
    val intitule: String,
    val siRegional: Boolean,
    val termine: Boolean,
    val nbHeures: Int
)

fun main(){
    val list_modules = mutableListOf<Module>()

    val module1 = Module("java",true,true,120)
    val module2 = Module("kotlin",true,false,120)
    val module3 = Module("soft skills",false,false,30)

    list_modules.add(module1)
    list_modules.add(module2)
    list_modules.add(module3)

    list_modules.add(Module("français",false,false,50))
    for (Module in list_modules){
        println("Intitule ${Module.intitule}")
        println("siregional ${Module.siRegional}")
        println("termine ${Module.termine}")
        println("nombres heures ${Module.nbHeures}")
        println()
    }

    println("Utilusation de forEach avec it")
    list_modules.forEach{
        println("Module : ${it}")
    }

    println("Utilusation de forEach avec it.intitule")
    list_modules.forEach {
        println("Intitule : ${it.intitule}")
    }

    val menu = list_modules.map{ it.intitule }
    println(menu)

    val modulesRegionaux = list_modules.filter { it.siRegional }
    println(modulesRegionaux)

    val modulesRegionauxIntitules = list_modules.map { it.intitule }
    println(modulesRegionauxIntitules)

    val numeros = listOf<Int>(1,2,-8,87,-7,32,-41,-78)
    val numerosGR = numeros.groupBy { it >= 0 }
    println(numerosGR)


}

package exerciceKotlin

class Etudiant (var name:String,var code:Int,var sexe:String,var adresse:String,var age:Int){

}

    fun main() {
        var etudiants = ArrayList<Etudiant>(10)
        etudiants.add(Etudiant("ihsane",1, "femme", "safi", 23))
        etudiants.add(Etudiant("khaoula",3, "femme", "rabat", 21))
        etudiants.add(Etudiant("otmane",2, "homme", "fes", 20))
        etudiants.add(Etudiant("ihssane", 4, "femme", "souira", 21))
        etudiants.add(Etudiant("elaziza", 5, "femme", "marakech", 24))
        etudiants.add(Etudiant("othmane", 6, "homme", "bengrir", 20))
        etudiants.add(Etudiant("saad", 7, "homme", "yossofia", 23))
        etudiants.add(Etudiant("ayoub", 8, "homme", "casa", 21))
        etudiants.add(Etudiant("walid", 9, "homme", "jdida", 20))
        etudiants.add(Etudiant("elmehdi", 10, "homme", "agadir", 23))
        val triesparage = etudiants.sortBy { it.age }
        println(triesparage)
        println("liste triee par age")
        val triesparsexe = etudiants.groupBy { it.sexe }
        println(triesparsexe)
        println("liste triee par sexe")
        val filles = triesparsexe["femme"]
        val garçons = triesparsexe["homme"]
        println(garçons?.firstOrNull()?.name)
        println("question5")
        val listnoms = etudiants.map { it.name }
        println(listnoms)
        println("listes des noms map")
        val listfiltres = etudiants.filter { it.sexe != "femme" }
        println(listfiltres)
        println("liste filtres")
//        println(etudiants.first { it.sexe =="homme"}.name)
        val listinverse=etudiants.reversed()
        println("liste reversee")
        etudiants.clear()
    }




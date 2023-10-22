package tp3coll_dataclass

import notionKotlin.joueurP


data class joueurbasket(
    var nom: String,
    var numero: Int,
    var equipe: Equipe,
    var nomPoint: Int,
    var pays: Pays
)

enum class Equipe {
    OCS, OCK, RCA, WAC
}

enum class Pays {
    MAROC, TUNISIE, MAURITANIE, KOREA
}

class Equipes(pays: Pays, equipe: Equipe) {
    var list_joueurs = mutableListOf<joueurbasket>()

    fun ajout(joueur: joueurbasket): Boolean {
        if (joueur !in list_joueurs) {
            list_joueurs.add(joueur)
            return true
        }
        return false
    }

    fun recherche(nomJoueur: String): Int {
        for (index in list_joueurs.indices) {
            if (list_joueurs[index].nom == nomJoueur) {
                return index
            }
        }
        return -1
    }
    fun supression(nomJoueur: String): Boolean {
        val joueurIndex = list_joueurs.indexOfFirst { it.nom == nomJoueur }
        if (joueurIndex != -1) {
            list_joueurs.removeAt(joueurIndex)
            return true
        }
        return false
    }


}

fun main() {
    val equipe1 = Equipes(Pays.MAROC, Equipe.OCS)

    val joueur1 = joueurbasket("ihssane",57955,Equipe.OCS,20,Pays.MAROC)
    val joueur2 = joueurbasket("khaoula",56595,Equipe.OCK,25,Pays.MAURITANIE)
    val joueur3 = joueurbasket("elaziza",56897,Equipe.RCA,25,Pays.TUNISIE)
    val joueur4 = joueurbasket("ihssane",89745,Equipe.WAC,45,Pays.KOREA)

    equipe1.ajout(joueur1)
    equipe1.ajout(joueur2)
    equipe1.ajout(joueur3)
    equipe1.ajout(joueur4)

    val nomJoueurRecherche = "Joueur1"
    val indiceJoueur = equipe1.recherche(nomJoueurRecherche)
    equipe1.supression("joueur1")
    if (indiceJoueur != -1) {
        val joueurTrouvee = equipe1.list_joueurs[indiceJoueur]
        println("Le joueur $nomJoueurRecherche a été trouvé dans l'équipe ${joueurTrouvee.equipe}.")
    } else {
        println("Le joueur $nomJoueurRecherche n'existe pas dans l'équipe.")
    }
}



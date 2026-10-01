fun lireEntier(): Int {
    while (true) {
        print("Veuillez saisir un nombre entier : ")
        val saisie = readlnOrNull()
        try {
            if (saisie == null) throw IllegalArgumentException()
            return saisie.toInt()
        } catch (e: NumberFormatException) {
            println("Erreur : Ce n'est pas un nombre entier valide. Réessayez.")
        }
    }
}

fun main() {
    val nombre = lireEntier()
    println("Vous avez saisi le nombre valide : $nombre")
}

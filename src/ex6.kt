fun convertirEnEntiers(liste: List<String>): List<Int> {
    val listeConvertie = mutableListOf<Int>()
    for (chaine in liste) {
        try {
            val entier = chaine.toInt()
            listeConvertie.add(entier)
        } catch (e: NumberFormatException) {
            println("Erreur : Impossible de convertir \"$chaine\" en entier. Passage à la suite.")
        }
    }
    return listeConvertie
}

fun main() {
    val listeChaines = listOf("10", "25", "abc", "44", "1.5", "100")
    val resultat = convertirEnEntiers(listeChaines)
    println("Liste des entiers convertis : $resultat")
}

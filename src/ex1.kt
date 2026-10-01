fun findMax(liste: List<Int>, comparer: (Int, Int) -> Int): Int? {
    if (liste.isEmpty()) return null

    var max = liste[0]
    for (i in 1 until liste.size) {
        max = comparer(max, liste[i])
    }
    return max
}

fun main() {
    val maListe = listOf(12, 45, 7, 89, 23, 56)
    val lambdaMax = { a: Int, b: Int -> if (a > b) a else b }
    val resultat = findMax(maListe, lambdaMax)

    println("La liste est : $maListe")
    println("Le plus grand nombre est : $resultat")
}

fun main() {
    val verifierSigne = fun(n: Int): Boolean { return n >= 0 }

    val nombres = listOf(15, -7, 0, -3, 8)

    for (nb in nombres) {
        if (verifierSigne(nb)) {
            println("$nb est positif")
        } else {
            println("$nb est negatif")
        }
    }
}

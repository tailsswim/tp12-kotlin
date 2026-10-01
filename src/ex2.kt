fun countElements(liste: List<Int>, condition: (Int) -> Boolean): Int {
    var compteur = 0
    for (element in liste) {
        if (condition(element)) {
            compteur++
        }
    }
    return compteur
}

fun main() {
    val nombres = listOf(3, 8, 15, 22, 5, 12, 30, 1)

    val nbPairs = countElements(nombres) { it % 2 == 0 }
    val nbSuperieursA10 = countElements(nombres) { it > 10 }

    println("Nombre d'éléments pairs : $nbPairs")
    println("Nombre d'éléments supérieurs à 10 : $nbSuperieursA10")
}

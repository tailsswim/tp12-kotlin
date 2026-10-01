fun calculer(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}

fun main() {
    val addition = fun(x: Int, y: Int): Int { return x + y }
    val soustraction = fun(x: Int, y: Int): Int { return x - y }
    val multiplication = fun(x: Int, y: Int): Int { return x * y }
    val division = fun(x: Int, y: Int): Int { return if (y != 0) x / y else 0 }

    val resAdd = calculer(10, 5, addition)
    val resSous = calculer(10, 5, soustraction)
    val resMulti = calculer(10, 5, multiplication)
    val resDiv = calculer(10, 5, division)

    println("Addition: $resAdd")
    println("Soustraction: $resSous")
    println("Multiplication: $resMulti")
    println("Division: $resDiv")
}

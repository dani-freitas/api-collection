package one.digitalinnovetion.appicolletction

fun main() {
    val pair: Pair<String, Double> = Pair("Dani", 1000.0)
    val map1= mapOf(pair)

    map1.forEach { (k, v) -> println("Chave: $k - Valor: $v") }

    println("-------------------------------------------")

    val map2 = mapOf(
        "Freitas" to 2500.0,
        "Dev" to 3000.0
    )

    map2.forEach { (k, v) -> println("Chave: $k - Valor: $v") }
}

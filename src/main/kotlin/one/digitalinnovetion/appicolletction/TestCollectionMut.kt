package one.digitalinnovetion.appicolletction

fun main() {
    val dani = funcinario("Dani", 2000.0, "CLT")
    val freitas = funcinario("Freitas", 1500.0, "PJ")
    val pedro = funcinario("Pedro", 4000.0, "CLT")

    val funcinarios = mutableListOf(dani, freitas)
    funcinarios.forEach { println(it) }

    println("-------------------------------------------")
    funcinarios.add(pedro)
    funcinarios.forEach{ println(it)}

    println("-------------------------------------------")
    funcinarios.remove(freitas)
    funcinarios.forEach{ println(it)}

    println("------------------SET-------------------------")

    val funcinarioSet = mutableSetOf(freitas)
//        funcinarioSet.forEach{ println(it)}

    funcinarioSet.add(dani)
    funcinarioSet.add(pedro)
    funcinarioSet.forEach{ println(it)}

    println("-------------------------------------------")
    funcinarioSet.remove(pedro)
    funcinarioSet.forEach{ println(it)}
}
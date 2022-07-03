package one.digitalinnovetion.appicolletction

fun main() {
    val salario = DoubleArray(3)

    salario[0] = 2000.0
    salario[1] = 400.0
    salario[2] = 1000.0

    salario.forEach { println(it)}

    println("-------------------------------------------")

    salario.forEachIndexed { index, salarios ->
        salario[index] = salarios * 1.1
    }
    salario.forEach { println(it) }

    println("-------------------------------------------")

    val bonus = doubleArrayOf(1500.0,1250.0,5000.0)
    bonus.sort()
    bonus.forEach { println(it) }

}



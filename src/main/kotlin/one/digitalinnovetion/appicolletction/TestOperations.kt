package one.digitalinnovetion.appicolletction

fun main() {
    val salario = doubleArrayOf(1500.0,1250.0,5000.0)

    for(valor in salario){
        println(valor)
    }
    println("-------------------------------------------")

    println("Maior salário: ${salario.maxOrNull()}")
    println("Menor salário: ${salario.minOrNull()}")
    println("Média salário:${salario.average()}")

    println("-------------------------------------------")

    val  salariosMaiorQue2500 = salario.filter { it > 2500.0 }
         salariosMaiorQue2500.forEach {
            println(it)
        }
}
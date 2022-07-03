package one.digitalinnovetion.appicolletction

fun main() {
    val dani = funcinario(nome = "Dani", salario = 5.000, TipoContratacao = "PJ")
    val freitas = funcinario(nome = "Freitas", salario = 6.500, TipoContratacao = "CLT")
    val dev = funcinario(nome = "Dev", salario = 2.000, TipoContratacao = "CLT")

    val funcionarios1 = setOf(dani,freitas)
    val funcionarios2 = setOf(dev)

    val resultion = funcionarios1.union(funcionarios2)
        resultion.forEach{ println(it)}

    println("-------------------------------------------")
    val funcionarios3 = setOf(dani,freitas,dev)
    val resultSubtract = funcionarios3.subtract( funcionarios2)
    resultSubtract.forEach { println(it) }

    println("-------------------------------------------")
    val resultIntersect = funcionarios3.intersect(funcionarios2)
    resultIntersect.forEach { println(it) }


}
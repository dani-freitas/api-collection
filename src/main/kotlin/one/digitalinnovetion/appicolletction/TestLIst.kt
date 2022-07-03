package one.digitalinnovetion.appicolletction

fun main() {
    val dani = funcinario(nome = "Dani", salario = 5.000, TipoContratacao = "PJ")
    val freitas = funcinario(nome = "Freitas", salario = 6.500, TipoContratacao = "CLT")
    val dev = funcinario(nome = "Dev", salario = 2.000, TipoContratacao = "CLT")

    val funcionarios = listOf(dani, freitas, dev)

     funcionarios.forEach { println(it) }
    println("-------------------------------------------")

    println(funcionarios.find { it.nome == "Dani" })

    println("-------------------------------------------")

    funcionarios.sortedBy { it.salario }.
    forEach { println(it) }

    println("-------------------------------------------")

        funcionarios.groupBy {
            it.TipoContratacao }
            .forEach{ println(it)}





}









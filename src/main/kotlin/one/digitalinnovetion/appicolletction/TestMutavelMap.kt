package one.digitalinnovetion.appicolletction

fun main() {
    val dani = funcinario(nome = "Dani", salario = 5000.0, TipoContratacao = "PJ")
    val freitas = funcinario(nome = "Freitas", salario = 6500.0, TipoContratacao = "CLT")
    val dev = funcinario(nome = "Dev", salario = 2000.0, TipoContratacao = "CLT")

    val repositorio = Repositorio<funcinario>()



    repositorio.create(dani.nome, dani)
    repositorio.create(freitas.nome, freitas)
    repositorio.create(dev.nome, dev)

    println("--------------------findById---------------------")

    println(repositorio.findById(dani.nome))

    println("--------------------findAll-----------------------")

    repositorio.findAll().forEach { println(it) }

    println("--------------------remove-----------------------")

   repositorio.remove(dev.nome)
   repositorio.findAll().forEach { println(it) }


}
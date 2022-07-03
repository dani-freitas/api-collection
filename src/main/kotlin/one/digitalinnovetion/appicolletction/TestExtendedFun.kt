package one.digitalinnovetion.appicolletction

fun main() {
val salarios = arrayOf(
    "2000.0".toBigDecimal(),
    "3000.0".toBigDecimal(),
    "5000.0".toBigDecimal()
)
    println("------------------TODOS-------------------------")
    salarios.forEach { println(it) }

    println("------------------SOMATORIA-------------------------")
    println(salarios.somatoria())

    println("------------------MEDIA------------------------------")
    println(salarios.media())

}
package one.digitalinnovetion.appicolletction

fun main() {

    val name = Array<String>(4) { "" }

    name[0] = "A"
    name[1] = "Z"
    name[2] = "C"
    name[3] = "X"

    for (valor in name) {
        println(valor)
    }
    println("-------------------------------------------")

    name.sort()
    name.forEach {
        println(it)
    }

    println("-------------------------------------------")

    val names = arrayListOf<String>("A", "B", "Z", "L")
    names.sort()
    names.forEach {
        println(it)





    }
}
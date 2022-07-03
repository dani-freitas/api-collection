package one.digitalinnovetion.appicolletction

fun main(){
    val value = IntArray(5)

    value[0] = 1
    value[1] = 7
    value[2] = 6
    value[3] = 4
    value[4] = 5

    for(valor in value){
        println(valor)
    }
    println("-------------------------------------------")
    value.forEach {valor ->
    println(valor)
    }
    println("-------------------------------------------")

    value.sort()
    for(valor in value){
        println(valor)
    }

}
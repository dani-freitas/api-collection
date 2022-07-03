package one.digitalinnovetion.appicolletction

fun main() {
    val value = intArrayOf(2,3,4,1,10,7)

       value.forEach {
           println(it)
       }
    println("-------------------------------------------")
        value.sort()
        value.forEach {
        println(it)
    }



}
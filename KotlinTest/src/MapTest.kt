
fun main(){
    MapTest()
}

fun MapTest(){
    val map = mutableMapOf(
        "Justin" to 31,
        "Richard" to 75,
        "Susan" to 63,
        "Rylan" to 25
        )

//    for(key in map.keys) println("$key's age is ${map[key]}")
    for((key,value) in map.entries) println("$key's age is $value")
}
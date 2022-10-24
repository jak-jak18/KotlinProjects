
fun main(args : Array<String>){
    arrayTest()
}

fun arrayTest(){
//    val ary : Array<Int> = Array(5) {1; 5; 5; 8;9}
    val ary : IntArray = intArrayOf(1, 5, 5, 8)
//    ary.set(5, 10)
    ary[0]
    for (elm in ary){
        println(elm)
    }
}

fun arrayTest2(){
    val asc = Array(5) { i -> (i * i).toString() }
    asc.forEach { println(it) }
}

fun indiceTest(){
    val array : IntArray = intArrayOf(1, 5, 5, 8)
    for (i in array.indices) {
        println(array[i])
    }
}

fun main(){
    var a: String? = null
    a = "new"
    val b = a ?: "test"
    print(b)
}


//fun test(){
//    var a: String = "abc"
//    a.length
//    a = null // won't work
//
//    var b: String? = "abc" // can be set null
//    b = null // ok
//    print(b)
//    val l = b.length
//}
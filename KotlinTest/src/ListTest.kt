
fun main(){
//    ListTest()
//    MutableListTest()
    PeopleListTest()
}

fun ListTest(){
    val list = listOf("uno", "dos", "tres", "cuatro")
    for(str in list) println(str)

}

fun PeopleListTest(){
    val list = listOf<newPerson>(
        newPerson("Justin", 31),
        newPerson("Richard", 75),
        newPerson("Susan", 63),
        newPerson("Rylan", 25))
    for(person in list){
        val(name, age) = person
        println("$name's age is $age")
    }
}

fun MutableListTest(){
    val list = mutableListOf("uno", "dos", "tres", "cuatro")
    list.add("cinco")
    for(str in list) println(str)
}

fun ClassicList(){
    val list = ArrayList<String>()
    list.add("uno")
    list.add("dos")
}

data class newPerson(val name:String, val age:Int)

fun main(args : Array<String>){
    val person1 = Person("Dad")
    person1.age = 76

    val person2 = Person("Mom")
    person2.age = 65

    val person3 = User2("person3", 23)

    val jack = User(name = "Jack", age = 1)
    val olderJack = jack.copy(age = 2)

    val(name, age) = olderJack

    print("$name is $age")
}

data class Person(val name : String){
    var age : Int = 0
}
data class User(val name: String = "", val age: Int = 0)

class User2(val name: String = "", val age: Int = 0)
fun main() {
    evenlists(listOf("Sabdio", "Mollen", "Cheko", "Fardosa", "Kishoiyan", "winnie", "sam", "lau", "brian", "lucy"))
    var x = heightinmetres(listOf(20, 30, 19, 45, 89, 25, 67))
    println(x.sum())
    println(x.average())

    var a = Person("Mollen", 21, 5.3, 48.5F)
    var b = Person("mitchelle", 23, 6.4, 102.99F)
    var c = Person("Jessy", 22, 4.3, 67.788F)
    var d = Person("Dennis", 12, 28.4, 34.3F)
    var person = listOf<Person>(a, b, c, d)
    var descending = person.sortedByDescending { student -> student.age }
    println(descending)
 var add=addpeople(listOf())
    var person1 = Person("Mollen", 34, 6.7, 9.57F)
    var person2 = Person("Oure", 26, 10.4, 45F)
    var people = listOf(person, person1, person2)
    println(people)

    var y = Car("Kda234", 500)
    var z = Car("KDH78", 400)
    var t = Car("kht234", 670)
    var u = Car("qet56", 300)
    var car = listOf<Car>(y, z, t,  u)
    var v = averageMileage(car)
    println(v)


}

//Given a list of 10 strings, write a function that returns a list of the strings
//at even indices i.e index 2,4,
fun evenlists(name: List<String>): List<String> {
    name.forEachIndexed { index, z ->
        if (index % 2 == 0)
            println(listOf(z))
    }
    return name
}

//Given a list of people’s heights in metres. Write a function that returns
//the average height and the total height
fun heightinmetres(height: List<Int>): List<Int> {
    return height
}

//Given a list of Person objects, each with the attributes, name, age,
//height and weight. Sort the list in order of descending age
data class Person(var name: String, var age: Int, var height: Double, var weight: Float)

//4.  Given a list similar to the one above, write a function in which you will
//create 2 more people objects and add them to the list at one go.
fun addpeople(people: List<Person>): List<Person> {
    return people
}

//Write a function that takes in a list of Car objects each with a
//registration and mileage attribute and returns the average mileage of
//all the vehicles in the list.
data class Car(var registration: String, var mileage: Int)

fun averageMileage(names: List<Car>): Double {
    var av = 0.0
    names.forEach { car ->
        av += car.mileage
    }
 var total=av/names.count()
    return  total
}







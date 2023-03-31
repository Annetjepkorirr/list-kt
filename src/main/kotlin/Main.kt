fun main() {
    println(mentions(listOf("subaru","wingroad","awd","golf","fortuner","rumon","fun","pay","lift","gift")))
    println(height(listOf(10,20,46,47,53,10)))
    describe()
    println(cars())




}
//Given a list of 10 strings, write a function that returns a list of the strings
//at even indices i.e index 2,4,6 etc
 fun mentions(mention:List<String>):List<String> {
    var x = mutableListOf<String>()
    mention.forEachIndexed { index, i ->
        if (index%2 == 0)
            x.add(i)
    }
    return x
}

//Given a list of people’s heights in metres. Write a function that returns
//the average height and the total height

fun height(heights:List<Int>):String{
    var x= heights.average()
    var z =heights.sum()
    var xz =("average height $x, total height $z")
    return xz

}
//Given a list of Person objects, each with the attributes, name, age,
//height and weight. Sort the list in order of descending age

data class description(var name:String, var age:Int, var height:Int, var weight:  Double)

fun describe() {
    val person1 = description("Annet", 20, 10, 50.0)
    val person2 = description("Mary", 10, 60, 40.4)
    val person3 = description("Quency", 32, 54, 43.2)
    val person4 = description("Amara", 23, 43, 80.5)

    val Persons = listOf(person1, person2, person3, person4)
    val sortedPersons = Persons.sortedByDescending { description -> description.age }
    println(sortedPersons)
}

//Given a list similar to the one above, write a function in which you will
//create 2 more people objects and add them to the list at one go.



//Write a function that takes in a list of Car objects each with a
//registration and mileage attribute and returns the average mileage of
//all the vehicles in the list.

class Car(var reg:String, var mileage:Double)
fun cars():Double {
    val vehicle1 = Car("kcw 674w", 20.3)
    val vehicle2 = Car("kdd 435Q", 49.0)
    val vehicle3 = Car("Kar345P", 50.2)
    var identify = listOf(vehicle1, vehicle2, vehicle3)

    val fancy = identify.sumOf { fancy -> fancy.mileage }
    val average =fancy/identify.size
    return average

}





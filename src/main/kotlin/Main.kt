fun main() {
    // Given a string “codeHive”. Write a function that prints out a string composed
    //of the fifth, sixth, seventh and eighth  characters of the string
    var name = "CodeHive"
    var newName = name[5].toString() +name[6] +name[7]
    println(newName)

    number( 7 ,5)
    me( "Abass",78)
    four( "someone")

}
    //2. Create and invoke a function that given two numbers returns the
    //remainder of their division (3 points)
fun number (a:Int, b:Int){
    var y = a%b
    println(y)
}
    //3. Write a function that takes in two parameters, name and age and returns a
    //String with this structure “Hi, my name is p and I am z years old.” Where p
    //and  z are your  name and age respectively. (3 points)

fun  me(name:String, age:Int) {
    var greeting = "hi, my name is $name and i am $age years old"
    println(greeting)
}

//4. Write a function that takes in a string and returns its length(2 points)
fun four(name:String) {
    println(name.length)

}


fun main() {
 personIdentity("Tasha Edgar", 34, "New York.")

    val sum = sumNumbers(12,8,16,1)
    println(sum)

    var average = numAverage(12, 15, 18, 28,10 )
    println(average)

    personRecord()

}
//1. Create and invoke a function that takes in a users name, age, and nationality and prints out
//“Hello my name is ${name}, I am ${age} and I am from ${nationality}” e.g
//given “Lucy”, 23, and “Kenya” it will print out “Hello my name is Lucy,
//I am 23 years old and I am from Kenya” (2 points)
fun personIdentity(username:String, age:Int, nationality:String){
    println("Hello my name is $username, I am $age and I am from $nationality")
}

//2. Create and invoke a function that returns the sum of any given 4 numbers (3 points)
fun sumNumbers(num:Int, num1:Int, num2:Int, num3:Int):Int{
    return num + num1 + num2 + num3

}
//3. Create and invoke a function that given any 5 numbers, it returns their average (2 points)
fun numAverage(num4:Int, num5:Int, num6:Int,num7:Int, num8:Int):Int{
    return num4 + num5 + num6 + num7 + num8 + num7 / 5

}
//4. You are creating an app to capture a person’s records. Some of the data you will
//capture includes full name, age, phone number, email, weight in kg, and citizen. For the
//citizen field, you will track whether a student is a Ugandan or not. (3 points)
fun personRecord(){
    var fullName:String = "Angela Mumo"
    var age: Int = 34
    var phoneNumber: String = "0768214929"
    var email: String = "jaydenmusau@gmail.com"
    var weight: Double = 45.7
    var citizen: String = " a ugandan"
    println("my name is $fullName, I am $age years old, $phoneNumber is my number.$email is my adress and I weigh $weight and I am a $citizen")

}
package com.example.kotlin_basics

fun main() {

    //Immutable list -> val shoppingList = listOf("Processor", "RAM", "Graphics Card", "SSD")

    val shoppingList = mutableListOf("Processor", "RAM", "Graphics Card RTX3060", "SSD")

    shoppingList.add("Cooling System")

    shoppingList.remove("Graphics Card RTX3060")
    shoppingList.add("Graphics Card RTX4090")
    println(shoppingList)
    shoppingList.removeAt(2)
    println(shoppingList)

    val hasRAM = shoppingList.contains("RAM")
    println(hasRAM)

    for (item in shoppingList) {
        println(item)
        if (item == "RAM") {
            shoppingList.removeLast()
            break
        }
    }
    for (index in 0 until shoppingList.size) {
        println("item ${shoppingList[index]} is at index $index")
    }
}

//fun makeCoffee(coffeeDetails: CoffeeDetails){
//    if(coffeeDetails.sugarCount == 0){
//        println("Coffee with no sugar for ${coffeeDetails.name} and cream ${coffeeDetails.creamAmount}")
//    }else if (coffeeDetails.sugarCount == 1){
//        println("Coffee with 1 spoon of sugar for ${coffeeDetails.name} and cream ${coffeeDetails.creamAmount}")
//    }else if (coffeeDetails.sugarCount > 1){
//        println("Coffee with {$coffeeDetails.sugarCount} spoons of sugar for ${coffeeDetails.name} and cream ${coffeeDetails.creamAmount}")
//    }
//
//}
//
//fun askCoffeeDetails(){
//    println("Who is this coffee for?")
//    val name = readln()
//    println("How many pieces of sugar do you want?")
//    val sugarCount = readln().toInt()
////    makeCoffee(sugarCount, name)
//}

//    val number = 1 DECLARAÇÃO DE VARIAVEL ESTÁTICA, NÃO ALTERA O VALOR
//    number = 2
//
//    var name = "Leonardo" DECLARAÇÃO DE VARIAVEL DINÂMICA, ALTERA O VALOR
//    name = "Aiolia"
//    println("Hello")

//    val myTrue: Boolean = true
//    val myFalse: Boolean = false
//    val boolNull: Boolean? = null
//
//    println(myTrue || myFalse)
//    println(myFalse && myTrue)
//    println(!myTrue)

//    val myChar = '\u00B6'
//    println(myChar)
//
//    var age = 0
//    println("Fala sua idade ae doidão")
//    age = readln().toInt()
//    if(age >= 18){
//        println("Entra paizão")
//    }else{
//        println("Vaza paizão")
//    }
//}

//fun main(){ EXERCICIO
//    val constantNumber = 10
//    var mutableString = "First"
//
//    println(constantNumber)
//    println(mutableString)
//    mutableString = "Second"
//    println(mutableString)

//println("Insert the first number")
//val number1 = readln().toInt()
//println("Insert the second number")
//val number2 = readln().toInt()
//
//var myResult = add(number1, number2)
//println("The result of $number1 plus $number2 is $myResult")
//fun add(num1:Int, num2:Int):Int{
//    val result = num1+num2
//    return result
//}

//var matilda = Dog("Matilda", "shitzu")
//
//println("${matilda.name} is a ${matilda.breed} and is ${matilda.age} years old")
//
//val myBook = Book("Assassinato no Expresso Oriente", "Agatha Christie",1924)
//println(myBook)
//
// data class CoffeeDetails(
////    val sugarCount: Int,
////    val name: String,
////    val size: String,
////    val creamAmount: Int
////    val coffeeForLeo = CoffeeDetails(1, "Leo", "médio", 1)
////            makeCoffee(coffeeForLeo)
////)
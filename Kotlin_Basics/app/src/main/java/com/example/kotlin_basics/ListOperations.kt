package com.example.kotlin_basics

fun main(){
    val fruitsList = mutableListOf("Strawberry", "Watermellon", "Orange", "Banana", "Grape")
    println(fruitsList)

    fruitsList.add("Pineapples")
    println(fruitsList)
    fruitsList.removeAt(3)
    println(fruitsList)

    if(fruitsList.contains("Pineapples")){
        println("There is Pineapples in this list, $fruitsList")
    }else{
        println("None pineapples found!")
    }
}
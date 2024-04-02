package com.example.kotlin_basics

class Dog (val name: String, val breed: String, var age: Int = 0) {
    init{
        bark(name)
    }

    fun bark(name: String){
        println("$name says Woof Woof")
    }
}
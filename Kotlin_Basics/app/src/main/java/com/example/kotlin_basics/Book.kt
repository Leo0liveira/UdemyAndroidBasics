package com.example.kotlin_basics

class Book(val title:String = "Unknown", val author:String="Anonymous", val yearPublished:Int=2024) {
    init{
        customBook(title, author, yearPublished)
    }
    fun customBook(title: String, author: String, yearPublished: Int){
        println("The book is named $title written by $author and published in $yearPublished")
    }
}
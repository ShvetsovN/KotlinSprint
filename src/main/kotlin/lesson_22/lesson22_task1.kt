package org.example.lesson_1.lesson_22

fun main(){

    val regularBook1 = RegularBook("Ад", "Данте")
    val regularBook2 = RegularBook("Ад", "Данте")

    println(regularBook1 == regularBook2)

    val dataBook1 = DataBook("Ад", "Данте")
    val dataBook2 = DataBook("Ад", "Данте")

    println(dataBook1 == dataBook2)
}

class RegularBook(
    name: String,
    author: String,
)

data class DataBook(
    val name: String,
    val author: String,
)

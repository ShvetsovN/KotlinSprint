package org.example.lesson_1.lesson_22

fun main(){

    val regularBook2221 = RegularBook222("Ад", "Данте")

    println(regularBook2221)

    val dataBook2221 = DataBook222("Ад", "Данте")

    println(dataBook2221)
}

class RegularBook222(
    name: String,
    author: String,
)

data class DataBook222(
    val name: String,
    val author: String,
)

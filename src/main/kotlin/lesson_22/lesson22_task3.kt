package org.example.lesson_1.lesson_22

fun main() {

    val dataBook2231 = DataBook223("Ад", "Данте", 1315)
    val (name, author, dateOfPublication) = dataBook2231
    println(name)
    println(author)
    println(dateOfPublication)

}

data class DataBook223(
    val name: String,
    val author: String,
    val dateOfPublication: Int,
)
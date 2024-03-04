package org.example.lesson_1.lesson_8

fun main() {

    println("Введите количество ингридиентов: ")

    val userInput = readln().toInt()
    val arrayOfIngredients: Array<String> = Array(userInput) { "" }

    for (i in arrayOfIngredients.indices) {
        println("Введите ${i + 1} элемент")

        arrayOfIngredients[i] = readln()
    }

    println(arrayOfIngredients.contentToString())
}
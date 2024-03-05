package org.example.lesson_1.lesson_9

fun main() {

    val listOfIngredients = listOf("яйца", "молоко", "мука", "сахар")

    println("В рецепте есть следующие ингредиенты: ")

    listOfIngredients.forEach {
        println(it)
    }

}
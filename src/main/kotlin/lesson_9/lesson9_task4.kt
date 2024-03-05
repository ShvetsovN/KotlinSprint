package org.example.lesson_1.lesson_9

fun main() {

    println("Введите 5 ингредиентов для блюда через \",\": ")

    val listOfIngredients = readln().replace(" ", "").split(',')
    val listOfIngredientsSorted = listOfIngredients.sorted()

    println(listOfIngredientsSorted)

}
package org.example.lesson_1.lesson_9

fun main() {

    val listOfIngredients = mutableListOf<String>()

    println("Введите 5 ингредиентов (каждый по отдельности)")

    repeat(5) {
        listOfIngredients.add(readln())
    }

    val listOfIngredientsSorted = listOfIngredients.distinct().sorted()
    listOfIngredientsSorted.forEach { it ->
        print("${it.replaceFirstChar { it.uppercase() }}, ")
    }

}
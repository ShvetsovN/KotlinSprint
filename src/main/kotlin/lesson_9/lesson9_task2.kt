package org.example.lesson_1.lesson_9

fun main() {

    val listOfIngredients = mutableListOf("яйца", "молоко", "хрен")

    println("В рецепте есть базовые ингредиенты: $listOfIngredients")

    do {
        println("Желаете добавить что-то еще?")

        val userInput = readln()
        if (userInput == "да") {
            println("Какой ингредиент хотите добавить?")

            val newIngredients = readln()
            listOfIngredients.add(newIngredients)

            println(listOfIngredients)
        }
    } while (userInput != "нет")

}
package org.example.lesson_1.lesson_9

fun main() {

    val listOfIngredients = mutableListOf("яйца", "молоко", "хрен")

    println("В рецепте есть базовые ингредиенты: $listOfIngredients")
    println("Желаете добавить что-то еще?")

    val userInput = readln()

    while (userInput.equals("да", true)) {

        println("Какой ингредиент хотите добавить?")

        val newIngredients = readln()
        listOfIngredients.add(newIngredients)

        println("Теперь в рецепте есть следющие ингредиенты: $listOfIngredients")
        return
    }
}





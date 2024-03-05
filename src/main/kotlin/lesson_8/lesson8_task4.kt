package org.example.lesson_1.lesson_8

fun main() {

    val arrayOfIngredients = arrayOf("сахар", "вода", "соль", "перец", "мука", "яйцо")

    println("Для рецепта необходимо: ${arrayOfIngredients.contentToString()}")
    println("Какой ингредиент мы хотим заменить?")

    val userInputNewIngredients = readln()

    for (i in arrayOfIngredients.indices) {
        if (arrayOfIngredients[i] == userInputNewIngredients) {
            println("Какой ингредиент добавить? ")
            arrayOfIngredients[i] = readln()
            println("Готово! Вы сохранили следующий список: ${arrayOfIngredients.contentToString()}")
            return
        }
    }
    println("Такого ингредиента нет в рецепте")

}
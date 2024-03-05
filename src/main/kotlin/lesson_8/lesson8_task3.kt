package org.example.lesson_1.lesson_8

fun main() {

    println("Какой ингредиент мы ищем?")

    val arrayOfIngredientsForBagel = arrayOf("flour", "sugar", "water", "oil", "salt")
    val lookingForIngredients = readln()

    if(lookingForIngredients in arrayOfIngredientsForBagel) println("Ингридиент $lookingForIngredients в рецепте есть")
    else println("Такого ингредиента в рецепте нет")

}
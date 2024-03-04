package org.example.lesson_1.lesson_8

fun main() {

    val arrayOfIngredientsForBagel = arrayOf("flour", "sugar", "water", "oil", "salt")

    val lookingForIngredients = readln()

    for (i in arrayOfIngredientsForBagel) {
        if (arrayOfIngredientsForBagel.contains(lookingForIngredients)) {
            println(
                "Ингредиент ${lookingForIngredients} " +
                        "в рецепте есть"
            )
            return
        }
    }
    println("Такого ингредиента в рецепте нет")

}
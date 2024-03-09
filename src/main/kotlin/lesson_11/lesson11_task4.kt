package org.example.lesson_1.lesson_11

fun main() {

    val tvorog = Ingredients(
        1,
        "творог",
    )

    val aqua = Ingredients(
        2,
        "вода"
    )

    val burger = Recipe(
        1,
        "Чизбургер",
        setOf(tvorog, aqua)
    )

    val burgers = RecipeCategories(
        1,
        "Бургеры",
        setOf(burger )
    )

    println("ID: ${burgers.id}, NameOfCategories: ${burgers.nameOfCategories}, Recipe: ${burgers.listOfRecipe.joinToString { it.name }}, " +
            "состоящий из: ${burger.ingredients.joinToString { it.name }}")

}

class RecipeCategories(
    val id: Int,
    val nameOfCategories: String,
    val listOfRecipe: Set<Recipe>,
) {}

class Recipe(
    val id: Int,
    val name: String,
    val ingredients: Set<Ingredients>,
    var isFavorite: Boolean = false,
) {}

class Ingredients(
    val id: Int,
    val name: String,
) {}
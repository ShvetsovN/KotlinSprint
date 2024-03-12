package org.example.lesson_1.lesson_11

class RecipeCategory(
    val id: Int,
    val imageURL: String,
    val nameOfCategories: String,
    val listOfRecipe: List<Recipe>,
)

class Recipe(
    val id: Int,
    val imageURL: String,
    val name: String,
    val ingredients: List<Ingredient>,
    val cookingMethod: List<String>,
    var isFavorite: Boolean = false,
)

class Ingredient(
    val id: Int,
    val name: String,
)
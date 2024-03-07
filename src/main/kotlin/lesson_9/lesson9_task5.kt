package org.example.lesson_1.lesson_9

fun main() {

    val setOfIngredients = HashSet<String>()

    println("Введите 5 ингредиентов (каждый по отдельности)")

    repeat(5) {
        setOfIngredients.add(readln())
    }

    val setOfIngredientsSorted = setOfIngredients.sorted()
    setOfIngredientsSorted.forEach { it ->
        if (it == setOfIngredientsSorted[0]) print("${it.lowercase().replaceFirstChar { it.uppercaseChar() }}, ")
        else print("${it.lowercase()}, ")
    }
}
package org.example.lesson_1.lesson_9

fun main(){

    val listOfIngredients = listOf("яйца", "молоко", "масло")
    val listOfProportionsForOneDish = listOf(2, 50, 15)

    println("""На одну порцию омлета необходимо: 
        |${listOfIngredients[0]} - ${listOfProportionsForOneDish[0]} шт. 
        |${listOfIngredients[1]} - ${listOfProportionsForOneDish[1]} гр. 
        |${listOfIngredients[2]} - ${listOfProportionsForOneDish[2]} гр. 
    """.trimMargin())

    println("Какое количество порций необходимо?")

    val userInput = readln().toInt()

    val listOfProportionsForSeveralDishes = listOfProportionsForOneDish.map{
        it * userInput
    }

    println("""На $userInput порций омлета необходимо: 
        |${listOfIngredients[0]} - ${listOfProportionsForSeveralDishes[0]} шт. 
        |${listOfIngredients[1]} - ${listOfProportionsForSeveralDishes[1]} гр. 
        |${listOfIngredients[2]} - ${listOfProportionsForSeveralDishes[2]} гр. 
    """.trimMargin())

}
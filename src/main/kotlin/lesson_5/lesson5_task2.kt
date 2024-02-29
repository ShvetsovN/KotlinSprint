package org.example.lesson_1.lesson_5

const val AGE_OF_MAJORITY = 18
const val YEAR_NOW = 2024

fun main (){

    val userYearOfBirth = readln().toInt()
    val resultText = if(YEAR_NOW - userYearOfBirth >= AGE_OF_MAJORITY) "Показать экран со скрытым контентом"
    else "Вернуться на главный экран"

    println(resultText)

}
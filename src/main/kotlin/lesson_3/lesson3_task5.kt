package org.example.lesson_1.lesson_3

fun main(){

    var result = "D2-D4;0"
    var startingPosition = result.substringBefore('-')
    var finalPosition = result.substring(3,5)
    var moveNumber = result.substringAfter(';')
    println("Начальная позиция - $startingPosition")
    println("Конечная позиция - $finalPosition")
    println("Ход номер - $moveNumber")

}
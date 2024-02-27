package org.example.lesson_1.lesson_3

fun main(){

    val result = "D2-D4;0"

    val lineSplit = result.split('-', ';')

    println("Начальная позиция - ${lineSplit[0]}")
    println("Конечная позиция - ${lineSplit[1]}")
    println("Ход номер - ${lineSplit[2]}")

}
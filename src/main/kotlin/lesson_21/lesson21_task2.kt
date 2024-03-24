package org.example.lesson_1.lesson_21

fun main() {

    val listOfNumber = listOf(1, 20, 10, 11, 12223)
    val evenNumbersSum = listOfNumber.evenNumbersSum()
    println(evenNumbersSum)

}

fun List<Int>.evenNumbersSum() = this.filter { it % 2 == 0 }.sum()

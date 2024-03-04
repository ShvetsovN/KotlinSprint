package org.example.lesson_1.lesson_8

fun main() {

    val numberArray = IntArray(7)

    for (i in 0..6) {
        println("укажите количество просмотров в ${i + 1} день: ")
        numberArray[i] = readln().toInt()
    }

    println("Сумма просмотров за неделю: ${numberArray.sum()}")
}
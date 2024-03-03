package org.example.lesson_1.lesson_7

fun main() {

    println("Введите время для таймера: ")
    val inputedSeconds = readln().toInt()

    for (i in inputedSeconds downTo 0) {
        println("Секунд осталось до конца: $i")
        Thread.sleep(1000)
    }

    println("Время вышло")

}

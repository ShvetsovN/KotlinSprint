package org.example.lesson_1.lesson_6

fun main() {

    println("Введите количество секунд таймера: ")
    var counterNew = readln().toInt()
    val enteredSecondsNew = counterNew

    while (counterNew > 0) {
        println("Осталось секунд: $counterNew ")
        Thread.sleep(1000)
        counterNew--
    }

    println("Время вышло \nПрошло $enteredSecondsNew секунд")
}
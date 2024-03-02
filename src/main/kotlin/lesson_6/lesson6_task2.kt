package org.example.lesson_1.lesson_6

fun main() {

    println("Введите количество секунд таймера: ")
    var counter = readln().toInt()
    val enteredSeconds = counter

    while (counter > 0) {
        Thread.sleep(1000)
        counter--
    }

    println("Прошло $enteredSeconds секунд")

}
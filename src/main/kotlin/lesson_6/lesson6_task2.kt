package org.example.lesson_1.lesson_6

fun main() {

    println("Введите количество секунд таймера: ")
    val counter = readln().toLong()

    Thread.sleep(counter * 1000)
    println("Прошло $counter секунд")

}
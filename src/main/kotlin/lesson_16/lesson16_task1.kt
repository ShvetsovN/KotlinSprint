package org.example.lesson_1.lesson_16

fun main() {
    val dice = Dice()
    dice.randomNumberOutput()
}

class Dice {

    private val randomNumberOnDice = (1..6).random()

    fun randomNumberOutput() {
        println("Выпавшее число: $randomNumberOnDice")
    }

}
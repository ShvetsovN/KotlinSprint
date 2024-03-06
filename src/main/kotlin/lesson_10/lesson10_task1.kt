package org.example.lesson_1.lesson_10

fun main() {

    val computerDiceRoll = rollTheDice()
    val humanDiceRoll = rollTheDice()

    println("Добро пожаловать в игру \"Кости\"")
    println("Первый бросок достается человечеству! Выпало число: $humanDiceRoll")
    println("Вторыми бросают машины! Выпало число: $computerDiceRoll")

    println(
        when {
            humanDiceRoll > computerDiceRoll -> "Победило человечество"
            humanDiceRoll < computerDiceRoll -> "Победила машина"
            else -> "Ничья"
        }
    )

}

fun rollTheDice() = (1..6).random()

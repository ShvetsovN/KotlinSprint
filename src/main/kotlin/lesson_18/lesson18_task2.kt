package org.example.lesson_1.lesson_18

fun main() {

    val dice: Dice = FourFaceDice()
    val dice2: Dice = SixFaceDice()
    val dice3: Dice = EightFaceDice()

    println(dice.throwADice())
    println()
    println(dice2.throwADice())
    println()
    println(dice3.throwADice())

}

open class Dice(
    val numberOfFace: Int,
) {
    open fun throwADice(): String {
        return "Вы взяли кость с ${numberOfFace} граней! " +
                    "Выпало значение: ${(1..numberOfFace).random()}"
    }
}

class FourFaceDice: Dice(numberOfFace = 4)

class SixFaceDice: Dice(numberOfFace = 6)

class EightFaceDice: Dice(numberOfFace = 8)
package org.example.lesson_1.lesson_18

fun main() {

    val fourFaceDice: Dice = FourFaceDice()
    val sixFaceDice: Dice = SixFaceDice()
    val eightFaceDice: Dice = EightFaceDice()

    val diceList: List<Dice> = listOf(fourFaceDice, sixFaceDice, eightFaceDice)

    diceList.forEach { println(it.throwADice()) }

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
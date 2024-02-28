package org.example.lesson_1.lesson_4

const val PEOPLE_ON_BOARD_MIN = 55
const val PEOPLE_ON_BOARD_MAX = 70
const val BOXES_OF_PROVISION = 50

fun main() {

    println("Корбаль имеет повреждения?")
    val isShipDamage: Boolean = readln().toBoolean()

    println("Число экипажа?")
    val peopleOnBoard: Int = readln().toInt()

    println("Количество ящиков с провизией?")
    val boxesOfProvision: Int = readln().toInt()

    println("Погодные условия благоприятны или нет?")
    val isGoodWeather: Boolean = readln().toBoolean()

    val swimming: Boolean =
        (!isShipDamage && (peopleOnBoard >= PEOPLE_ON_BOARD_MIN && peopleOnBoard <= PEOPLE_ON_BOARD_MAX) &&
                (boxesOfProvision >= BOXES_OF_PROVISION) && isGoodWeather) ||
                (isShipDamage && peopleOnBoard == PEOPLE_ON_BOARD_MAX && boxesOfProvision >= BOXES_OF_PROVISION &&
                        isGoodWeather)

    println("Плывем или нет? - $swimming")
}

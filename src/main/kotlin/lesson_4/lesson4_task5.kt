package org.example.lesson_1.lesson_4

fun main() {

    println("Корбаль имеет повреждения?")
    val shipDamage: Boolean = readln().toBoolean()

    println("Число экипажа?")
    val peopleOnBoard: Int = readln().toInt()

    println("Количество ящиков с провизией?")
    val boxesOfProvision: Int = readln().toInt()

    println("Погодные условия благоприятны или нет?")
    val weatherCondition: Boolean = readln().toBoolean()

    val swimming: Boolean =
        (!shipDamage && (peopleOnBoard >= 55 && peopleOnBoard <= 70) && (boxesOfProvision >= 50) && weatherCondition)
                || (shipDamage && peopleOnBoard == 70 && boxesOfProvision >= 50 && weatherCondition)

    println("Плывем или нет? - $swimming")
}

package org.example.lesson_1.lesson_4

const val ALL_TABLE = 13

fun main() {

    val reservedTableToday = 13
    val reservedTableTomorrow = 4

    println("Доступность столиков на сегодня:${reservedTableToday < ALL_TABLE}\n" +
            "Доступность столиков на завтра:${reservedTableTomorrow < ALL_TABLE}")

}
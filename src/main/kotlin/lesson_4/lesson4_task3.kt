package org.example.lesson_1.lesson_4

const val IS_SUNNY = true
const val IS_AWNING_OPEN = true
const val AIR_HUMIDITY = 20
const val SEASON_NOW = "не зима"

fun main() {

    val isSunny = true
    val isAwningOpen = true
    val airHumidity = 20
    val season = "зима"

    println(
        "Благоприятные ли условия сейчас для роста бобовых?${
            isSunny == IS_SUNNY &&
                    isAwningOpen == IS_AWNING_OPEN &&
                    airHumidity == AIR_HUMIDITY &&
                    season == SEASON_NOW
        }"
    )

}
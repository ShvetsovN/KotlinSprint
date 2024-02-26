package org.example.lesson_1.lesson_4

const val WEATHER_TODAY = true
const val TENT_CONDITION = true
const val AIR_HUMIDITY = 20
const val SEASON_NOW = "не зима"

fun main(){

    val weatherToday = true
    val tentCondition = true
    val airHumidity = 20
    val season = "зима"

    println("Благоприятные ли условия сейчас для роста бобовых?${weatherToday == WEATHER_TODAY 
            && tentCondition == TENT_CONDITION 
            && airHumidity == AIR_HUMIDITY 
            && season == SEASON_NOW }")

}
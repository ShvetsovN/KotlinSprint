package org.example.lesson_1.lesson_12

fun main() {
    val weatherTracker1 = WeatherTracker()
    weatherTracker1.daytimeTemperature = 5
    weatherTracker1.nightTemperature = -5
    weatherTracker1.isPrecipitation = false

    weatherTracker1.weatherOutput()


    val weatherTracker2 = WeatherTracker()
    weatherTracker2.daytimeTemperature = 7
    weatherTracker2.nightTemperature = -7
    weatherTracker2.isPrecipitation = true

    weatherTracker2.weatherOutput()
}

class WeatherTracker() {

    var daytimeTemperature = 10
    var nightTemperature = -10
    var isPrecipitation = true

    fun weatherOutput() {
        println("$daytimeTemperature, $nightTemperature, $isPrecipitation")
    }

}
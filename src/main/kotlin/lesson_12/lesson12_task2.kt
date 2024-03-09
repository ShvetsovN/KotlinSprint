package org.example.lesson_1.lesson_12

fun main() {
    val weatherTracker1 = WeatherTracker2(7, 8, true)
    weatherTracker1.weatherOutput()

    val weatherTracker2 = WeatherTracker2(1, 0, false)
    weatherTracker2.weatherOutput()
}

class WeatherTracker2(val daytimeTemperature: Int, val nightTemperature: Int, val isPrecipitation: Boolean,) {

    fun weatherOutput() {
        println("Погода днём: $daytimeTemperature, погода ночью: $nightTemperature, наличие осадков: $isPrecipitation")
    }

}
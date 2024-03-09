package org.example.lesson_1.lesson_12

fun main() {
    val weatherTracker3 = WeatherTracker2(7, 8, true)
    weatherTracker3.weatherOutput()

    val weatherTracker4 = WeatherTracker2(1, 0, false)
    weatherTracker4.weatherOutput()
}

class WeatherTracker2(val daytimeTemperature: Int, val nightTemperature: Int, val isPrecipitation: Boolean,) {

    fun weatherOutput() {
        println("Погода днём: $daytimeTemperature, погода ночью: $nightTemperature, наличие осадков: $isPrecipitation")
    }

}
package org.example.lesson_1.lesson_12

fun main() {
    val weatherTracker5 = WeatherTracker3(300, 298, true)
    weatherTracker5.weatherOutput()
}

class WeatherTracker3(daytimeTemperature: Int, nightTemperature: Int, isPrecipitation: Boolean,) {

    val daytimeTemperature = daytimeTemperature
    val nightTemperature = nightTemperature
    val isPrecipitation = isPrecipitation

    fun weatherOutput() {
        println("Погода днём: ${(daytimeTemperature - 273.15).toInt()}, погода ночью: ${(nightTemperature - 273.15).toInt()}, " +
                "наличие осадков: $isPrecipitation")
    }

}
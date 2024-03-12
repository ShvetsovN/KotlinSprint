package org.example.lesson_1.lesson_12

fun main() {
    val weatherTracker6 = WeatherTracker4(300, 298, true)
    val weatherTracker7 = WeatherTracker4(290, 271, false)
}

class WeatherTracker4(val daytimeTemperature: Int, val nightTemperature: Int, val isPrecipitation: Boolean,) {

    init {
        println("Погода днём: ${(daytimeTemperature - 273.15).toInt()}, погода ночью: ${(nightTemperature - 273.15).toInt()}, " +
                "наличие осадков: $isPrecipitation")
    }

}
package org.example.lesson_1.lesson_12

fun main() {
    val weatherTracker5 = WeatherTracker3(300, 298, true)
    weatherTracker5.weatherOutput()
}

class WeatherTracker3(daytimeTemperature: Int, nightTemperature: Int, isPrecipitation: Boolean) {

    val daytimeTemperature = (daytimeTemperature - 273.15).toInt()
    val nightTemperature = (nightTemperature - 273.15).toInt()
    val isPrecipitation = isPrecipitation

    fun weatherOutput() {
        println(
            "Погода днём: $daytimeTemperature, погода ночью: $nightTemperature, " +
                    "наличие осадков: $isPrecipitation"
        )
    }

}
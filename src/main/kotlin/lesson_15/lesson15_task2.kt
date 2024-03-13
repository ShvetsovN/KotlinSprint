package org.example.lesson_1.lesson_15

fun main() {

    val temperature1 = Temperature(15)
    val precipitationAmount1 = PrecipitationAmount(11)

    val server = WeatherServer()
    server.sendAMessange(temperature1)
    server.sendAMessange(precipitationAmount1)

}

abstract class WeatherStationStats

class WeatherServer {

    fun sendAMessange(messageType: WeatherStationStats) {
        when (messageType) {
            is Temperature -> println("Температура: ${messageType.temperature}C")
            is PrecipitationAmount -> println("Уровень осадков: ${messageType.precipitationAmount}мм")
            else -> println("Не температура и не уровень осадков")
        }

    }

}

class Temperature(
    val temperature: Int,
) : WeatherStationStats()

class PrecipitationAmount(
    val precipitationAmount: Int,
) : WeatherStationStats()
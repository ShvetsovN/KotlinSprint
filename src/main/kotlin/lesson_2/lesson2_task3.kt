package org.example.lesson_1.lesson_2

const val MINUTE_IN_HOUR = 60

fun main() {

    val departureTimeHours = 9
    val departureTimeMinutes = 39

    val travelTimeInMinutes = 457
    val departureTimeInMinutes = (departureTimeHours * MINUTE_IN_HOUR) + departureTimeMinutes
    val arrivalTimeInMinutes = travelTimeInMinutes + departureTimeInMinutes

    println("%02d".format(arrivalTimeInMinutes / MINUTE_IN_HOUR) + ":" + "%02d".format(arrivalTimeInMinutes % MINUTE_IN_HOUR))

}
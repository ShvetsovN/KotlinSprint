package org.example.lesson_1.lesson_14

fun main() {

    val liner1 = Liner()
    val cargoShip1 = CargoShip()
    val icebreaker1 = Icebreaker()
    icebreaker1.crushIce()

}

open class Liner(
    val speed: Int = 100,
    val liftingCapacity: Int = 500,
    val passengers: Int = 250,
)

class CargoShip(
    speed: Int = 50,
    liftingCapacity: Int = 1000,
    passengers: Int = 25,
) : Liner(speed, liftingCapacity, passengers)

class Icebreaker(
    speed: Int = 30,
    liftingCapacity: Int = 250,
    passengers: Int = 25,
) : Liner(speed, liftingCapacity, passengers) {

    fun crushIce() = println("Приступаем к колке льда")

}
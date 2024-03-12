package org.example.lesson_1.lesson_14

fun main() {

    val liner21 = Liner2()
    liner21.shipInformation()
    liner21.loadingMethod()

    val cargoShip21 = CargoShip2()
    cargoShip21.shipInformation()
    cargoShip21.loadingMethod()

    val icebreaker21 = Icebreaker2()
    icebreaker21.shipInformation()
    icebreaker21.loadingMethod()
    icebreaker21.crushIce()

}

open class Liner2(
    val name: String = "Лайнер",
    val speed: Int = 100,
    val liftingCapacity: Int = 500,
    val passengers: Int = 250,
) {

    open fun loadingMethod() {
        println("Выдвигает горизонтальный трап со шкафута.")
    }

    open fun shipInformation() {
        println(
            """
                |Корабль типа $name имеет следующие характеристики: 
                |Скорость - $speed;
                |Грузоподъемность - $liftingCapacity; 
                |Количество пассажиров - $passengers;
            """.trimMargin()
        )
    }

}

class CargoShip2(
    name: String = "Грузовой корабль",
    speed: Int = 50,
    liftingCapacity: Int = 1000,
    passengers: Int = 25,
) : Liner2(name, speed, liftingCapacity, passengers) {

    override fun loadingMethod() {
        println("Активирует погрузочный кран.")
    }

}

class Icebreaker2(
    name: String = "Ледокол",
    speed: Int = 30,
    liftingCapacity: Int = 250,
    passengers: Int = 25,
) : Liner2(name, speed, liftingCapacity, passengers) {

    fun crushIce() = println("Приступаем к колке льда.")

    override fun loadingMethod() {
        println("Открывает ворота со стороны кормы.")
    }

}
package org.example.lesson_1.lesson_17

fun main() {

    val ship1721 = Ship172("Утюг", 15, "Инсмут")
    println(ship1721.name)
    ship1721.name = "Топор"
    println(ship1721.name)

    println(ship1721.homePort)
    ship1721.homePort = "Нью Гемпшир"
    println(ship1721.homePort)

}

class Ship172(
    _name: String,
    _averageSpeed: Int,
    _homePort: String,
) {

    var name: String = _name
        get() = field
        set(value) {
            println("Изменить имя корабле невозможно")
        }

    var averageSpeed: Int = _averageSpeed
        get() = field
        set(value) {
            field = value
        }

    var homePort = _homePort
        get() = field
        set(value) {
            field = value
        }
}


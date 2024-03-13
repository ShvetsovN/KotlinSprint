package org.example.lesson_1.lesson_14

fun main() {

    val fobos = Satellite("Фобос")
    val daymos = Satellite("Деймос")
    val mars = Planet("Марс", listOf(fobos, daymos))

    println("Впереди планета ${mars.name}! У неё ${mars.satellites.size} спутника: ${mars.satellites.joinToString {it.name}}.")

}

open class HeavenlyBody(
    val name: String,
    val isPresenceOfAtmosphere: Boolean = false,
    val isSuitableForLanding: Boolean = false,
)

class Planet(
    name: String,
    val satellites: List<Satellite>,
) : HeavenlyBody(name, isSuitableForLanding = true)

class Satellite(
    name: String,
) : HeavenlyBody(name)
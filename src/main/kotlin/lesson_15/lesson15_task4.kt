package org.example.lesson_1.lesson_15

fun main() {

    val musicalInstrument1541 = MusicalInstrument("Violin", 5)
    val component1541 = Component("Violin Strings", 15)
    val component1542 = Component("Guitar Strings", 17)

    musicalInstrument1541.search(component1541)
    musicalInstrument1541.search(component1542)

}

interface InstrumentOrComponent{
    val name: String
    val number: Int
}

class MusicalInstrument(
    override val name: String,
    override val number: Int,
) : InstrumentOrComponent, Search {
    override fun search(component: Component) {
        println("Выполняется поиск")
        if (component.name.contains(this.name)) println("На складе осталось ${component.number} ед.")
        else println("Совпадений не найдено")
    }
}

class Component(
    override val name: String,
    override val number: Int,
) : InstrumentOrComponent

interface Search {
    fun search(component: Component)
}
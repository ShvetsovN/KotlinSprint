package org.example.lesson_1.lesson_15

fun main(){

    val musicalInstrument1541 = MusicalInstrument("Violin", 5)
    val component1541 = Component("Violin Strings", 15)
    val component1542 = Component("Guitar Strings", 17)

    musicalInstrument1541.search(component1541, musicalInstrument1541)
    musicalInstrument1541.search(component1542, musicalInstrument1541)

}
class MusicalInstrument(
    val name: String,
    val numbers: Int,

) : Search

class Component(
    val name: String,
    val numbers: Int,
)

interface Search {
    fun search(component: Component, musicalInstrument: MusicalInstrument){
        println("Выполняется поиск")
        if(component.name.contains(musicalInstrument.name)) println("На складе осталось ${component.numbers} ед.")
        else println("Совпадений не найдено")
    }
}
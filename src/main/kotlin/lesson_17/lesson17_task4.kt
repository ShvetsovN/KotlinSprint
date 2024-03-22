package org.example.lesson_1.lesson_17

fun main() {

    val package174 = Package(174, "Новый Орлеан", 0)
    package174.currentLocationOfTheParcel = "Вашингтон"
    println(package174.currentLocationOfTheParcel)
    println(package174.counter)

}

class Package(
    _parcelNumber: Int,
    _currentLocationOfTheParcel: String,
    _counter: Int = 0,
) {
    var counter = _counter

    var currentLocationOfTheParcel: String = _currentLocationOfTheParcel
        set(value) {
            field = value
            counter++
        }


}
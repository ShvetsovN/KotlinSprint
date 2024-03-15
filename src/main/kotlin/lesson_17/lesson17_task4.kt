package org.example.lesson_1.lesson_17

fun main(){

    val package174 = Package(174, "Новый Орлеан", 0)
    package174.setCurrentLocationOfTheParcel("Вашингтон")
    println(package174.getCurrentLocationOfTheParcel())
    println(package174.getCounter())

}

class Package(
    private val parcelNumber: Int,
    private var currentLocationOfTheParcel: String,
    private var counter: Int,
) {
    fun getCurrentLocationOfTheParcel(): String = currentLocationOfTheParcel
    fun setCurrentLocationOfTheParcel(newLocation: String) {
        currentLocationOfTheParcel = newLocation
        counter++
    }

    fun getCounter(): Int = counter
}
package org.example.lesson_1.lesson_13

fun main() {

    val contacts2 = Contacts2("Ростислав", 89123456789)
    contacts2.printInformation()

}

class Contacts2(
    val name: String,
    val phoneNumber: Long,
    val companyName: String? = null,
) {

    fun printInformation() {
        println("Имя: $name\nНомер: $phoneNumber\nКомпания: ${companyName ?: "<не указано>"}")
    }

}
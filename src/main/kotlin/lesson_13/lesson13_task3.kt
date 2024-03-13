package org.example.lesson_1.lesson_13

fun main() {

    val contacts31 = Contacts3("Антон", 123456789, "Альфа")
    val contacts32 = Contacts3("Батон", 23456789, "Бетта")
    val contacts33 = Contacts3("Ватон", 3456789)
    val contacts34 = Contacts3("Гатон", 456789)
    val contacts35 = Contacts3("Датон", 56789, "null")
    val contactsList = listOf(contacts31, contacts32, contacts33, contacts34, contacts35)
    contactsList.forEach { it.printInformation() }

}

class Contacts3(
    val name: String,
    val phoneNumber: Long,
    val companyName: String? = null,
) {

    fun printInformation() {
        println("Компания: ${companyName ?: "<не указано>"}")
    }

}
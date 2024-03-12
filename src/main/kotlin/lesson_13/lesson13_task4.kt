package org.example.lesson_1.lesson_13

fun main() {
    val contactList = mutableListOf<Contacts4>()

    do {
        println("Укажите имя: ")
        val name = readLine()

        println("Укажите номер телефона: ")
        val phoneNumber = readLine()?.toLongOrNull()

        println("Укажите название компании: ")
        var companyName = readLine()
        if(companyName?.isEmpty() == true) companyName = null

        if (phoneNumber != null) contactList.add(Contacts4(name, phoneNumber, companyName))
        else println("Вы не указали номер телефона")

        println("Добавить еще один контакт? да/нет: ")

    } while (readln().equals("да", true))

    contactList.forEach { it.printInformation() }

}

class Contacts4(
    val name: String?,
    val phoneNumber: Long?,
    val companyName: String?,
) {

    fun printInformation() {
        println("***\nИмя: $name\nНомер: $phoneNumber\nКомпания: ${companyName ?: "<не указано>"}")

    }
}
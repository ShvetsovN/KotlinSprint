package org.example.lesson_1.lesson_13

fun main() {

    var newContacts4: Contacts4
    val contactList = mutableListOf<Contacts4>()

    do {
        println("Укажите имя, номер телефона и название компании (каждое с новой строки)")
        newContacts4 = Contacts4(readln(), readln().toLongOrNull(), readln())
        if (newContacts4.phoneNumber == null) {
            println("Вы не указали номер телефона")
            continue
        }
        contactList.add(newContacts4)
    } while (newContacts4.name != null && newContacts4.phoneNumber != null && newContacts4.companyName != null)

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
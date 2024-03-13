package org.example.lesson_1.lesson_15

fun main() {

    val user1531 = User1531("Юзер", "Йог-новичок")
    user1531.readForum()
    user1531.writeMessage()
    val admin1531 = Administrator1531("Админ", "Гуру просветления")
    admin1531.readForum()
    admin1531.writeMessage()
    admin1531.deleteMessage()
    admin1531.deleteUser(admin1531, user1531)

}

abstract class Forum(
    val status: String,
    val name: String,
) {
    abstract fun readForum()
    abstract fun writeMessage()
}

class User1531(
    status: String,
    name: String,
) : Forum(status, name) {
    override fun readForum() {
        println("Юзер читает форум")
        Thread.sleep(1000)
    }

    override fun writeMessage() {
        println("Юзер печатает сообщение")
        Thread.sleep(1000)
    }
}

class Administrator1531(
    status: String,
    name: String,
) : Forum(status, name) {
    override fun readForum() {
        println("Админ читает форум")
        Thread.sleep(1000)
    }

    override fun writeMessage() {
        println("Админ печатает сообщение")
        Thread.sleep(1000)
    }

    fun deleteMessage() {
        println("Админ удаляет сообщение")
        Thread.sleep(1000)
    }

    fun deleteUser(admin: Administrator1531, user: User1531) {
        println("${admin.name} удаляет ${user.name}")
    }
}
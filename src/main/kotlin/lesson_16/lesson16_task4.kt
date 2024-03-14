package org.example.lesson_1.lesson_16

fun main() {

    val order164 = Order164(12)
    println("Статус заказа: ${order164.getStatus()}")
    order164.manager("Готов")
    println("Статус заказа: ${order164.getStatus()}")

}

class Order164(
    private val numberOfOrder: Int,
    private var status: String = "В обработке",
) {
    fun getStatus(): String = status

    fun manager(newStatus: String) {
        status = newStatus
    }
}
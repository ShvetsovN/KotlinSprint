package org.example.lesson_1.lesson_18

fun main() {

    val order = Order()
    order.displayProduct(
        1,
        "Торт"
    )
    order.displayProduct(
        2,
        listOf("Торт", "Лазанья", "Кетчуп")
    )

}

class Order {
    fun displayProduct(
        orderNumber: Int,
        listProduct: String,
    ) {
        println("Заказ №$orderNumber\nЗаказан товар: $listProduct")
    }

    fun displayProduct(
        orderNumber: Int,
        listProduct: List<String>,
    ) {
        println("Заказ №$orderNumber\nЗаказаны товары: ${listProduct.joinToString(", ") { "[$it]" }}")
    }
}
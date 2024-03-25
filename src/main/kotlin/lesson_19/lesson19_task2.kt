package org.example.lesson_1.lesson_19

fun main() {

    val product1921 = Product192("Сюртук", 1, Category.CLOTH)
    product1921.aboutProduct()

    val product1922 = Product192("Мундштук", 2, Category.MISCELLANEOUS)
    product1922.aboutProduct()

}

enum class Category {
    CLOTH,
    STATIONERY,
    MISCELLANEOUS,
    ;

    fun getNameOfCategory(): String {
        return when (this) {
            CLOTH -> "Одежда"
            STATIONERY -> "Канцелярские товары"
            else -> "Разное"
        }
    }
}

class Product192(
    private val name: String,
    private val id: Int,
    private val category: Category,
) {
    fun aboutProduct() {
        println("Название $name\nID: $id\nКатегория: ${category.getNameOfCategory()}\n")
    }
}



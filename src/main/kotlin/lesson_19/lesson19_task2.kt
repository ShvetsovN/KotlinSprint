package org.example.lesson_1.lesson_19

fun main(){

    val product1921 = Product192("Сюртук", 1, Category.CLOTH)
    product1921.aboutProduct()

    val product1922 = Product192("Мундштук", 2, Category.MISCELLANEOUS)
    product1922.aboutProduct()

}

enum class Category{
    CLOTH {
        override fun getNameOfCategory(): String {
            return "Одежда"
        }
    },
    STATIONERY {
        override fun getNameOfCategory(): String {
            return "Канцелярские товары"
        }
    },
    MISCELLANEOUS {
        override fun getNameOfCategory(): String {
            return "Разное"
        }
    };

    abstract fun getNameOfCategory() : String
}

class Product192(
    private val name: String,
    private val id: Int,
    private val category: Category,
) {
    fun aboutProduct() {
        when(category) {
            Category.CLOTH -> println("Название $name\nID: $id\nКатегория: ${category.getNameOfCategory()}\n")
            Category.STATIONERY -> println("Название $name\nID: $id\nКатегория: ${category.getNameOfCategory()}\n")
            Category.MISCELLANEOUS -> println("Название $name\nID: $id\nКатегория: ${category.getNameOfCategory()}\n")
        }
    }
}


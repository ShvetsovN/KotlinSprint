package lesson_1

fun main() {
    // var - потому что количество заказов должно меняться.
    // UInt потому что количество заказов не может быть отрицательным.
    var totalNumberOfOrders: UInt = 75u
    val thankYouText: String = "Благодарим за покупку в нашем магазине!"
    println(totalNumberOfOrders)
    println(thankYouText)

    var companyEmployees: UInt = 2000u
//    println(companyEmployees)

    companyEmployees = 1999u
    println(companyEmployees)
}
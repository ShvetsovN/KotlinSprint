package lesson_1

fun main() {
    val year = 1961
    var hour = 9
    var minute = 7
    println(year)
    println("%02d".format(hour))
    println("%02d".format(minute))

    hour = 10
    minute = 55
    print("%02d".format(hour)+ ':'+ "%02d".format(minute))
}
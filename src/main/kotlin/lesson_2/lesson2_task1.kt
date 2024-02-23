package lesson_2

const val STUDENTS_IN_CLASS = 4

fun main() {
    val ivanGPA = 3.0f
    val petrGPA = 4.0f
    val yakovGPA = 3.0f
    val jackGPA = 5.0f

    val averageInEnglish = ((ivanGPA + petrGPA + yakovGPA + jackGPA) / STUDENTS_IN_CLASS)

    println("Средний балл по английскому языку в классе составляет: " + "%.2f".format(averageInEnglish))
}


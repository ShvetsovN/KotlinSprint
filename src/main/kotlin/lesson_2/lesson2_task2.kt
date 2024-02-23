package lesson_2

const val PERMANENT_EMPLOYEES = 50
const val EMPLOYEES_INTERNS = 30

fun main() {

    val permanentEmployeeSalary = 30000
    val internsSalary = 20000

    val allPermanentEmployeesSalary = PERMANENT_EMPLOYEES * permanentEmployeeSalary
    println("Расходы на выплату постоянных сотрудников - $allPermanentEmployeesSalary рублей")

    val allEmployeesSalary = allPermanentEmployeesSalary + (EMPLOYEES_INTERNS * internsSalary)
    println("Общие расходы по ЗП всех сотрудников - $allEmployeesSalary рублей")

    val averageSalary = allEmployeesSalary / (PERMANENT_EMPLOYEES + EMPLOYEES_INTERNS)
    println("Средняя ЗП одного сотрудника в среднем - $averageSalary рублей")

}



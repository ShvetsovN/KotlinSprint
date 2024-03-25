package org.example.lesson_1.lesson_22

fun main() {
    val viewModel = ViewModel()

    viewModel.loadData()

}

data class MainScreenState(
    var data: String ="Отсутствие данных",
    var isLoading: Boolean = false,
)

class ViewModel(
    var mainScreenState: MainScreenState = MainScreenState(),
){
    fun loadData() {
        println("Данные: ${mainScreenState.data}")
        println("Состояние загрузки: ${mainScreenState.isLoading}\n")

        var loadedData = "Загрузка данных"
        mainScreenState = mainScreenState.copy(data = loadedData, isLoading = true)

        println("Данные: ${mainScreenState.data}")
        println("Состояние загрузки: ${mainScreenState.isLoading}\n")

        loadedData = "Наличие загруженных данных"
        mainScreenState = mainScreenState.copy(data = loadedData, isLoading = false)

        println("Данные: ${mainScreenState.data}")
        println("Состояние загрузки: ${mainScreenState.isLoading}")
    }
}

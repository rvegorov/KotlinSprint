package org.example.lesson_22


class MainScreenViewModel {

    data class MainScreenState(
        val data: String?,
        val isLoading: Boolean = false
    )

    var mainScreenState = MainScreenState(null)

    fun loadData() {
        mainScreenState = mainScreenState.copy(data = "отсутствие данных")
        println(mainScreenState.data)
        mainScreenState = mainScreenState.copy(data = "загрузка данных", isLoading = true)
        println(mainScreenState.data)
        mainScreenState = mainScreenState.copy(data = "наличие загруженных данных", isLoading = false)
        println(mainScreenState.data)
    }
}

fun main() {
    val msvm = MainScreenViewModel()
    msvm.loadData()
}
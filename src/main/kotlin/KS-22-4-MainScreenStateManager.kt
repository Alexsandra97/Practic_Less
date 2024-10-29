fun main() {
    val manager = MainScreenStateManager()
    println(manager.currentState.data)
    manager.loadData()
    println(manager.currentState.data)
}

class MainScreenStateManager {

    data class State(val data: String = "Данные отсутсвуют", val isLoading: Boolean = false)

    var currentState = State()

    fun loadData() {
        currentState = currentState.copy(isLoading = true)
        Thread.sleep(1000)
        println("Загрузка данных")
        Thread.sleep(2000)

        val response = "Данные загружены"
        currentState = currentState.copy(data = response, isLoading = false)
    }
}
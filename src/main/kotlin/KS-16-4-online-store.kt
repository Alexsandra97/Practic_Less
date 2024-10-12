class OnlineOrdering(private val numberOrdering: Int = 0) {
    private var readyStatus: String = ""

    private fun changeStatus(newStatus: String) {
        println("Для смены статуса отправте заявку менеджеру с новым статусом")
        val newStatus = readln()
    }

    fun sendRequest(newStatus: String) {
        readyStatus = newStatus
        changeStatus(newStatus)
    }
}



fun main() {
    val order = OnlineOrdering(4)
    println(order)
    order.sendRequest("В работе")
    println()
}
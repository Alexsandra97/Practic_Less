class OnlineOrdering(private val numberOrdering: Int) {
    private var readyStatus: String = "в работе"
    fun getStatus() = readyStatus

    private fun changeStatus(newStatus: String) {
        readyStatus = newStatus
    }

    fun sendRequest() {
        println("Для смены статуса отправте заявку менеджеру с новым статусом")
        val newStatus = readln()
        changeStatus(newStatus)
    }
}

fun main() {
    val order = OnlineOrdering(4)
    println(order.getStatus())
    order.sendRequest()
    println(order.getStatus())
}
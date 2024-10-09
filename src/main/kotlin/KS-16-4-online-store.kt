class OnlineOrdering(private val numberOrdering: Int = 0, var readyStatus: String = "") {

    fun changeStatus() {
        println("Для смены статуса отправте заявку менеджеру с новым статусом")
        val newStatus = readln()
        sendRequest(newStatus)
    }
}

fun sendRequest(newStatus: String) {
    OnlineOrdering().readyStatus = newStatus
}

fun main() {
    val order = OnlineOrdering(4, "close")
    order.changeStatus()
    println("${order.readyStatus}")
}
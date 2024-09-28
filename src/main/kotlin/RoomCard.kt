class р(
    val cover: String,
    val name: String,
    val listParticipants: ListParticipants = ListParticipants()

) {
    fun addParticipant() {
        println("Добавить участника. Введите никнейм")
        listParticipants.nickname = readln()
        println("Статус: 1. разговаривает 2. микрофон выключен 3. пользователь заглушен")
        listParticipants.status = readln()

    }



}

class ListParticipant(
    var nickname: String = "",
    var status: String = "",
) {

}
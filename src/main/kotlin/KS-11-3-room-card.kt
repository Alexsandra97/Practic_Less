fun main() {

    val roomCard: RoomCard = RoomCard(
        cover = "cover_image.png",
        name = "Комната 1",
        listParticipants = mutableListOf()
    )

    roomCard.addParticipant()
    println("${roomCard.cover}\n${roomCard.name}\n")
    roomCard.updateStatus()
    roomCard.listParticipants.forEach { listUser -> println("${listUser.nickname}: ${listUser.status}") }

}

class RoomCard(
    val cover: String,
    val name: String,
    var listParticipants: MutableList<User>
) {
    fun addParticipant() {
        println("Введите нового участника")
        val newUser = User(readln())
        listParticipants.add(newUser)
    }

    fun updateStatus() {
        println("Введите участника, которому хотите добавить статус")
        listParticipants.forEach { listUser ->
            if (listUser.nickname == readln()) {
                println("Введите статус")
                listUser.status = readln()
            }
        }
    }
}

class User(
    var nickname: String,
    var status: String = ""
)
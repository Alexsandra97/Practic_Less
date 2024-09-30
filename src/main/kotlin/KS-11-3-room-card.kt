fun main() {



    val roomCard: RoomCard = RoomCard(
        cover = "cover_image.png",
        name = "Комната 1",
        listParticipants = mutableListOf()

    )



    roomCard.addParticipant()
    println("${roomCard.cover}\n${roomCard.name}\n")
    roomCard.listParticipants.forEach { listUser -> println("${listUser.nickname}\n ${listUser.status}") }

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
}

class User(
    var nickname: String,
    var status: String = ""
)
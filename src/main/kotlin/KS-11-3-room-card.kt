fun main() {

    val roomCard: RoomCard = RoomCard(
        cover = "1",
        name = "Комната 1",

    )

    roomCard.addParticipant()
    println("${roomCard.cover}\n${roomCard.name}\n${roomCard.listParticipants.status}\n${roomCard.listParticipants.nickname}")

}
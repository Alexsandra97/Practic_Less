interface Forum {
    var id: Int
    var text: String

    fun createNewUser(userName: String): String{
        text = userName
        ++id
        return text
    }

    fun createNewMessae(userId: Int): String {
        val message = listOf<MemberForum>()
        if ((message.find { it.userId == userId}) != null) {
            text = readln()
            id = userId
        }
        return text
    }
}

fun printThread() {
    println("")
}

class MemberForum(
    val userId: Int,
    val userName: String,
) : Forum {

    override var id: Int = 0
        get() = userId
    override var text: String = ""
        get() = userName


}

class ForumMessage(
    val authorId: Int,
    val message: String,
) : Forum {
    override fun create() {

    }
}
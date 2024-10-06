class Forum private constructor(
    var id: Int = 0,
    var text: String,
    var listUser: MutableList<String> = mutableListOf()
) {


    fun createNewUser(vararg text: String): Forum  {
        listUser.add(text.toString())
        return Forum(++id, text.toString())
    }

    fun createNewMessae(userId: Int): String {
        val message = listOf<MemberForum>()
        if ((message.find { it.userId == userId }) != null) {
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

    override var id: Int
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
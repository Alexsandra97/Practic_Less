class Forum(private val caption: String = "") {
    private var lastUserId = 0
    private val userList: MutableList<ForumMember> = mutableListOf()
    private val messageList: MutableList<ForumMessage> = mutableListOf()

    fun createNewUser(text: String): ForumMember {
        val memberForum = ForumMember(lastUserId++, text)
        userList.add(memberForum)
        return memberForum
    }

    fun createNewMessage(userId: Int, messageText: String) {
        val found = userList.find { it.userId == userId }
        if (found != null) {
            val forumMessage = ForumMessage(userId, messageText)
            messageList.add(forumMessage)
        }
    }

    fun printThread() {
        messageList.forEach { message: ForumMessage ->
            val member = userList.find { it.userId == message.authorId }
            if (member != null) {
                print("${member.userName}: ${message.message} ")
            }
            println()
        }
    }

}

fun main() {
    val example = Forum("Форум")

    val user1 = example.createNewUser("пользователь1")
    val user2 = example.createNewUser("пользователь2")

    example.createNewMessage(user1.userId, "текст1")
    example.createNewMessage(user2.userId, "текст2")

    example.printThread()

}

class ForumMember(
    val userId: Int,
    val userName: String,
)

class ForumMessage(
    val authorId: Int,
    val message: String,
)
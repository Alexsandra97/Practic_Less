
open class Forum(
    var id: Int = 0,
    var text: String,
    var listUser: MutableList<String> = mutableListOf()
) {

    fun createNewUser(text: String): String {
        val memberForum = text.toString()
        listUser.add(memberForum)
        ++id
        return memberForum
    }

    fun createNewMessae(userId: Int): String {
        val message = readln()
        id = userId
       // if ((message.find { it.userId == userId }) != null) {
        //    text = readln()
         //   id = userId
       // }

        if (listUser.find { it })

    }
}


fun main() {
    val a1 = Forum("")
}

class MemberForum(override val id: Int, override val text: String: String):Forum(id, text) {

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
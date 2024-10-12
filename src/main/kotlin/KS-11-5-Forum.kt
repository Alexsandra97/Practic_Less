open class Forum() {
    open var id: Int = 0
    open var text: String = ""
    open var listUser: MutableList<Forum> = mutableListOf()


    fun createNewUser(text: String): MemberForum {
        id = listUser.size
        val memberForum = MemberForum(id, text)
        listUser.add(memberForum)
        return memberForum
    }

    fun createNewMessae(id: Int) {

        if (listUser.find { (it.id == id) } != null) {
            println("пользователь найден. введите сообщение")
            text = readln()
            val forumMessage = ForumMessage(id, text)
            listUser.add(forumMessage)
        }
    }

    fun printThread() {
        for (i in 0..1) {
            listUser.forEach { it ->
                if (it.javaClass.name == "MemberForum" && it.id == i) {
                    print("${ it.text }: ")}
                    if (it.javaClass.name == "ForumMessage" && it.id == i) {println(it.text) }
            }
        }
    }
}


fun main() {
    val example = Forum()
    example.createNewUser("user1")
    example.createNewUser("user2")
    example.listUser.forEach { it -> println("${it.id} ${it.text} ${it.javaClass}") }

    example.createNewMessae(1)
    example.createNewMessae(0)
    example.listUser.forEach { it -> println("${it.id} ${it.text} ${it.javaClass}") }

    example.printThread()

}

class MemberForum(val userId: Int, val userName: String) : Forum() {
    override var id: Int = 0
        get() = userId
    override var text: String = ""
        get() = userName
}

class ForumMessage(
    val authorId: Int,
    val message: String,
) : Forum() {
    override var id: Int = 0
        get() = authorId
    override var text: String = ""
        get() = message
}
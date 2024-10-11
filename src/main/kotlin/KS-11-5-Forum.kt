
open class Forum {
    open var id: Int = 0
    open var text: String = ""
    open var listUser: MutableList<Forum> = mutableListOf()

    fun createNewUser(text: String): MemberForum {
        id = listUser.count()
        val memberForum = MemberForum(id, text)
        listUser.add(memberForum)
        return memberForum
    }




    fun createNewMessae(userId: Int) {
        val message = readln()
        id = userId
       // if ((message.find { it.userId == userId }) != null) {
        //    text = readln()
         //   id = userId
       // }
       // if (listUser.find { it })

    }
}


fun main() {
    val object1 = Forum()
    object1.createNewUser("юзер1")
    object1.listUser.forEach { it -> println(it.id)
        println(it.text)}

    val object2 = Forum()
    object2.createNewUser("юзер2")
    object2.listUser.forEach { it -> println(it.id)
    println(it.text)}
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
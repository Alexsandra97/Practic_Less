abstract class Users {
    abstract val user: String
    abstract val id: Int
    abstract fun readForum()
    abstract fun writeMessage()
    abstract fun deleteMessage()
    abstract fun deleteUser()
}

class RegularUser(override val user: String, override val id: Int) : Users() {
    override fun readForum() {
        println("$user прочитал сообщение")
    }

    override fun writeMessage() {
        println("$user написал сообщение")
    }

    override fun deleteMessage() {}
    override fun deleteUser() {}


}

class Administrator(override val user: String, override val id: Int) : Users() {
    override fun readForum() {
        println("$user прочитал сообщение")
    }

    override fun writeMessage() {
        println("$user написал сообщение")
    }

    override fun deleteMessage() {
        println("$user удалил сообщение с id $id")
    }

    override fun deleteUser() {
        println("$user удалил пользователя с id $id")
    }
}
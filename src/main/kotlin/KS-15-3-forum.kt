abstract class User {
    abstract val user: String
    abstract val id: Int
    abstract fun readForum()
    abstract fun writeMessage()
}

class RegularUser(override val user: String, override val id: Int) : User() {
    override fun readForum() {
        println("$user прочитал сообщение")
    }

    override fun writeMessage() {
        println("$user написал сообщение")
    }

}

class Administrator(override val user: String, override val id: Int) : User() {
    override fun readForum() {
        println("$user прочитал сообщение")
    }

    override fun writeMessage() {
        println("$user написал сообщение")
    }

    fun deleteMessage() {
        println("$user удалил сообщение с id $id")
    }

    fun deleteUser() {
        println("$user удалил пользователя с id $id")
    }
}
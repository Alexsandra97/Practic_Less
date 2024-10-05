abstract class Forum {
    abstract val user: String
    abstract fun readForum()
    abstract fun writeMessage()
    abstract fun deleteMessage()
    abstract fun deleteUser()
}

class RegularUser(override val user: String) : Forum() {
    override fun readForum() {
        println("$user прочитал сообщение")
    }

    override fun writeMessage() {
        println("$user написал сообщение")
    }

    override fun deleteMessage() {
        println("$user не может удалить сообщение")
    }

    override fun deleteUser() {
        println("$user не может удалить пользователя")
    }
}

class Administrator(override val user: String) : Forum() {
    override fun readForum() {
        println("$user прочитал сообщение")
    }

    override fun writeMessage() {
        println("$user написал сообщение")
    }

    override fun deleteMessage() {
        println("$user удалил сообщение")
    }

    override fun deleteUser() {
        println("$user удалил пользователя")
    }
}
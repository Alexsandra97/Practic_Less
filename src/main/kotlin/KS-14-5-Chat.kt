class Chat() {

    val messageList: MutableList<Message> = mutableListOf()
    val childMessageList: MutableList<ChildMessage> = mutableListOf()
    var idMessage = 0

    fun addMessage(text: String, author: String) {
        val message = Message(idMessage++, text, author)
        messageList.add(message)
    }

    fun addThreadMessage(text: String, author: String, parentMessageId: Int) {
        val message = ChildMessage(idMessage++, text, author, parentMessageId)
        childMessageList.add(message)
    }

    fun printChat() {
        val childMessageGroup = childMessageList.groupBy { it.parentMessageId }
        val messageGroup = messageList.groupBy { it.id }

        for (id in messageGroup) {
            for (a in id.value) {
                println()
                println("id: ${a.id} | message: ${a.text} | author: ${a.author}")
                for (parentMessageId in childMessageGroup) {
                    for (b in parentMessageId.value) {

                        if (b.parentMessageId == a.id) {
                            println("\tid: ${b.id} | message: ${b.text} | author: ${b.author} | id main mess: ${b.parentMessageId}")
                        }

                    }
                }
            }
        }


    }
}

open class Message(val id: Int, val text: String, val author: String) {}

class ChildMessage(id: Int, text: String, author: String, val parentMessageId: Int) : Message(id, text, author) {

}

fun main() {
    val descort = Chat()
    descort.addMessage("сообщение", "автор")
    descort.addMessage("важное сообщение", "просто автор")
    descort.addMessage("не важное сообщение", "не просто автор")

    descort.addThreadMessage("комментарий", "комментатор", 0)
    descort.addThreadMessage("тоже коментарий", "тоже комментатор", 0)
    descort.addThreadMessage("бла бла бла", "коментаришка", 1)

    descort.printChat()
}
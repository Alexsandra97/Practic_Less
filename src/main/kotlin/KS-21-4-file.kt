import java.io.File

fun main() {
    val file = File("textFile.txt")
    file.writeToFile()
}

fun File.writeToFile() {
    val text = this.readText()
    val message = "ТЕКСТ1\n"
    writeText(message.toLowerCase() + text)

}
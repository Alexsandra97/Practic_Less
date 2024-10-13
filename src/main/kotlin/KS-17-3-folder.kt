const val ZERO = 0

class Folder(name: String?, numberFiles: Int, isSecret: Boolean) {

    val isSecret = isSecret
    val name = name
        get() = (if (isSecret == true) "Скрытая папка" else field).toString()

    var numberFiles = numberFiles
        get() = (if (isSecret == true) ZERO else field) as Int

}

fun main() {

    val foider = Folder("секретная папка", 5, true)
    println(foider.name)
    println("Количество файлов: ${foider.numberFiles}")

}
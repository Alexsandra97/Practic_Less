fun Map<Int, String>.maxCategory(): String {
    val max = this.keys.max()
    return this.get(max).toString()
}

fun main() {
    val skillMap = mapOf(3 to "Сила", 4 to "Ум", 1 to "Выносливость", 4 to "Логика")
    println(skillMap.maxCategory())
}
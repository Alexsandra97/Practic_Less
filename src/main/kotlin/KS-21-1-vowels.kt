fun String.vowelCount() {
    var numberVowels = 0
    this.forEach { letter ->
        when (letter) {
            'a', 'e', 'i', 'o', 'u' -> ++numberVowels
        }
    }
    println(numberVowels)
}

fun main() {
    val word = "hello"
    word.vowelCount()
}

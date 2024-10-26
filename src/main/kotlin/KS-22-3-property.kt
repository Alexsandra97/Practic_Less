data class DataClass(val property1: String, val property2: Int, val isProperty3: Boolean)

fun main() {
    val dataClass = DataClass("свойство", 1, true)
    val(property1, property2, property3) = dataClass
    println("property1 = $property1, property2 = $property2, property3 = $property3")
}
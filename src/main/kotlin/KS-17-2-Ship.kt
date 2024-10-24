class Spih1(name: String, averageSpeed: Int, homePort: Int) {

    var name = name
        get() = field
        set(value: String) {
            if (value != field) {
                println("Нельзя менять названи ккорабля!")
            }
        }
}

fun main() {

    val object1 = Spih1("Ship", 10, 20)
    object1.name = "Корабль"
    println(object1.name)

}
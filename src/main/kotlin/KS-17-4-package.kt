class Package(id: Int, currentLocation: String) {
    var movementCounter = 0
    var currentLocation = currentLocation
        get() = field
        set(value: String) {
            if (value != field) ++movementCounter
            field = value
        }
}

fun main() {
    val package1 = Package(1, "Москва")
    println("${package1.movementCounter} ${package1.currentLocation}")
    package1.currentLocation = "Владивосток"
    println("${package1.movementCounter} ${package1.currentLocation}")
}
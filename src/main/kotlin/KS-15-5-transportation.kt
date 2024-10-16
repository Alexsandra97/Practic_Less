interface MovementCars {
    fun arriveCar()
}

interface MovementPassengers {
    val numberPassengers: Int
    val maxNumberPassengers: Int
    fun transportPassenger(maxNumberPassengers: Int, numberPassengers: Int)
}

interface MovementCargo {
    val numberCargo: Int
    val maxNumberCargo: Int
    fun transportCargo(maxNumberCargo: Int, numberCargo: Int)
}

class Trucks(
    override val numberCargo: Int,
    override val numberPassengers: Int,
    override val maxNumberPassengers: Int = 1,
    override val maxNumberCargo: Int = 2,
) : MovementCars,
    MovementPassengers, MovementCargo {
    override fun arriveCar() {
        println("Машина приехала.")
    }

    override fun transportCargo(maxNumberCargo: Int, numberCargo: Int) {
        if (maxNumberCargo >= numberCargo) println("${numberCargo} т. груза загрузили в машину")
        else println("Слишком большое количество груза. Может быть стоит заказать еще машину")
    }

    override fun transportPassenger(maxNumberPassengers: Int, numberPassengers: Int) {
        if (maxNumberPassengers >= numberPassengers) {
            println("${numberPassengers} пассажира сели в машину")
        } else {
            println("Слишком большое количество пассажиров. Может быть стоит заказать еще машину")
        }
    }
}

class PassengerCars(
    override val numberPassengers: Int,
    override val maxNumberPassengers: Int = 3,
) : MovementCars,
    MovementPassengers {
    override fun arriveCar() {
        println("Машина приехала.")
    }

    override fun transportPassenger(maxNumberPassengers: Int, numberPassengers: Int) {
        if (maxNumberPassengers >= numberPassengers) {
            println("${numberPassengers} пассажира сели в машину")
        } else {
            println("Слишком большое количество пассажиров. Может быть стоит заказать еще машину")
        }
    }
}


fun main() {
    val car1 = Trucks(2, 1)
    car1.arriveCar()
    car1.transportCargo(car1.maxNumberCargo, car1.numberCargo)
    car1.transportPassenger(car1.maxNumberPassengers, car1.numberPassengers)
    println()

    val car2 = PassengerCars(3)
    car2.arriveCar()
    car2.transportPassenger(car2.maxNumberPassengers, car2.numberPassengers)
    println()

    val car3 = PassengerCars(2)
    car3.arriveCar()
    car3.transportPassenger(car3.maxNumberPassengers, car3.numberPassengers)
}

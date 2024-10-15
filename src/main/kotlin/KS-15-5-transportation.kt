interface MovementCars {
    fun arriveCar() {
        println("Машина приехала.")
    }
}

interface MovementPassengers {
    fun transportPassenger(maxNumberPassengers: Int, numberPassengers: Int) {
        if (maxNumberPassengers >= numberPassengers) {
            println("${numberPassengers} пассажира сели в машину")
        }
        else {
            println("Слишком большое количество пассажиров. Может быть стоит заказать еще машину")
        }
    }
}

interface MovementCargo {
    fun transportCargo(maxNumberCargo: Int, numberCargo: Int) {
        if (maxNumberCargo >= numberCargo) println("${numberCargo} т. груза загрузили в машину")
        else println("Слишком большое количество груза. Может быть стоит заказать еще машину")
    }
}


abstract class Cars {
    abstract val maxNumberPassengers: Int
    abstract val maxNumberCargo: Int
    abstract val numberPassengers: Int
    abstract val numberCargo: Int
}

class Trucks(
    override val numberCargo: Int,
    override val numberPassengers: Int,
    override val maxNumberPassengers: Int = 1,
    override val maxNumberCargo: Int = 2,
) : Cars(), MovementCars,
    MovementPassengers, MovementCargo {
    override fun arriveCar() {
        super.arriveCar()
    }

    override fun transportCargo(maxNumberCargo: Int, numberCargo: Int) {
        super.transportCargo(maxNumberCargo, numberCargo)
    }

    override fun transportPassenger(maxNumberPassengers: Int, numberPassengers: Int) {
        super.transportPassenger(maxNumberPassengers, numberPassengers)
    }
}

class PassengerCars(
    override val numberCargo: Int,
    override val numberPassengers: Int,
    override val maxNumberPassengers: Int = 3,
    override val maxNumberCargo: Int = 0,
    ) : Cars(), MovementCars,
    MovementPassengers, MovementCargo {
    override fun arriveCar() {
        super.arriveCar()
    }

    override fun transportPassenger(maxNumberPassengers: Int, numberPassengers: Int) {
        super.transportPassenger(maxNumberPassengers, numberPassengers)
    }
}


fun main() {
    val car1 = Trucks(2, 1)
    car1.arriveCar()
    car1.transportCargo(car1.maxNumberCargo, car1.numberCargo)
    car1.transportPassenger(car1.maxNumberPassengers, car1.numberPassengers)
    println()

    val car2 = PassengerCars(0, 3)
    car2.arriveCar()
    car2.transportPassenger(car2.maxNumberPassengers, car2.numberPassengers)
    println()

    val car3 = PassengerCars(0, 2)
    car3.arriveCar()
    car2.transportPassenger(car3.maxNumberPassengers, car3.numberPassengers)
}

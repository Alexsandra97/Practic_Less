interface FlyingCreatures {
    val name: String
    fun move() {
        print(" летает")
    }
}

interface FloatingCreatures {
    val name: String
    fun move() {
        print(" плавает")
    }
}

class Duck(override val name: String = "Утка") : FlyingCreatures,FloatingCreatures {
    init {
        print(name)
    }

    override fun move() {
        super<FlyingCreatures>.move()
        print(" и")
        super<FloatingCreatures>.move()
        println()
    }

}

class Seagull(override val name: String = "Чайка") : FlyingCreatures {
    init {
        print(name)
    }

    override fun move() {
        super.move()
        println()
    }
}

class CrucianCarp(override val name: String = "Карась") : FloatingCreatures {
    init {
        print(name)
    }

    override fun move() {
        super.move()
    }
}

fun main() {

    Duck().move()
    Seagull().move()
    CrucianCarp().move()

}
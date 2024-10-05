interface FlyingCreatures {
    val name: String
    fun move() {
        println(" летает")
    }
}

interface FloatingCreatures {
    val name: String
    fun move() {
        println(" плавает")
    }
}

class Duck(override val name: String = "Утка") : FlyingCreatures {
    init {
        print(name)
    }

    override fun move() {
        super.move()
    }
}

class Seagull(override val name: String = "Чайка") : FlyingCreatures {
    init {
        print(name)
    }

    override fun move() {
        super.move()
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
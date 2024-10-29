import java.time.LocalDateTime

data class GalacticGuide(
    val title: String,
    val description: String,
    val eventDateTime: LocalDateTime?,
    val distanceFromEarthInLightYears: Double
)

fun main() {
    val alphaCentauri = GalacticGuide(
        title = "Alpha Centauri",
        description = "Ближайшая к Земле звездная система.",
        eventDateTime = null,
        distanceFromEarthInLightYears = 4.3
    )

    println("Название: ${alphaCentauri.title}")
    println("Описание: ${alphaCentauri.description}")
    println("Дата и время события: ${alphaCentauri.eventDateTime ?: "Нет данных"}")
    println("Расстояние от Земли: ${alphaCentauri.distanceFromEarthInLightYears} световых лет")
}
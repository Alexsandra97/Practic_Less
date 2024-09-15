fun main() {

    val exercisesHandsAndAbs = 1
    val exercisesLegsAndBack = 0
    val trainingDay = 5
    val odd = trainingDay % 2

    val whatExercises = """
Упражнения для рук:    ${odd == exercisesHandsAndAbs}
Упражнения для ног:    ${odd == exercisesLegsAndBack}
Упражнения для спины:  ${odd == exercisesLegsAndBack}
Упражнения для пресса: ${odd == exercisesHandsAndAbs}
 """

    println(whatExercises)

}
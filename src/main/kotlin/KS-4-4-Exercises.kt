fun main() {

    val exercisesHands = 1
    val exercisesLegs = 0
    val exercisesBack = 0
    val exercisesAbs = 1
    val trainingDay = 5

    val whatExercises = """
Упражнения для рук:    ${(trainingDay % 2) == exercisesHands}
Упражнения для ног:    ${(trainingDay % 2) == exercisesLegs}
Упражнения для спины:  ${(trainingDay % 2) == exercisesBack}
Упражнения для пресса: ${(trainingDay % 2) == exercisesAbs}
 """

    println(whatExercises)

}
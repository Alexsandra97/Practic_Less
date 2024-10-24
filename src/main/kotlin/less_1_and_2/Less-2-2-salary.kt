package less_1_and_2

fun main() {

    val oldWorkers = 50
    val newWorkers = 30
    val salaryOldWorkers = 30000
    val salaryNewWorkers = 20000

    val allSalaryOldWork = oldWorkers * salaryOldWorkers
    val allSalary = allSalaryOldWork + newWorkers * salaryNewWorkers
    val mediumSalary = allSalary / (oldWorkers + newWorkers)

    println("Расходы на выплату зарплаты постоянных сотрудников: $allSalaryOldWork")
    println("Общие расходы по ЗП после прихода стажеров: $allSalary")
    println("Среднюю ЗП одного сотрудника после устройства стажеров: $mediumSalary")

}
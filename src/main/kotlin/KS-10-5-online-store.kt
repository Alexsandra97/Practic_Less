const val USER_LOGIN = "login1"
const val USER_PASSWORD = "password1"
const val SHOPPING_CART = "сумка, кофта, сапоги"

fun main() {

    println("Введите логин:")
    val loginUser = readln()

    println("Введите пароль:")
    val passwordUser = readln()

    val accessToken = assignToken(loginUser, passwordUser)
    val result = getShoppingCart(accessToken)
    if (result != "") println(result)
    else println("Авторизация не удалась")

}

fun assignToken(loginUser: String, passwordUser: String): String? {

    var accessToken: String? = ""
    if (loginUser == USER_LOGIN && passwordUser == USER_PASSWORD) {
        val sumRange = ('A'..'Z') + ('0'..'9')
        for (i in 1..32) {
            accessToken += (sumRange.random().toString())
        }
    } else accessToken = null
    return accessToken
}

fun getShoppingCart(accessToken: String?): String {

    var shoppingCart = ""
    if (accessToken != null) {
        println("Ваша корзина:")
        shoppingCart = SHOPPING_CART
    }
    return shoppingCart

}

const val USER_LOGIN = "login1"
const val USER_PASSWORD = "password1"
const val SHOPPING_CART = "сумка, кофта, сапоги"

fun main() {

    println("Введите логин:")
    val loginUser = readln()

    println("Введите пароль:")
    val passwordUser = readln()

    val accessToken = authorization(loginUser, passwordUser)
    println(getShoppingCart(accessToken))

}

fun authorization(loginUser: String, passwordUser: String): String? {

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

    var shoppingCart = "Авторизация не удалась"
    if (accessToken != null) {
        println("Ваша корзина:")
        shoppingCart = SHOPPING_CART
    }
    return shoppingCart

}

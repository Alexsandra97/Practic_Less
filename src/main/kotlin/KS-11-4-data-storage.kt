class RecipeCategory(
    val id: Int,
    val dishCategory: List<Recipe>,
    val nameDishCategory: String,
    val descriptionDishCategory: String,
    val imageUrl: String
)

class Recipe(
    val ingredient: List<Ingredient>,
    val recipe: String,
    val hasFavourites: Boolean,
    val imageUrl: String
)

class Ingredient(
    val ingredient: MutableList<String>,
    val sumPortion: Int,
    val measureUnit: String,
    val descriptionIngredient: String,
)
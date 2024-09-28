class RecipeCategory(
    val dishCategory: List<Recipe>
)

class Recipe(
    val ingredient: List<Ingredient>,
    val recipe: String,
    val favourites: Boolean,
)

class Ingredient(
    val ingredient: MutableList<String>,
    val sumPortion: Int
)
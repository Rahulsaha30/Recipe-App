package eu.tutorials.myrecipeapp

sealed class screen(val route:String) {

    object RecipeScreen:screen("recipescreen")
    object detailScreen:screen("detailscreen")

}
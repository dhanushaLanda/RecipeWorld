package com.portfolio.myreceipesservice

import org.springframework.web.bind.annotation.*

@RestController()
class RecipeController(val service: RecipeService) {
    @GetMapping("/recipe")
    fun getRecipe(@RequestParam("id")  id: String) = service.findMessageById(id)

    @PostMapping("/add/recipe")
    fun saveRecipe(@RequestBody recipe: Recipe) = service.saveRecipe(recipe)

    @GetMapping("recipes")
    fun getAllRecipes() = service.findRecipes()
}


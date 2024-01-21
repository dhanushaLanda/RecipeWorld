package com.portfolio.myreceipesservice

import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.stereotype.Service
import java.util.*
import org.springframework.jdbc.core.query

@Service
class RecipeService(val db: JdbcTemplate){

    fun findRecipes() : List<Recipe> = db.query("select * from recipes") {
        response,_ -> Recipe(response.getString("id"), response.getString("name"), response.getString("imageLink"))
    }
    fun saveRecipe(recipe: Recipe) {
        val id = recipe.id ?: UUID.randomUUID().toString()
         db.update(
             "insert into recipes values ( ?, ?, ?)", id, recipe.name, recipe.imageLink
         )
    }
    fun findMessageById(id: String): List<Recipe> = db.query("select * from recipes where id = ?", id) { response, _ ->
        Recipe(response.getString("id"), response.getString("name"), response.getString("imageLink"))
    }

}

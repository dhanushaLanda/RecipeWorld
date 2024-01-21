package com.portfolio.myreceipesservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MyReceipesServiceApplication

data class Recipe(val id:String?, val name: String, val imageLink:String)
fun main(args: Array<String>) {
    runApplication<MyReceipesServiceApplication>(*args)
}

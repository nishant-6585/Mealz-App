package com.example.mealzapp.model

import com.example.mealzapp.model.response.MealCategoriesResponse

class MealsRepository {

    fun getMeals() : MealCategoriesResponse = MealCategoriesResponse(arrayListOf())
}
package com.example.mealzapp.ui.meals

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.mealzapp.ui.theme.MealzAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MealzAppTheme {
                MealsCategoryScreen()
            }
        }
    }
}

@Composable
fun MealsCategoryScreen() {
    val viewModel: MealsCategoriesViewModel = viewModel()
    val meals = viewModel.getMeals()
    Text(
        text = "Hello Compose"
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MealzAppTheme {
        MealsCategoryScreen()
    }
}
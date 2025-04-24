package com.vrushank.healthtracker

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.vrushank.core.navigation.Route
import com.vrushank.core.util.UiEvent
import com.vrushank.healthtracker.navigation.navigate
import com.vrushank.healthtracker.ui.theme.HealthTrackerTheme
import com.vrushank.onboarding_presentation.welcome.WelcomeScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HealthTrackerTheme {
                    val navController = rememberNavController()
                   NavHost(navController,Route.WELCOME){
                       composable(Route.WELCOME){
                                WelcomeScreen(onNaviagate = navController::navigate)
                       }
                       composable(Route.AGE){

                       }
                       composable(Route.GENDER){

                       }
                       composable(Route.HEIGHT){

                       }
                       composable(Route.WEIGHT){

                       }
                       composable(Route.NUTRIENT_GOAL){

                       }
                       composable(Route.ACTIVITY){

                       }
                       composable(Route.TRACKER_OVERVIEW){

                       }
                       composable(Route.SEARCH){

                       }


                   }
            }
        }
    }
}
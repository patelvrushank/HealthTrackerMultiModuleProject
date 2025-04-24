package com.vrushank.healthtracker.navigation

import androidx.navigation.NavController
import com.vrushank.core.util.UiEvent

fun NavController.navigate(event: UiEvent.Navigate){
    this.navigate(event.route)
}
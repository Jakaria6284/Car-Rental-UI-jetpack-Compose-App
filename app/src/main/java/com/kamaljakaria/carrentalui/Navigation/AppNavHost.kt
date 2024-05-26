package com.kamaljakaria.carrentalui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.kamaljakaria.carrentalui.Screen.HomeScreen
import com.kamaljakaria.carrentalui.Screen.ProfileScreen
import com.kamaljakaria.carrentalui.Screen.SearchScreen


@Composable
fun AppNavHost(navController: NavHostController) {
    NavHost(navController = navController, startDestination = NavigationItem.Home.route) {
        composable(NavigationItem.Home.route) { HomeScreen() }
        composable(NavigationItem.Search.route) { SearchScreen() }
        composable(NavigationItem.Profile.route) { ProfileScreen() }
    }
}

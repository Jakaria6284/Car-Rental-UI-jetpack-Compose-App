package com.kamaljakaria.carrentalui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.kamaljakaria.carrentalui.Screen.HomeScreen
import com.kamaljakaria.carrentalui.Screen.ProfileScreen
import com.kamaljakaria.carrentalui.Screen.SearchScreen
import com.kamaljakaria.carrentalui.Screen.detail


@Composable
fun AppNavHost(navController: NavHostController) {
    NavHost(navController = navController, startDestination = NavigationItem.Home.route) {
        composable(NavigationItem.Home.route) { HomeScreen(navController) }
        composable(NavigationItem.Search.route) { SearchScreen() }
        composable(NavigationItem.Profile.route) { ProfileScreen() }
        composable("detail/{id}", arguments = listOf(navArgument("id"){
            type= NavType.IntType
        }))


        {backStackEntry ->
            val id=backStackEntry.arguments?.getInt("id")

            if (id != null) {
               detail(id = id)
            }
        }
    }
}

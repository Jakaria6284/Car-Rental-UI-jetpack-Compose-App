// File path: app/src/main/java/com/kamaljakaria/carrentalui/navigation/NavigationItem.kt
package com.kamaljakaria.carrentalui.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.ui.graphics.vector.ImageVector

sealed class NavigationItem(val route: String, val icon: ImageVector, val title: String) {
    object Home : NavigationItem("home", Icons.Default.Home, "Home")
    object Search : NavigationItem("search", Icons.Default.Search, "Search")
    object Profile : NavigationItem("profile", Icons.Default.Person, "Profile")
}

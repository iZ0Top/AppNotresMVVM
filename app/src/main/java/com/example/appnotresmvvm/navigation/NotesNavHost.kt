package com.example.appnotresmvvm.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.appnotresmvvm.screens.Add
import com.example.appnotresmvvm.screens.Main
import com.example.appnotresmvvm.screens.Note
import com.example.appnotresmvvm.screens.Start

sealed class NavRoute(val route: String) {
    object Start: NavRoute("Start screen")
    object Main: NavRoute("Main screen")
    object Add: NavRoute("Add screen")
    object Note: NavRoute("Note screen")
}

@Composable
fun NotesNavHost() {

    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = NavRoute.Start.route ){
        composable(NavRoute.Start.route) { Start(navController = navController) }
        composable(NavRoute.Main.route) { Main(navController = navController) }
        composable(NavRoute.Add.route) { Add(navController = navController) }
        composable(NavRoute.Note.route) { Note(navController = navController) }
    }
}
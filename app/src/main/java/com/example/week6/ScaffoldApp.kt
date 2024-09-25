package com.example.week6

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun ScaffoldApp() {
    val navController = rememberNavController()

    NavHost(
        navController =navController,
        startDestination = "Home"
    ){
                composable(route="Home") {
                    MainScreen(navController)
                }
                composable(route="Info") {
                    InfoScreen(navController)
                }
                composable(route="Settings") {
                    SettingsScreen(navController)
                }
            }
        }
package com.example.week6

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScreenTopBar(title: String, navController: NavController) {
    TopAppBar(
        title = { Text(title) },
        navigationIcon = {
            IconButton(onClick = { navController.navigateUp() }) {
                Icon(Icons.Filled.ArrowBack, contentDescription = null, tint = Color.Red)
            }
        },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = Color.Black,
            titleContentColor = Color.Red,
            actionIconContentColor = Color.Red
        )

    )
}

@Composable
fun MainScreen(navController: NavController) {
    Scaffold(
        topBar = { MainTopBar("Home", navController) },
        content = { paddingValues ->
            Box(modifier = Modifier.padding(paddingValues)) {
                Text("Content for Home screen", fontSize = 20.sp)
            }
        }
    )
}

@Composable
fun InfoScreen(navController: NavController) {
    Scaffold(
        topBar = { ScreenTopBar("Info", navController) },
        content = { paddingValues ->
            Box(modifier = Modifier.padding(paddingValues)) {
                Text("Content for info screen", fontSize = 20.sp)
            }
        }
    )
}

@Composable
fun SettingsScreen(navController: NavController) {
    Scaffold(
        topBar = { ScreenTopBar("Settings", navController) },
        content = { paddingValues ->
            Box(modifier = Modifier.padding(paddingValues)) {
                Text("Content for settings screen", fontSize = 20.sp)
            }
        }
    )
}

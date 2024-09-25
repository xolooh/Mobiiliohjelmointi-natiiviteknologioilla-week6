package com.example.week6

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainTopBar(title: String, navController: NavController) {
    var expanded by remember { mutableStateOf(false) }

    TopAppBar(
        title = { Text(title) },
        actions = {
            IconButton(onClick = { expanded = !expanded }) {
                Icon(Icons.Filled.MoreVert, contentDescription = null)
            }


            DropdownMenu(
                expanded = expanded,
                onDismissRequest = { expanded = false }
            ) {
                DropdownMenuItem(
                    text = { Text("Settings") },
                    onClick = {
                        expanded = false
                        navController.navigate("Settings")
                    }
                )
                DropdownMenuItem(
                    text = { Text("Info") },
                    onClick = {
                        expanded = false
                        navController.navigate("Info")
                    }
                )
            }
        },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = Color.Black,
            titleContentColor = Color.Red,
            actionIconContentColor = Color.Red
        )
    )
}

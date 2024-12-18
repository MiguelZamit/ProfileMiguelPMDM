package com.miguelzamit.profilemiguel.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.miguelzamit.profilemiguel.ui.theme.ProfileMiguelTheme

@Composable
fun SocialAppContent(content: @Composable (modifier: Modifier) -> Unit){

    ProfileMiguelTheme {
        Scaffold (
            modifier = Modifier
                .background(Color.Blue) // Esto no funciona
                .fillMaxSize()

        ){ innerPadding ->
            content(Modifier
                .padding(innerPadding)
            )
        }
    }

}
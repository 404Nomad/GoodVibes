package com.cfa.goodvibes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.calculateEndPadding
import androidx.compose.foundation.layout.calculateStartPadding
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.tooling.preview.Preview
import com.cfa.goodvibes.composant.AffirmationCard
import com.cfa.goodvibes.composant.AffirmationList
import com.cfa.goodvibes.ui.theme.GoodVibesTheme
import com.cfa.goodvibes.composant.TextScreen
import com.cfa.goodvibes.data.Datasource
import com.cfa.goodvibes.model.Affirmation


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GoodVibesTheme {
                HomeApp()
            }
        }
    }
}

@Composable
fun HomeApp() {
    Scaffold(
        modifier = Modifier.fillMaxSize()
    ) { innerPadding ->
        AffirmationApp(Modifier.padding(innerPadding))
    }
}

// calculer layout a gauche et a droite pour avoir la maxPadding par rapport a l'écran cible
@Composable
fun AffirmationApp(
    modifier: Modifier = Modifier
){
    val layoutDirection = LocalLayoutDirection.current
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .statusBarsPadding()
            .padding(
                start = WindowInsets.safeDrawing
                    .asPaddingValues()
                    .calculateStartPadding(layoutDirection),
                end = WindowInsets.safeDrawing
                    .asPaddingValues()
                    .calculateEndPadding(layoutDirection)
            )
    ) {
        AffirmationList(
            affirmationList = Datasource().loadAffirmation())
    }
}

@Composable
fun AutreText() {
    Text("je suis le deuxieme composant texte")
}

@Preview
@Composable
fun TextScreenPreview() {
    GoodVibesTheme {
        TextScreen()
    }
}

@Preview
@Composable
fun CardPreview() {
    GoodVibesTheme {
        AffirmationList(
            affirmationList = Datasource().loadAffirmation()

        )
    }
}

@Preview
@Composable
fun AutreTextPreview() {
    GoodVibesTheme {
        AutreText()
    }
}


@Preview
@Composable
fun GlobalPreview() {
    GoodVibesTheme {
        HomeApp()
    }
}







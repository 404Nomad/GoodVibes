package com.cfa.goodvibes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.cfa.goodvibes.composant.AffirmationCard
import com.cfa.goodvibes.ui.theme.GoodVibesTheme
import com.cfa.goodvibes.composant.TextScreen
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
        Column(Modifier.padding(innerPadding)) {
            TextScreen()
            AutreText()
        }
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
        AffirmationCard(
            affirmation =
            Affirmation(R.string.affirmation1, R.drawable.image1)
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







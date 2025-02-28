package com.cfa.goodvibes.composant

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.cfa.goodvibes.model.Affirmation

@Composable
fun AffirmationCard(
    modifier: Modifier = Modifier,
    affirmation: Affirmation
) {
    Card(modifier = modifier) {
        Column {
            Image(painter = painterResource(affirmation.imageRessourceId),
                contentDescription = stringResource(affirmation.stringRessourceId),
                modifier = Modifier.fillMaxWidth().height(194.dp),
                contentScale = ContentScale.Crop,
            )
            Text(
                text = LocalContext.current.getString(affirmation.stringRessourceId),
                modifier = Modifier.padding(16.dp),
                style = MaterialTheme.typography.headlineSmall,
            )
        }
    }
}
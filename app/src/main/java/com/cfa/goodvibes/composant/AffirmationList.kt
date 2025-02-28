package com.cfa.goodvibes.composant

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.cfa.goodvibes.model.Affirmation

@Composable
fun AffirmationList(
    affirmationList: List<Affirmation>,
    modifier: Modifier = Modifier
) {
    //scroll sur liste
    LazyColumn(modifier = modifier) {
        // parcourir tableau
        items(affirmationList) { affirmation ->
            AffirmationCard(
                affirmation = affirmation,
                modifier = Modifier.padding(8.dp)
            )
        }
    }
}
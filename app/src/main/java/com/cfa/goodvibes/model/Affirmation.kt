package com.cfa.goodvibes.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Affirmation(
    @StringRes val stringRessourceId: Int,
    @DrawableRes val imageRessourceId: Int
)

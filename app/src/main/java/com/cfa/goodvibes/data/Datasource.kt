package com.cfa.goodvibes.data

import com.cfa.goodvibes.R
import com.cfa.goodvibes.model.Affirmation

class Datasource() {
    fun loadAffirmation(): List<Affirmation> {
        // construire liste avec mes affirmations
        return listOf<Affirmation>(
            Affirmation(R.string.affirmation1,)
        )
    }
}
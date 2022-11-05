package com.example.affirmations.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

// an object instance would represent one affirmation and contains the resource ID of the string

// Use annotation to prevent called could accidentially pass in the argument in the wrong order
data class Affirmation(@StringRes val stringResourceId: Int, @DrawableRes val imageResourceId: Int)
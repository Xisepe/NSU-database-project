package ru.ccfit.golubevm.nsudatabaseproject.api.request

import java.time.LocalDate

data class CreateTitleRequest(
    val name: String,
    val originalName: String?,
    val tagline: String?,
    val duration: Int?,
    val budget: Int?,
    val releaseDate: LocalDate?,
    val countryId: Int?,
    val mpaRating: String?,
    val ageConstraint: Int?
)

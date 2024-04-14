package ru.ccfit.golubevm.nsudatabaseproject.api.dto

import jakarta.validation.constraints.NotBlank
import java.time.LocalDate

data class PersonDto(
    val personId: Int?,
    @NotBlank
    val personName: String,
    val dateOfBirth: LocalDate,
    val dateOfDeath: LocalDate?,
    val citizenship: String?,
    val placeOfBirth: String?
)


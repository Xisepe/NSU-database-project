package ru.ccfit.golubevm.nsudatabaseproject.api.request

import jakarta.validation.constraints.NotBlank
import java.time.LocalDate

data class CreatePersonRequest(
    @NotBlank
    val personName: String,
    val dateOfBirth: LocalDate,
    val dateOfDeath: LocalDate?,
    val citizenship: String?,
    val placeOfBirth: String?
)
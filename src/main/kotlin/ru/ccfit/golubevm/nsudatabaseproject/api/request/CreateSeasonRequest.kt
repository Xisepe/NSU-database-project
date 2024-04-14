package ru.ccfit.golubevm.nsudatabaseproject.api.request

data class CreateSeasonRequest(
    val titleId: Int,
    val seasonNumber: Int,
    val description: String?
)


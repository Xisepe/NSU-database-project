package ru.ccfit.golubevm.nsudatabaseproject.api.request

data class CreateEpisodeRequest(
    val titleId: Int,
    val seasonNumber: Int,
    val episodeNumber: Int,
    val description: String?
)

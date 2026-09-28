package me.mauricioherrera.feedinstagram.model


data class Story(
    val id: Int,
    // TODO: agrega username y profileImageUrl
    val username: String,
    val profileImageUrl: String,
    // TODO: hasSeen es Boolean con valor por defecto false
    val hasSeen: Boolean = false
)
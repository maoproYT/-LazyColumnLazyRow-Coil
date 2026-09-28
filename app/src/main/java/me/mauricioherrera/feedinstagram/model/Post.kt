package me.mauricioherrera.feedinstagram.model

data class Post(
    val id: Int,
    val username: String,
    // TODO: agrega la propiedad profileImageUrl de tipo String
    val profileImageUrl: String,
    val imageUrl: String,
    val likes: Int,
    val caption: String,
    // TODO: isLiked debe ser Boolean y tener un valor por defecto de false
    val isLiked: Boolean = false
)

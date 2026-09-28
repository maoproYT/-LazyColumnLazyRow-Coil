package me.mauricioherrera.feedinstagram.data

import me.mauricioherrera.feedinstagram.model.Post
import me.mauricioherrera.feedinstagram.model.Story

object DataSource {

    fun getStories(): List<Story> = listOf(
        Story(1, "Tu historia", "", hasSeen = false),
        Story(2, "android_dev", "https://picsum.photos/seed/s2/200/200"),
        Story(3, "kotlin_fan", "https://picsum.photos/seed/s3/200/200"),
        Story(4, "google_io", "https://picsum.photos/seed/s4/200/200", hasSeen = true),
        Story(5, "compose_dev", "https://picsum.photos/seed/s5/200/200"),
        Story(6, "android_pro", "https://picsum.photos/seed/s6/200/200", hasSeen = true),
        Story(7, "kotlin_master", "https://picsum.photos/seed/s7/200/200"),
        Story(8, "developer_08", "https://picsum.photos/seed/s8/200/200"),
        Story(9, "coding_world", "https://picsum.photos/seed/s9/200/200"),
        Story(10, "mobile_dev", "https://picsum.photos/seed/s10/200/200", hasSeen = true)
    )

    fun getPosts(): List<Post> = listOf(
        Post(
            id = 1,
            username = "android_dev",
            profileImageUrl = "https://picsum.photos/seed/p1/100/100",
            imageUrl = "https://picsum.photos/seed/post1/600/600",
            likes = 1240,
            caption = "Aprendiendo Jetpack Compose paso a paso"
        ),
        Post(
            id = 2,
            username = "kotlin_fan",
            profileImageUrl = "https://picsum.photos/seed/p2/100/100",
            imageUrl = "https://picsum.photos/seed/post2/600/600",
            likes = 856,
            caption = "Kotlin hace todo más fácil",
            isLiked = true
        ),
        Post(
            id = 3,
            username = "google_io",
            profileImageUrl = "https://picsum.photos/seed/p3/100/100",
            imageUrl = "https://picsum.photos/seed/post3/600/600",
            likes = 3021,
            caption = "Novedades del evento de desarrolladores"
        ),
        Post(
            id = 4,
            username = "compose_dev",
            profileImageUrl = "https://picsum.photos/seed/p4/100/100",
            imageUrl = "https://picsum.photos/seed/post4/600/600",
            likes = 432,
            caption = "LazyColumn maneja listas enormes sin problema"
        ),
        Post(
            id = 5,
            username = "android_pro",
            profileImageUrl = "https://picsum.photos/seed/p5/100/100",
            imageUrl = "https://picsum.photos/seed/post5/600/600",
            likes = 977,
            caption = "Coil carga imágenes de forma eficiente",
            isLiked = true
        ),
        Post(
            id = 6,
            username = "kotlin_master",
            profileImageUrl = "https://picsum.photos/seed/p6/100/100",
            imageUrl = "https://picsum.photos/seed/post6/600/600",
            likes = 2150,
            caption = "Corrutinas explicadas de forma sencilla"
        ),
        Post(
            id = 7,
            username = "developer_08",
            profileImageUrl = "https://picsum.photos/seed/p7/100/100",
            imageUrl = "https://picsum.photos/seed/post7/600/600",
            likes = 610,
            caption = "Mi primer proyecto con Material 3"
        ),
        Post(
            id = 8,
            username = "coding_world",
            profileImageUrl = "https://picsum.photos/seed/p8/100/100",
            imageUrl = "https://picsum.photos/seed/post8/600/600",
            likes = 1789,
            caption = "Tips para organizar tu código en capas"
        ),
        Post(
            id = 9,
            username = "mobile_dev",
            profileImageUrl = "https://picsum.photos/seed/p9/100/100",
            imageUrl = "https://picsum.photos/seed/post9/600/600",
            likes = 345,
            caption = "Probando mi app en el emulador",
            isLiked = true
        ),
        Post(
            id = 10,
            username = "tecnologias_moviles",
            profileImageUrl = "https://picsum.photos/seed/p10/100/100",
            imageUrl = "https://picsum.photos/seed/post10/600/600",
            likes = 5023,
            caption = "Taller de LazyColumn, LazyRow y Coil terminado"
        )
    )
}
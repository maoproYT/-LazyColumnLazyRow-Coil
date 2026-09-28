package me.mauricioherrera.feedinstagram

import me.mauricioherrera.feedinstagram.ui.screens.FeedScreen
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import me.mauricioherrera.feedinstagram.model.Post
import me.mauricioherrera.feedinstagram.ui.theme.FeedInstagramTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val post = Post(1, "yo", "", "", 0, "Prueba")
        println(post)
        println(post.copy(isLiked = true))

        setContent {
            setContent {

                FeedInstagramTheme {
                    FeedScreen()
                }
            }
        }
    }
}





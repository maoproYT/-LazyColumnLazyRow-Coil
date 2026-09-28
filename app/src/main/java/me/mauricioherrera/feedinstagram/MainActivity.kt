package me.mauricioherrera.feedinstagram

import FeedScreen
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import me.mauricioherrera.feedinstagram.model.Post
import me.mauricioherrera.feedinstagram.ui.theme.FeedInstagramTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        // Ejercicio sección 01
        val post = Post(1, "yo", "", "", 0, "Prueba")
        println(post)
        println(post.copy(isLiked = true))

        setContent {
            setContent {


            }
        }





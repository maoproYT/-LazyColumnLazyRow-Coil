import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.outlined.Send
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import me.mauricioherrera.feedinstagram.data.DataSource
import me.mauricioherrera.feedinstagram.ui.components.PostCard
import me.mauricioherrera.feedinstagram.ui.components.StoriesRow

@Composable
fun FeedScreen() {
    // TODO 1: obtén los posts y stories del DataSource usando "remember"
    val posts = remember { DataSource.getPosts() }
    val stories = remember { DataSource.getStories() }

    Scaffold(
        // TODO 2: parámetro del Scaffold que recibe la barra superior -> topBar
        topBar = { InstagramTopBar() }
    ) { paddingValues ->

        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues),
            state = rememberLazyListState()
        ) {

            // ── Las stories van como un ítem único dentro del LazyColumn ──
            // TODO 3: usa "item" (no "items") con key = "stories_row"
            item(key = "stories_row") {
                StoriesRow(stories = stories)
                HorizontalDivider()
            }

            // ── Los posts se iteran con items ──
            items(
                items = posts,
                // TODO 4: completa el key para identificar cada post por su id
                key = { post -> post.id }
            ) { post ->
                PostCard(
                    post = post,
                    onLikeClick = { likedPost ->
                        // Aquí podrías registrar el like en un Log o mostrar un Toast
                    }
                )
            }
        }
    }
}

// ── TOP BAR estilo Instagram ──
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun InstagramTopBar() {
    TopAppBar(
        title = {
            Text(
                text = "Instagram",
                fontStyle = FontStyle.Italic,
                fontWeight = FontWeight.Bold,
                fontSize = 26.sp,
                fontFamily = FontFamily.Cursive
            )
        },
        actions = {
            IconButton(onClick = {}) {
                Icon(Icons.Outlined.FavoriteBorder, "Notificaciones")
            }
            IconButton(onClick = {}) {
                Icon(Icons.AutoMirrored.Outlined.Send, "Mensajes")
            }
        },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = Color.White
        )
    )
}
 
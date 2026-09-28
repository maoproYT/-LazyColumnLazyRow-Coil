package me.mauricioherrera.feedinstagram.ui.components
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*

import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.shape.CircleShape
import com.android.volley.toolbox.ImageRequest


import me.mauricioherrera.feedinstagram.model.Post


@Composable
fun PostCard(
    post: Post,
    onLikeClick: (Post) -> Unit = {},
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.fillMaxWidth()
    ) {

        // 1. HEADER
        PostHeader(post = post)

        // 2. IMAGEN PRINCIPAL
        AsyncImage(
            model = ImageRequest.Builder(LocalContext.current)
                .data(post.imageUrl)
                .crossfade(true)
                .build(),
            contentDescription = "Post de ${post.username}",
            modifier = Modifier
                .fillMaxWidth()
                .aspectRatio(1f),
            contentScale = ContentScale.Crop
        )

        // 3. ACCIONES
        PostActions(
            post = post,
            // TODO: pasa el lambda onLikeClick invocándolo con el post actual
            onLikeClick = { onLikeClick(post) }
        )

        // 4. FOOTER
        PostFooter(post = post)

        Divider(color = Color.LightGray.copy(alpha = 0.3f))
    }
}


// ---------- HEADER ----------
@Composable
private fun PostHeader(post: Post) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 12.dp, vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        AsyncImage(
            model = post.profileImageUrl,
            contentDescription = "Avatar de ${post.username}",
            modifier = Modifier
                .size(36.dp)
                .clip(CircleShape)
                .border(1.dp, Color.LightGray, CircleShape),
            contentScale = ContentScale.Crop
        )

        Spacer(Modifier.width(10.dp))

        Text(
            text = post.username,
            fontWeight = FontWeight.Bold,
            fontSize = 14.sp,
            modifier = Modifier.weight(1f)
        )

        Icon(
            imageVector = Icons.Default.MoreVert,
            contentDescription = "Más opciones",
            tint = Color.Black
        )
    }
}


// ---------- ACCIONES ----------
@Composable
private fun PostActions(
    post: Post,
    onLikeClick: () -> Unit
) {
    // TODO: declara una variable "liked" que recuerde el estado del like
    // Pista: usa "var" con "remember" y "mutableStateOf" inicializado con post.isLiked
    var liked by remember { mutableStateOf(post.isLiked) }

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 4.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {

        IconButton(
            onClick = {
                // TODO: al hacer clic, invierte el estado de "liked"
                liked = !liked
                onLikeClick()
            }
        ) {
            Icon(
                // TODO: si "liked" es true muestra Icons.Filled.Favorite,
                // si no Icons.Outlined.FavoriteBorder
                imageVector = if (liked)
                    Icons.Filled.Favorite
                else
                    Icons.Outlined.FavoriteBorder,

                contentDescription = "Like",

                // TODO: si "liked" es true el icono es Color.Red,
                // si no Color.Black
                tint = if (liked)
                    Color.Red
                else
                    Color.Black,

                modifier = Modifier.size(28.dp)
            )
        }

        IconButton(onClick = {}) {
            Icon(
                Icons.Outlined.ChatBubbleOutline,
                "Comentar"
            )
        }

        IconButton(onClick = {}) {
            Icon(
                Icons.Outlined.Send,
                "Enviar"
            )
        }

        Spacer(Modifier.weight(1f))

        IconButton(onClick = {}) {
            Icon(
                Icons.Outlined.BookmarkBorder,
                "Guardar"
            )
        }
    }
}


// ---------- FOOTER ----------
@Composable
private fun PostFooter(post: Post) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
            .padding(bottom = 10.dp)
    ) {

        // TODO: muestra el texto post.likes Me gusta en negrita, fontSize 14.sp
        Text(
            text = "${post.likes} Me gusta",
            fontWeight = FontWeight.Bold,
            fontSize = 14.sp
        )

        Spacer(Modifier.height(2.dp))

        Text(
            text = buildAnnotatedString {
                withStyle(
                    style = SpanStyle(fontWeight = FontWeight.Bold)
                ) {
                    append(post.username + " ")
                }
                append(post.caption)
            },
            fontSize = 14.sp,
            maxLines = 2,
            overflow = TextOverflow.Ellipsis
        )
    }
}
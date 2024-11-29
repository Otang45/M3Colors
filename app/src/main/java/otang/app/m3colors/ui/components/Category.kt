package otang.app.m3colors.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun Category(title: String, color: Color) {
    Row(
        Modifier.padding(
            top = 16.dp,
            bottom = 8.dp,
            start = 8.dp,
            end = 8.dp
        ),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            Modifier
                .padding(end = 10.dp)
                .clip(CircleShape)
                .background(color)
                .size(10.dp)
        )
        Text(title, style = MaterialTheme.typography.titleLarge)
    }
}

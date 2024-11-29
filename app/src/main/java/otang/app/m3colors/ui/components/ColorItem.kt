package otang.app.m3colors.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.unit.dp
import otang.app.m3colors.items.Colors

@OptIn(ExperimentalStdlibApi::class)
@Composable
fun ColorItem(
    index: Int,
    item: Colors,
    first: Boolean,
    last: Boolean,
    onClick: (item: Colors) -> Unit
) {
    Box(
        Modifier
            .fillMaxWidth()
            .height(75.dp)
            .clip(
                RoundedCornerShape(
                    topStart = if (first) 24.dp else 0.dp,
                    topEnd = if (first) 24.dp else 0.dp,
                    bottomStart = if (last) 24.dp else 0.dp,
                    bottomEnd = if (last) 24.dp else 0.dp
                )
            )
            .background(item.color)
            .clickable { onClick(item) }
            .padding(16.dp)
    ) {
        Text(
            "${index + 1}. ${item.name}",
            style = MaterialTheme.typography.titleMedium.copy(
                color = item.contentColor
            )
        )
        Text(
            item.color.toArgb().toHexString(
                HexFormat {
                    upperCase = true
                    number {
                        prefix = "#"
                    }
                }
            ),
            color = item.contentColor,
            modifier = Modifier.align(Alignment.BottomEnd)
        )
    }
}

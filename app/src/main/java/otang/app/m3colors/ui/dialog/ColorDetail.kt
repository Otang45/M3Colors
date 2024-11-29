package otang.app.m3colors.ui.dialog

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonColors
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalClipboardManager
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import otang.app.m3colors.R
import otang.app.m3colors.items.Colors

@OptIn(ExperimentalStdlibApi::class)
@Composable
fun ColorDetail(item: Colors) {
    val clipboardManager = LocalClipboardManager.current
    val color0 = item.color.toArgb().toHexString(
        HexFormat {
            upperCase = true
            number {
                prefix = "#"
            }
        }
    )
    val color1 = item.contentColor.toArgb().toHexString(
        HexFormat {
            upperCase = true
            number {
                prefix = "#"
            }
        }
    )
    Text(
        item.name,
        textAlign = TextAlign.Center,
        style = MaterialTheme.typography.titleLarge,
        modifier = Modifier.fillMaxWidth()
    )
    Box(
        Modifier
            .fillMaxWidth()
            .padding(top = 16.dp)
            .padding(horizontal = 16.dp)
            .clip(RoundedCornerShape(topStart = 24.dp, topEnd = 24.dp))
            .background(item.color)
            .height(120.dp)
            .padding(8.dp)
    ) {
        Column(
            Modifier
                .align(Alignment.TopStart)
                .padding(8.dp)
        ) {
            Text(
                "Android attribute:",
                color = item.contentColor,
                style = MaterialTheme.typography.labelSmall
            )
            Text(
                item.attr,
                color = item.contentColor,
                fontWeight = FontWeight.Medium,
                style = MaterialTheme.typography.bodyLarge
            )
        }
        Row(
            modifier = Modifier.align(Alignment.BottomEnd),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                color0,
                color = item.contentColor,
                fontWeight = FontWeight.Medium,
                style = MaterialTheme.typography.bodyLarge
            )
            IconButton(
                { clipboardManager.setText(AnnotatedString(color0)) },
                colors = IconButtonColors(
                    containerColor = Color.Unspecified,
                    contentColor = item.contentColor,
                    disabledContentColor = Color.Unspecified,
                    disabledContainerColor = Color.Unspecified
                )
            ) {
                Icon(
                    painterResource(R.drawable.outline_content_copy_24),
                    null,
                    Modifier.size(18.dp)
                )
            }
        }
    }
    Box(
        Modifier
            .fillMaxWidth()
            .padding(bottom = 16.dp)
            .padding(horizontal = 16.dp)
            .clip(RoundedCornerShape(bottomStart = 24.dp, bottomEnd = 24.dp))
            .background(item.contentColor)
            .wrapContentHeight()
            .padding(8.dp)
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Column(
                Modifier
                    .weight(1f)
                    .padding(8.dp)
            ) {
                Text(
                    "Content color:",
                    color = item.color,
                    style = MaterialTheme.typography.labelSmall
                )
                Text(
                    color1,
                    color = item.color,
                    fontWeight = FontWeight.Medium,
                    style = MaterialTheme.typography.bodyLarge
                )
            }
            IconButton(
                { clipboardManager.setText(AnnotatedString(color1)) },
                colors = IconButtonColors(
                    containerColor = Color.Unspecified,
                    contentColor = item.color,
                    disabledContentColor = Color.Unspecified,
                    disabledContainerColor = Color.Unspecified
                )
            ) {
                Icon(
                    painterResource(R.drawable.outline_content_copy_24),
                    null,
                    Modifier.size(18.dp)
                )
            }
        }
    }
    Column(
        Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
            .clip(RoundedCornerShape(topStart = 24.dp, topEnd = 24.dp))
            .background(MaterialTheme.colorScheme.surfaceContainerHighest)
            .wrapContentHeight()
            .padding(start = 16.dp, top = 16.dp, end = 16.dp, bottom = 4.dp)
    ) {
        Text(
            "Light baseline:",
            style = MaterialTheme.typography.labelSmall
        )
        Text(
            item.lightBaseline,
            fontWeight = FontWeight.Medium,
            style = MaterialTheme.typography.bodyLarge
        )
    }
    Spacer(Modifier.height(2.dp))
    Column(
        Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
            .background(MaterialTheme.colorScheme.surfaceContainerHighest)
            .wrapContentHeight()
            .padding(horizontal = 16.dp, vertical = 8.dp)
    ) {
        Text(
            "Light dynamic 31-33:",
            style = MaterialTheme.typography.labelSmall
        )
        Text(
            item.lightDynamic31,
            fontWeight = FontWeight.Medium,
            style = MaterialTheme.typography.bodyLarge
        )
    }
    Spacer(Modifier.height(2.dp))
    Column(
        Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
            .background(MaterialTheme.colorScheme.surfaceContainerHighest)
            .wrapContentHeight()
            .padding(horizontal = 16.dp, vertical = 8.dp)
    ) {
        Text(
            "Light dynamic 34+:",
            style = MaterialTheme.typography.labelSmall
        )
        Text(
            item.lightDynamic34,
            fontWeight = FontWeight.Medium,
            style = MaterialTheme.typography.bodyLarge
        )
    }
    Spacer(Modifier.height(2.dp))
    Column(
        Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
            .background(MaterialTheme.colorScheme.surfaceContainerHighest)
            .wrapContentHeight()
            .padding(horizontal = 16.dp, vertical = 8.dp)
    ) {
        Text(
            "Dark baseline:",
            style = MaterialTheme.typography.labelSmall
        )
        Text(
            item.darkBaseline,
            fontWeight = FontWeight.Medium,
            style = MaterialTheme.typography.bodyLarge
        )
    }
    Spacer(Modifier.height(2.dp))
    Column(
        Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
            .background(MaterialTheme.colorScheme.surfaceContainerHighest)
            .wrapContentHeight()
            .padding(horizontal = 16.dp, vertical = 8.dp)
    ) {
        Text(
            "Dark dynamic 31-33:",
            style = MaterialTheme.typography.labelSmall
        )
        Text(
            item.darkDynamic31,
            fontWeight = FontWeight.Medium,
            style = MaterialTheme.typography.bodyLarge
        )
    }
    Spacer(Modifier.height(2.dp))
    Column(
        Modifier
            .fillMaxWidth()
            .padding(bottom = 16.dp)
            .padding(horizontal = 16.dp)
            .clip(RoundedCornerShape(bottomStart = 24.dp, bottomEnd = 24.dp))
            .background(MaterialTheme.colorScheme.surfaceContainerHighest)
            .wrapContentHeight()
            .padding(start = 16.dp, top = 8.dp, end = 16.dp, bottom = 16.dp)
    ) {
        Text(
            "Dark dynamic 34+:",
            style = MaterialTheme.typography.labelSmall
        )
        Text(
            item.darkDynamic34,
            fontWeight = FontWeight.Medium,
            style = MaterialTheme.typography.bodyLarge
        )
    }
}

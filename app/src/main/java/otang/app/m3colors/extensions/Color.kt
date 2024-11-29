package otang.app.m3colors.extensions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb

@OptIn(ExperimentalStdlibApi::class)
fun Color.toHex(): String {
    return this.toArgb().toHexString(
        HexFormat {
            upperCase = true
            number {
                prefix = "#"
            }
        }
    )
}
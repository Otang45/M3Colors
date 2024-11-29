package otang.app.m3colors.viewmodel

import android.annotation.SuppressLint
import android.content.Context
import android.net.Uri
import android.text.format.DateFormat
import androidx.compose.material3.ColorScheme
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.documentfile.provider.DocumentFile
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import otang.app.m3colors.extensions.toHex
import otang.app.m3colors.items.CustomScheme
import otang.app.m3colors.items.customScheme
import otang.app.m3colors.models.ColorState
import otang.app.m3colors.models.M3Colors
import java.io.FileOutputStream
import java.io.IOException

class ColorViewModel : ViewModel() {
    var scheme: ColorState<CustomScheme> by mutableStateOf(ColorState.loading())
    private var colorScheme: ColorScheme? by mutableStateOf(null)

    fun loadCustomScheme(context: Context, color: Color) {
        scheme = ColorState.loading()
        viewModelScope.launch {
            val data = customScheme(context, color)
            scheme = ColorState.success(CustomScheme(data))
            colorScheme = data
        }
    }

    fun init(colorSchemes: ColorScheme) {
        scheme = ColorState.idle()
        colorScheme = colorSchemes
    }

    @SuppressLint("Recycle")
    fun export(context: Context, uri: Uri) {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                colorScheme?.let { scheme ->
                    val m3Colors = M3Colors(
                        date = DateFormat.format(
                            "EEE, dd-MM-yyyy HH:mm", System.currentTimeMillis()
                        ).toString(), data = M3Colors.Data(
                            coreColor = M3Colors.Data.CoreColor(
                                primary = scheme.primary.toHex(),
                                secondary = scheme.secondary.toHex(),
                                tertiary = scheme.tertiary.toHex()
                            ), primaryList = M3Colors.Data.PrimaryList(
                                primary = scheme.primary.toHex(),
                                onPrimary = scheme.onPrimary.toHex(),
                                primaryContainer = scheme.primaryContainer.toHex(),
                                onPrimaryContainer = scheme.onPrimaryContainer.toHex(),
                                inversePrimary = scheme.inversePrimary.toHex()
                            ), secondaryList = M3Colors.Data.SecondaryList(
                                secondary = scheme.secondary.toHex(),
                                onSecondary = scheme.onSecondary.toHex(),
                                secondaryContainer = scheme.secondaryContainer.toHex(),
                                onSecondaryContainer = scheme.onSecondaryContainer.toHex()
                            ), tertiaryList = M3Colors.Data.TertiaryList(
                                tertiary = scheme.tertiary.toHex(),
                                onTertiary = scheme.onTertiary.toHex(),
                                tertiaryContainer = scheme.tertiaryContainer.toHex(),
                                onTertiaryContainer = scheme.onTertiaryContainer.toHex()
                            ), surfaceList = M3Colors.Data.SurfaceList(
                                surface = scheme.surface.toHex(),
                                onSurface = scheme.onSurface.toHex(),
                                surfaceVariant = scheme.surfaceVariant.toHex(),
                                onSurfaceVariant = scheme.onSurfaceVariant.toHex(),
                                inverseSurface = scheme.inverseSurface.toHex(),
                                inverseOnSurface = scheme.inverseOnSurface.toHex(),
                                surfaceContainerLowest = scheme.surfaceContainerLowest.toHex(),
                                surfaceContainerLow = scheme.surfaceContainerLow.toHex(),
                                surfaceContainer = scheme.surfaceContainer.toHex(),
                                surfaceContainerHigh = scheme.surfaceContainerHigh.toHex(),
                                surfaceContainerHighest = scheme.surfaceContainerHighest.toHex(),
                                surfaceBright = scheme.surfaceBright.toHex(),
                                surfaceDim = scheme.surfaceDim.toHex(),
                                background = scheme.background.toHex(),
                                onBackground = scheme.onBackground.toHex()
                            ), otherList = M3Colors.Data.OtherList(
                                error = scheme.error.toHex(),
                                onError = scheme.onError.toHex(),
                                errorContainer = scheme.errorContainer.toHex(),
                                onErrorContainer = scheme.onErrorContainer.toHex(),
                                outline = scheme.outline.toHex(),
                                outlineVariant = scheme.outlineVariant.toHex()
                            )
                        )
                    )
                    print(m3Colors.toJson())
                    val dir = DocumentFile.fromTreeUri(context, uri)
                    val file =
                        dir?.createFile("text/*", "M3-Colors-${System.currentTimeMillis()}.json")
                    val json = file?.let { context.contentResolver.openFileDescriptor(it.uri, "w") }
                    json?.let {
                        try {
                            val fos = FileOutputStream(it.fileDescriptor)
                            fos.write(m3Colors.toJson().encodeToByteArray())
                            fos.close()
                        } catch (e: IOException) {
                            e.printStackTrace()
                        }
                    }
                }
            }
        }
    }
}

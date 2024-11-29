package otang.app.m3colors.items

import android.annotation.SuppressLint
import android.app.UiModeManager
import android.content.Context
import android.os.Build.VERSION
import android.os.Build.VERSION_CODES
import androidx.appcompat.app.AppCompatDelegate
import androidx.compose.material3.ColorScheme
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import com.google.android.material.color.utilities.Hct
import com.google.android.material.color.utilities.MaterialDynamicColors
import com.google.android.material.color.utilities.SchemeContent

class CustomScheme(
    private val scheme: ColorScheme
) {
    val primaryList
        get() = arrayOf(
            Colors(
                "Primary",
                "colorPrimary",
                "primary40",
                "system_accent1_600",
                "system_primary_light",
                "primary80",
                "system_accent1_200",
                "system_primary_dark",
                scheme.primary,
                scheme.onPrimary
            ),
            Colors(
                "On Primary",
                "colorOnPrimary",
                "white",
                "system_accent1_0",
                "system_on_primary_light",
                "primary20",
                "system_accent1_800",
                "system_on_primary_dark",
                scheme.onPrimary,
                scheme.primary
            ),
            Colors(
                "Primary Container",
                "colorPrimaryContainer",
                "primary90",
                "system_accent1_100",
                "system_primary_container_light",
                "primary30",
                "system_accent1_700",
                "system_primary_container_dark",
                scheme.primaryContainer,
                scheme.onPrimaryContainer
            ),
            Colors(
                "On Primary Container",
                "colorOnPrimaryContainer",
                "primary10",
                "system_accent1_900",
                "system_on_primary_container_light",
                "primary90",
                "system_accent1_100",
                "system_on_primary_container_dark",
                scheme.onPrimaryContainer,
                scheme.primaryContainer
            ),
            Colors(
                "Inverse Primary",
                "colorPrimaryInverse",
                "primary80",
                "system_accent1_200",
                "system_primary_dark",
                "primary40",
                "system_accent1_600",
                "system_primary_light",
                scheme.inversePrimary,
                scheme.primary
            )
        )
    val secondaryList
        get() = arrayOf(
            Colors(
                "Secondary",
                "colorSecondary",
                "secondary40",
                "system_accent2_600",
                "system_secondary_light",
                "secondary80",
                "system_accent2_200",
                "system_secondary_dark",
                scheme.secondary,
                scheme.onSecondary
            ),
            Colors(
                "On Secondary",
                "colorOnSecondary",
                "white",
                "system_accent2_0",
                "system_on_secondary_light",
                "secondary20",
                "system_accent2_800",
                "system_on_secondary_dark",
                scheme.onSecondary,
                scheme.secondary
            ),
            Colors(
                "Secondary Container",
                "colorSecondaryContainer",
                "secondary90",
                "system_accent2_100",
                "system_secondary_container_light",
                "secondary30",
                "system_accent2_700",
                "system_secondary_container_dark",
                scheme.secondaryContainer,
                scheme.onSecondaryContainer
            ),
            Colors(
                "On Secondary Container",
                "colorOnSecondaryContainer",
                "secondary10",
                "system_accent2_900",
                "system_on_secondary_container_light",
                "secondary90",
                "system_accent2_100",
                "system_on_secondary_container_dark",
                scheme.onSecondaryContainer,
                scheme.secondaryContainer
            )
        )
    val tertiaryList
        get() = arrayOf(
            Colors(
                "Tertiary",
                "colorTertiary",
                "tertiary40",
                "system_accent3_600",
                "system_tertiary_light",
                "tertiary80",
                "system_accent3_200",
                "system_tertiary_dark",
                scheme.tertiary,
                scheme.onTertiary
            ),
            Colors(
                "On Tertiary",
                "colorOnTertiary",
                "white",
                "system_accent3_0",
                "system_on_tertiary_light",
                "tertiary20",
                "system_accent3_800",
                "system_on_tertiary_dark",
                scheme.onTertiary,
                scheme.tertiary
            ),
            Colors(
                "Tertiary Container",
                "colorTertiaryContainer",
                "tertiary90",
                "system_accent3_100",
                "system_tertiary_container_light",
                "tertiary30",
                "system_accent3_700",
                "system_tertiary_container_dark",
                scheme.tertiaryContainer,
                scheme.onTertiaryContainer
            ),
            Colors(
                "On Tertiary Container",
                "colorOnTertiaryContainer",
                "tertiary10",
                "system_accent3_900",
                "system_on_tertiary_container_light",
                "tertiary90",
                "system_accent3_100",
                "system_on_tertiary_container_dark",
                scheme.onTertiaryContainer,
                scheme.tertiaryContainer
            )
        )
    val surfaceList
        get() = arrayOf(
            Colors(
                "Surface",
                "colorSurface",
                "neutral98",
                "m3_ref_palette_dynamic_neutral_variant98",
                "system_surface_light",
                "neutral6",
                "m3_ref_palette_dynamic_neutral_variant6",
                "system_surface_dark",
                scheme.surface,
                scheme.onSurface
            ),
            Colors(
                "On Surface",
                "colorOnSurface",
                "neutral10",
                "system_neutral1_900",
                "system_on_surface_light",
                "neutral90",
                "system_neutral1_100",
                "system_on_surface_dark",
                scheme.onSurface,
                scheme.surface
            ),
            Colors(
                "Surface Variant",
                "colorSurfaceVariant",
                "neutral_variant90",
                "system_neutral2_100",
                "system_surface_variant_light",
                "neutral_variant30",
                "system_neutral2_700",
                "system_surface_variant_dark",
                scheme.surfaceVariant,
                scheme.onSurfaceVariant
            ),
            Colors(
                "On Surface Variant",
                "colorOnSurfaceVariant",
                "neutral_variant30",
                "system_neutral2_700",
                "system_on_surface_variant_light",
                "neutral_variant80",
                "system_neutral2_200",
                "system_on_surface_variant_dark",
                scheme.onSurfaceVariant,
                scheme.surfaceVariant
            ),
            Colors(
                "Inverse Surface",
                "colorSurfaceInverse",
                "neutral20",
                "system_neutral1_800",
                "system_surface_dark",
                "neutral90",
                "system_neutral1_100",
                "system_surface_light",
                scheme.inverseSurface,
                scheme.inverseOnSurface
            ),
            Colors(
                "Inverse On Surface",
                "colorOnSurfaceInverse",
                "neutral95",
                "system_neutral1_50",
                "system_on_surface_dark",
                "neutral20",
                "system_neutral1_800",
                "system_on_surface_light",
                scheme.inverseOnSurface,
                scheme.inverseSurface
            ),
            Colors(
                "Surface Container Lowest",
                "colorSurfaceContainerLowest",
                "white",
                "system_neutral2_0",
                "system_surface_container_lowest_light",
                "neutral4",
                "m3_ref_palette_dynamic_neutral_variant4",
                "system_surface_container_lowest_dark",
                scheme.surfaceContainerLowest,
                scheme.onSurface
            ),
            Colors(
                "Surface Container Low",
                "colorSurfaceContainerLow",
                "neutral96",
                "m3_ref_palette_dynamic_neutral_variant96",
                "system_surface_container_low_light",
                "neutral10",
                "system_neutral2_900",
                "system_surface_container_low_dark",
                scheme.surfaceContainerLow,
                scheme.onSurface
            ),
            Colors(
                "Surface Container",
                "colorSurfaceContainer",
                "neutral94",
                "m3_ref_palette_dynamic_neutral_variant94",
                "system_surface_container_light",
                "neutral12",
                "m3_ref_palette_dynamic_neutral_variant12",
                "system_surface_container_dark",
                scheme.surfaceContainer,
                scheme.onSurfaceVariant
            ),
            Colors(
                "Surface Container High",
                "colorSurfaceContainerHigh",
                "neutral92",
                "m3_ref_palette_dynamic_neutral_variant92",
                "system_surface_container_high_light",
                "neutral17",
                "m3_ref_palette_dynamic_neutral_variant17",
                "system_surface_container_high_dark",
                scheme.surfaceContainerHigh,
                scheme.onSurfaceVariant
            ),
            Colors(
                "Surface Container Highest",
                "colorSurfaceContainerHighest",
                "neutral90",
                "system_neutral2_100",
                "system_surface_container_highest_light",
                "neutral22",
                "m3_ref_palette_dynamic_neutral_variant22",
                "system_surface_container_highest_dark",
                scheme.surfaceContainerHighest,
                scheme.onSurfaceVariant
            ),
            Colors(
                "Surface Bright",
                "colorSurfaceBright",
                "neutral98",
                "m3_ref_palette_dynamic_neutral_variant98",
                "system_surface_bright_light",
                "neutral24",
                "m3_ref_palette_dynamic_neutral_variant24",
                "system_surface_bright_dark",
                scheme.surfaceBright,
                scheme.onSurface
            ),
            Colors(
                "Surface Dim",
                "colorSurfaceDim",
                "neutral87",
                "m3_ref_palette_dynamic_neutral_variant87",
                "system_surface_dim_light",
                "neutral6",
                "m3_ref_palette_dynamic_neutral_variant6",
                "system_surface_dim_dark",
                scheme.surfaceDim,
                scheme.onSurface
            ),
            Colors(
                "Background",
                "android:colorBackground",
                "neutral98",
                "m3_ref_palette_dynamic_neutral_variant98",
                "system_background_light",
                "neutral6",
                "m3_ref_palette_dynamic_neutral_variant6",
                "system_background_dark",
                scheme.background,
                scheme.onBackground
            ),
            Colors(
                "On Background",
                "colorOnBackground",
                "neutral10",
                "system_neutral1_900",
                "system_on_background_light",
                "neutral90",
                "system_neutral1_100",
                "system_on_background_dark",
                scheme.onBackground,
                scheme.background
            )
        )
    val otherList
        get() = arrayOf(
            Colors(
                "Error",
                "colorError",
                "error40",
                "error40",
                "system_error_light",
                "error80",
                "error80",
                "system_error_dark",
                scheme.error,
                scheme.onError
            ),
            Colors(
                "On Error",
                "colorOnError",
                "white",
                "white",
                "system_on_error_light",
                "error20",
                "error20",
                "system_on_error_dark",
                scheme.onError,
                scheme.error
            ),
            Colors(
                "Error Container",
                "colorErrorContainer",
                "error90",
                "error90",
                "system_error_container_light",
                "error30",
                "error30",
                "system_error_container_dark",
                scheme.errorContainer,
                scheme.onErrorContainer
            ),
            Colors(
                "On Error Container",
                "colorOnErrorContainer",
                "error10",
                "error10",
                "system_on_error_container_light",
                "error90",
                "error90",
                "system_on_error_container_dark",
                scheme.onErrorContainer,
                scheme.errorContainer
            ),
            Colors(
                "Outline",
                "colorOutline",
                "neutral_variant50",
                "system_neutral2_500",
                "system_outline_light",
                "neutral_variant60",
                "system_neutral2_400",
                "system_outline_dark",
                scheme.outline,
                scheme.outlineVariant
            ),
            Colors(
                "Outline Variant",
                "colorOutlineVariant",
                "neutral_variant80",
                "system_neutral2_200",
                "system_outline_variant_light",
                "neutral_variant30",
                "system_neutral2_700",
                "system_outline_variant_dark",
                scheme.outlineVariant,
                scheme.outline
            )
        )
}

@SuppressLint("RestrictedApi")
fun customScheme(context: Context, color: Color): ColorScheme {
    val scheme = SchemeContent(
        Hct.fromInt(color.toArgb()),
        AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_YES,
        getSystemContrast(context).toDouble()
    )
    val dynamic = MaterialDynamicColors()
    return ColorScheme(
        primary = Color(dynamic.primary().getArgb(scheme)),
        onPrimary = Color(dynamic.onPrimary().getArgb(scheme)),
        primaryContainer = Color(dynamic.primaryContainer().getArgb(scheme)),
        onPrimaryContainer = Color(dynamic.onPrimaryContainer().getArgb(scheme)),
        inversePrimary = Color(dynamic.inversePrimary().getArgb(scheme)),
        secondary = Color(dynamic.secondary().getArgb(scheme)),
        onSecondary = Color(dynamic.onSecondary().getArgb(scheme)),
        secondaryContainer = Color(dynamic.secondaryContainer().getArgb(scheme)),
        onSecondaryContainer = Color(dynamic.onSecondaryContainer().getArgb(scheme)),
        tertiary = Color(dynamic.tertiary().getArgb(scheme)),
        onTertiary = Color(dynamic.onTertiary().getArgb(scheme)),
        tertiaryContainer = Color(dynamic.tertiaryContainer().getArgb(scheme)),
        onTertiaryContainer = Color(dynamic.onTertiaryContainer().getArgb(scheme)),
        surface = Color(dynamic.surface().getArgb(scheme)),
        onSurface = Color(dynamic.onSurface().getArgb(scheme)),
        surfaceVariant = Color(dynamic.surfaceVariant().getArgb(scheme)),
        onSurfaceVariant = Color(dynamic.onSurfaceVariant().getArgb(scheme)),
        inverseSurface = Color(dynamic.inverseSurface().getArgb(scheme)),
        inverseOnSurface = Color(dynamic.inverseOnSurface().getArgb(scheme)),
        surfaceContainerLowest = Color(dynamic.surfaceContainerLowest().getArgb(scheme)),
        surfaceContainerLow = Color(dynamic.surfaceContainerLow().getArgb(scheme)),
        surfaceContainer = Color(dynamic.surfaceContainer().getArgb(scheme)),
        surfaceContainerHigh = Color(dynamic.surfaceContainerHigh().getArgb(scheme)),
        surfaceContainerHighest = Color(dynamic.surfaceContainerHighest().getArgb(scheme)),
        surfaceBright = Color(dynamic.surfaceBright().getArgb(scheme)),
        surfaceDim = Color(dynamic.surfaceDim().getArgb(scheme)),
        background = Color(dynamic.background().getArgb(scheme)),
        onBackground = Color(dynamic.onBackground().getArgb(scheme)),
        error = Color(dynamic.error().getArgb(scheme)),
        onError = Color(dynamic.onError().getArgb(scheme)),
        errorContainer = Color(dynamic.errorContainer().getArgb(scheme)),
        onErrorContainer = Color(dynamic.onErrorContainer().getArgb(scheme)),
        outline = Color(dynamic.outline().getArgb(scheme)),
        outlineVariant = Color(dynamic.outlineVariant().getArgb(scheme)),
        surfaceTint = Color(dynamic.surfaceTint().getArgb(scheme)),
        scrim = Color(dynamic.scrim().getArgb(scheme))
    )
}

private fun getSystemContrast(context: Context): Float {
    val uiModeManager = context.getSystemService(Context.UI_MODE_SERVICE) as UiModeManager?
    return if ((uiModeManager == null || VERSION.SDK_INT < VERSION_CODES.UPSIDE_DOWN_CAKE))
        0f
    else
        uiModeManager.contrast
}
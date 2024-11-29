package otang.app.m3colors.items

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.ui.graphics.Color

data class Colors(
    val name: String,
    val attr: String,
    val lightBaseline: String,
    val lightDynamic31: String,
    val lightDynamic34: String,
    val darkBaseline: String,
    val darkDynamic31: String,
    val darkDynamic34: String,
    val color: Color,
    val contentColor: Color
)

inline val primary
    @Composable
    @ReadOnlyComposable
    get() = Colors(
        "Primary",
        "colorPrimary",
        "primary40",
        "system_accent1_600",
        "system_primary_light",
        "primary80",
        "system_accent1_200",
        "system_primary_dark",
        MaterialTheme.colorScheme.primary,
        MaterialTheme.colorScheme.onPrimary
    )

inline val primaryList
    @Composable
    @ReadOnlyComposable
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
            MaterialTheme.colorScheme.primary,
            MaterialTheme.colorScheme.onPrimary
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
            MaterialTheme.colorScheme.onPrimary,
            MaterialTheme.colorScheme.primary
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
            MaterialTheme.colorScheme.primaryContainer,
            MaterialTheme.colorScheme.onPrimaryContainer
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
            MaterialTheme.colorScheme.onPrimaryContainer,
            MaterialTheme.colorScheme.primaryContainer
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
            MaterialTheme.colorScheme.inversePrimary,
            MaterialTheme.colorScheme.primary
        )
    )

inline val secondaryList
    @Composable
    @ReadOnlyComposable
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
            MaterialTheme.colorScheme.secondary,
            MaterialTheme.colorScheme.onSecondary
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
            MaterialTheme.colorScheme.onSecondary,
            MaterialTheme.colorScheme.secondary
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
            MaterialTheme.colorScheme.secondaryContainer,
            MaterialTheme.colorScheme.onSecondaryContainer
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
            MaterialTheme.colorScheme.onSecondaryContainer,
            MaterialTheme.colorScheme.secondaryContainer
        )
    )

inline val tertiaryList
    @Composable
    @ReadOnlyComposable
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
            MaterialTheme.colorScheme.tertiary,
            MaterialTheme.colorScheme.onTertiary
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
            MaterialTheme.colorScheme.onTertiary,
            MaterialTheme.colorScheme.tertiary
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
            MaterialTheme.colorScheme.tertiaryContainer,
            MaterialTheme.colorScheme.onTertiaryContainer
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
            MaterialTheme.colorScheme.onTertiaryContainer,
            MaterialTheme.colorScheme.tertiaryContainer
        )
    )

inline val surfaceList
    @Composable
    @ReadOnlyComposable
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
            MaterialTheme.colorScheme.surface,
            MaterialTheme.colorScheme.onSurface
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
            MaterialTheme.colorScheme.onSurface,
            MaterialTheme.colorScheme.surface
        ), Colors(
            "Surface Variant",
            "colorSurfaceVariant",
            "neutral_variant90",
            "system_neutral2_100",
            "system_surface_variant_light",
            "neutral_variant30",
            "system_neutral2_700",
            "system_surface_variant_dark",
            MaterialTheme.colorScheme.surfaceVariant,
            MaterialTheme.colorScheme.onSurfaceVariant
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
            MaterialTheme.colorScheme.onSurfaceVariant,
            MaterialTheme.colorScheme.surfaceVariant
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
            MaterialTheme.colorScheme.inverseSurface,
            MaterialTheme.colorScheme.inverseOnSurface
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
            MaterialTheme.colorScheme.inverseOnSurface,
            MaterialTheme.colorScheme.inverseSurface
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
            MaterialTheme.colorScheme.surfaceContainerLowest,
            MaterialTheme.colorScheme.onSurface
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
            MaterialTheme.colorScheme.surfaceContainerLow,
            MaterialTheme.colorScheme.onSurface
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
            MaterialTheme.colorScheme.surfaceContainer,
            MaterialTheme.colorScheme.onSurfaceVariant
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
            MaterialTheme.colorScheme.surfaceContainerHigh,
            MaterialTheme.colorScheme.onSurfaceVariant
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
            MaterialTheme.colorScheme.surfaceContainerHighest,
            MaterialTheme.colorScheme.onSurfaceVariant
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
            MaterialTheme.colorScheme.surfaceBright,
            MaterialTheme.colorScheme.onSurface
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
            MaterialTheme.colorScheme.surfaceDim,
            MaterialTheme.colorScheme.onSurface
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
            MaterialTheme.colorScheme.background,
            MaterialTheme.colorScheme.onBackground
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
            MaterialTheme.colorScheme.onBackground,
            MaterialTheme.colorScheme.background
        )
    )

inline val otherList
    @Composable
    @ReadOnlyComposable
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
            MaterialTheme.colorScheme.error,
            MaterialTheme.colorScheme.onError
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
            MaterialTheme.colorScheme.onError,
            MaterialTheme.colorScheme.error
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
            MaterialTheme.colorScheme.errorContainer,
            MaterialTheme.colorScheme.onErrorContainer
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
            MaterialTheme.colorScheme.onErrorContainer,
            MaterialTheme.colorScheme.errorContainer
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
            MaterialTheme.colorScheme.outline,
            MaterialTheme.colorScheme.outlineVariant
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
            MaterialTheme.colorScheme.outlineVariant,
            MaterialTheme.colorScheme.outline
        )
    )

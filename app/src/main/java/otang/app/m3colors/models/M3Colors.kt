package otang.app.m3colors.models

data class M3Colors(
    val name: String = "M3 Colors",
    val date: String,
    val author: String = "Otang45",
    val data: Data
) {
    data class Data(
        val coreColor: CoreColor,
        val primaryList: PrimaryList,
        val secondaryList: SecondaryList,
        val tertiaryList: TertiaryList,
        val surfaceList: SurfaceList,
        val otherList: OtherList
    ) {
        data class CoreColor(
            val primary: String,
            val secondary: String,
            val tertiary: String
        )

        data class PrimaryList(
            val primary: String,
            val onPrimary: String,
            val primaryContainer: String,
            val onPrimaryContainer: String,
            val inversePrimary: String,
        )

        data class SecondaryList(
            val secondary: String,
            val onSecondary: String,
            val secondaryContainer: String,
            val onSecondaryContainer: String,
        )

        data class TertiaryList(
            val tertiary: String,
            val onTertiary: String,
            val tertiaryContainer: String,
            val onTertiaryContainer: String,
        )

        data class SurfaceList(
            val surface: String,
            val onSurface: String,
            val surfaceVariant: String,
            val onSurfaceVariant: String,
            val inverseSurface: String,
            val inverseOnSurface: String,
            val surfaceContainerLowest: String,
            val surfaceContainerLow: String,
            val surfaceContainer: String,
            val surfaceContainerHigh: String,
            val surfaceContainerHighest: String,
            val surfaceBright: String,
            val surfaceDim: String,
            val background: String,
            val onBackground: String,
        )

        data class OtherList(
            val error: String,
            val onError: String,
            val errorContainer: String,
            val onErrorContainer: String,
            val outline: String,
            val outlineVariant: String,
        )
    }

    fun toJson(): String {
        return "{\n" +
                "  \"name\": \"$name\",\n" +
                "  \"date\": \"$date\",\n" +
                "  \"author\": \"$author\",\n" +
                "  \"data\": {\n" +
                "    \"coreColor\": {\n" +
                "      \"primary\": \"${data.coreColor.primary}\",\n" +
                "      \"secondary\": \"${data.coreColor.secondary}\",\n" +
                "      \"tertiary\": \"${data.coreColor.tertiary}\"\n" +
                "    },\n" +
                "    \"primaryList\": {\n" +
                "      \"primary\": \"${data.primaryList.primary}\",\n" +
                "      \"onPrimary\": \"${data.primaryList.onPrimary}\",\n" +
                "      \"primaryContainer\": \"${data.primaryList.primaryContainer}\",\n" +
                "      \"onPrimaryContainer\": \"${data.primaryList.onPrimaryContainer}\",\n" +
                "      \"inversePrimary\": \"${data.primaryList.inversePrimary}\"\n" +
                "    },\n" +
                "    \"secondaryList\": {\n" +
                "      \"secondary\": \"${data.secondaryList.secondary}\",\n" +
                "      \"onSecondary\": \"${data.secondaryList.onSecondary}\",\n" +
                "      \"secondaryContainer\": \"${data.secondaryList.secondaryContainer}\",\n" +
                "      \"onSecondaryContainer\": \"${data.secondaryList.onSecondaryContainer}\"\n" +
                "    },\n" +
                "    \"tertiaryList\": {\n" +
                "      \"tertiary\": \"${data.tertiaryList.tertiary}\",\n" +
                "      \"onTertiary\": \"${data.tertiaryList.onTertiary}\",\n" +
                "      \"tertiaryContainer\": \"${data.tertiaryList.tertiaryContainer}\",\n" +
                "      \"onTertiaryContainer\": \"${data.tertiaryList.onTertiaryContainer}\"\n" +
                "    },\n" +
                "    \"surfaceList\": {\n" +
                "      \"surface\": \"${data.surfaceList.surface}\",\n" +
                "      \"onSurface\": \"${data.surfaceList.onSurface}\",\n" +
                "      \"surfaceVariant\": \"${data.surfaceList.surfaceVariant}\",\n" +
                "      \"onSurfaceVariant\": \"${data.surfaceList.onSurfaceVariant}\",\n" +
                "      \"inverseSurface\": \"${data.surfaceList.inverseSurface}\",\n" +
                "      \"inverseOnSurface\": \"${data.surfaceList.inverseOnSurface}\",\n" +
                "      \"surfaceContainerLowest\": \"${data.surfaceList.surfaceContainerLowest}\",\n" +
                "      \"surfaceContainerLow\": \"${data.surfaceList.surfaceContainerLow}\",\n" +
                "      \"surfaceContainer\": \"${data.surfaceList.surfaceContainer}\",\n" +
                "      \"surfaceContainerHigh\": \"${data.surfaceList.surfaceContainerHigh}\",\n" +
                "      \"surfaceContainerHighest\": \"${data.surfaceList.surfaceContainerHighest}\",\n" +
                "      \"surfaceBright\": \"${data.surfaceList.surfaceBright}\",\n" +
                "      \"surfaceDim\": \"${data.surfaceList.surfaceDim}\",\n" +
                "      \"background\": \"${data.surfaceList.background}\",\n" +
                "      \"onBackground\": \"${data.surfaceList.onBackground}\"\n" +
                "    },\n" +
                "    \"otherList\": {\n" +
                "      \"error\": \"${data.otherList.error}\",\n" +
                "      \"onError\": \"${data.otherList.onError}\",\n" +
                "      \"errorContainer\": \"${data.otherList.errorContainer}\",\n" +
                "      \"onErrorContainer\": \"${data.otherList.onErrorContainer}\",\n" +
                "      \"outline\": \"${data.otherList.outline}\",\n" +
                "      \"outlineVariant\": \"${data.otherList.outlineVariant}\"\n" +
                "    }\n" +
                "  }\n" +
                "}"
    }
}

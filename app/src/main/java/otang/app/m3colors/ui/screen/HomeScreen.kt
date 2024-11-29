package otang.app.m3colors.ui.screen

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import otang.app.m3colors.R
import otang.app.m3colors.items.otherList
import otang.app.m3colors.items.primary
import otang.app.m3colors.items.primaryList
import otang.app.m3colors.items.secondaryList
import otang.app.m3colors.items.surfaceList
import otang.app.m3colors.items.tertiaryList
import otang.app.m3colors.navigation.Screen
import otang.app.m3colors.ui.components.Category
import otang.app.m3colors.ui.components.ColorItem
import otang.app.m3colors.ui.dialog.ColorDetail

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavController) {
    val listState = rememberLazyListState()
    val offset by remember { derivedStateOf { listState.firstVisibleItemScrollOffset } }

    val sheetState = rememberModalBottomSheetState(
        skipPartiallyExpanded = true
    )
    var showBottomSheet by remember { mutableStateOf(false) }

    val base = primary
    var colorItem by remember { mutableStateOf(base) }

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {
            Surface(
                shadowElevation = if (offset > 0) 4.dp else 0.dp
            ) {
                TopAppBar(
                    title = {
                        Text("M3 Colors")
                    },
                    modifier = Modifier.padding(horizontal = 8.dp),
                    actions = {
                        IconButton({ navController.navigate(Screen.Custom.name) }) {
                            Icon(
                                painterResource(R.drawable.outline_color_lens_24),
                                null
                            )
                        }
                    }
                )
            }
        }
    ) { innerPadding ->
        val primary = primaryList
        val secondary = secondaryList
        val tertiary = tertiaryList
        val surface = surfaceList
        val other = otherList
        LazyColumn(
            Modifier
                .fillMaxWidth()
                .padding(innerPadding),
            state = listState,
            contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp)
        ) {
            item {
                Category("Primary", MaterialTheme.colorScheme.primary)
            }
            itemsIndexed(primary) { index, item ->
                ColorItem(index, item, index == 0, index == primary.lastIndex) {
                    colorItem = it
                    showBottomSheet = true
                }
            }
            item {
                Category("Secondary", MaterialTheme.colorScheme.secondary)
            }
            itemsIndexed(secondary) { index, item ->
                ColorItem(index, item, index == 0, index == secondary.lastIndex) {
                    colorItem = it
                    showBottomSheet = true
                }
            }
            item {
                Category("Tertiary", MaterialTheme.colorScheme.tertiary)
            }
            itemsIndexed(tertiary) { index, item ->
                ColorItem(index, item, index == 0, index == tertiary.lastIndex) {
                    colorItem = it
                    showBottomSheet = true
                }
            }
            item {
                Category("Surface", MaterialTheme.colorScheme.onSurface)
            }
            itemsIndexed(surface) { index, item ->
                ColorItem(index, item, index == 0, index == surface.lastIndex) {
                    colorItem = it
                    showBottomSheet = true
                }
            }
            item {
                Category("Other", MaterialTheme.colorScheme.error)
            }
            itemsIndexed(other) { index, item ->
                ColorItem(index, item, index == 0, index == other.lastIndex) {
                    colorItem = it
                    showBottomSheet = true
                }
            }
        }

        if (showBottomSheet) {
            ModalBottomSheet(
                { showBottomSheet = false },
                sheetState = sheetState,
                modifier = Modifier
                    .padding(16.dp)
                    .systemBarsPadding(),
                shape = MaterialTheme.shapes.extraLarge,
                scrimColor = Color.Black.copy(alpha = 0.85f)
            ) {
                ColorDetail(colorItem)
            }
        }
    }
}

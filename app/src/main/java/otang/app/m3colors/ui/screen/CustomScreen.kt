package otang.app.m3colors.ui.screen

import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
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
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.github.skydoves.colorpicker.compose.BrightnessSlider
import com.github.skydoves.colorpicker.compose.HsvColorPicker
import com.github.skydoves.colorpicker.compose.rememberColorPickerController
import otang.app.m3colors.R
import otang.app.m3colors.items.otherList
import otang.app.m3colors.items.primary
import otang.app.m3colors.items.primaryList
import otang.app.m3colors.items.secondaryList
import otang.app.m3colors.items.surfaceList
import otang.app.m3colors.items.tertiaryList
import otang.app.m3colors.models.Status
import otang.app.m3colors.ui.components.Category
import otang.app.m3colors.ui.components.ColorItem
import otang.app.m3colors.ui.dialog.ColorDetail
import otang.app.m3colors.utils.createNewDocumentIntent
import otang.app.m3colors.viewmodel.ColorViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomScreen(navController: NavController, colorViewModel: ColorViewModel = viewModel()) {
    val context = LocalContext.current
    val listState = rememberLazyListState()
    val offset by remember { derivedStateOf { listState.firstVisibleItemScrollOffset } }

    val sheetState = rememberModalBottomSheetState(
        skipPartiallyExpanded = true
    )
    var showBottomSheet by remember { mutableStateOf(false) }

    val base = primary
    var colorItem by remember { mutableStateOf(base) }

    val primaryColor = MaterialTheme.colorScheme.primary
    val defScheme = MaterialTheme.colorScheme

    var showDialog by remember { mutableStateOf(false) }
    val colorController = rememberColorPickerController()
    var selectedColor by remember { mutableStateOf(primaryColor) }
    var selectedColorHex by remember { mutableStateOf("#") }

    LaunchedEffect(Unit) {
        colorViewModel.init(defScheme)
    }

    val launcher = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.StartActivityForResult()
    ) { result ->
        val data = result.data
        val uri = data?.data
        uri?.let { colorViewModel.export(context, it) }
    }

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {
            Surface(
                shadowElevation = if (offset > 0) 4.dp else 0.dp
            ) {
                TopAppBar(
                    title = {
                        Text("Custom Color")
                    },
                    modifier = Modifier.padding(horizontal = 8.dp),
                    navigationIcon = {
                        IconButton({ navController.navigateUp() }) {
                            Icon(painterResource(R.drawable.outline_arrow_back_24), null)
                        }
                    },
                    actions = {
                        IconButton({
                            val intent = createNewDocumentIntent()
                            launcher.launch(intent)
                        }) {
                            Icon(
                                painterResource(R.drawable.outline_file_export_24),
                                null
                            )
                        }
                        IconButton({ showDialog = true }) {
                            Icon(
                                painterResource(R.drawable.outline_colorize_24),
                                null
                            )
                        }
                    }
                )
            }
        }
    ) { innerPadding ->
        when (colorViewModel.scheme.status) {
            Status.LOADING -> Column(
                Modifier
                    .fillMaxSize()
                    .padding(innerPadding),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                CircularProgressIndicator()
            }

            Status.SUCCESS, Status.IDLE -> {
                val primary = colorViewModel.scheme.data?.primaryList ?: primaryList
                val secondary = colorViewModel.scheme.data?.secondaryList ?: secondaryList
                val tertiary = colorViewModel.scheme.data?.tertiaryList ?: tertiaryList
                val surface = colorViewModel.scheme.data?.surfaceList ?: surfaceList
                val other = colorViewModel.scheme.data?.otherList ?: otherList
                LazyColumn(
                    Modifier
                        .fillMaxWidth()
                        .padding(innerPadding),
                    state = listState,
                    contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp)
                ) {
                    item {
                        Category("Primary", primary[0].color)
                    }
                    itemsIndexed(primary) { index, item ->
                        ColorItem(index, item, index == 0, index == primary.lastIndex) {
                            colorItem = it
                            showBottomSheet = true
                        }
                    }
                    item {
                        Category("Secondary", secondary[0].color)
                    }
                    itemsIndexed(secondary) { index, item ->
                        ColorItem(index, item, index == 0, index == secondary.lastIndex) {
                            colorItem = it
                            showBottomSheet = true
                        }
                    }
                    item {
                        Category("Tertiary", tertiary[0].color)
                    }
                    itemsIndexed(tertiary) { index, item ->
                        ColorItem(index, item, index == 0, index == tertiary.lastIndex) {
                            colorItem = it
                            showBottomSheet = true
                        }
                    }
                    item {
                        Category("Surface", surface[1].color)
                    }
                    itemsIndexed(surface) { index, item ->
                        ColorItem(index, item, index == 0, index == surface.lastIndex) {
                            colorItem = it
                            showBottomSheet = true
                        }
                    }
                    item {
                        Category("Other", other[0].color)
                    }
                    itemsIndexed(other) { index, item ->
                        ColorItem(index, item, index == 0, index == other.lastIndex) {
                            colorItem = it
                            showBottomSheet = true
                        }
                    }
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

        if (showDialog) {
            ModalBottomSheet(
                { showDialog = false },
                sheetState = rememberModalBottomSheetState(true),
                modifier = Modifier
                    .padding(16.dp)
                    .systemBarsPadding(),
                shape = MaterialTheme.shapes.extraLarge,
                scrimColor = Color.Black.copy(alpha = 0.85f)
            ) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    HsvColorPicker(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(320.dp)
                            .padding(10.dp),
                        controller = colorController,
                        initialColor = selectedColor,
                        onColorChanged = {
                            selectedColor = it.color
                            selectedColorHex = it.hexCode
                        }
                    )
                    BrightnessSlider(
                        controller = colorController,
                        modifier = Modifier
                            .padding(horizontal = 26.dp)
                            .padding(top = 8.dp)
                            .fillMaxWidth()
                            .height(26.dp),
                        borderSize = 0.dp,
                        borderRadius = 50.dp
                    )
                    Box(
                        Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 26.dp)
                            .padding(top = 8.dp, bottom = 16.dp)
                            .clip(RoundedCornerShape(8.dp))
                            .background(selectedColor)
                            .height(85.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Text("#$selectedColorHex".uppercase())
                    }
                    Button({
                        showDialog = false
                        colorViewModel.loadCustomScheme(context, selectedColor)
                    }, Modifier.padding(bottom = 16.dp)) {
                        Text("Select")
                    }
                }
            }
        }
    }
}

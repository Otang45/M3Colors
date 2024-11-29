package otang.app.m3colors

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import otang.app.m3colors.navigation.Screen
import otang.app.m3colors.ui.screen.CustomScreen
import otang.app.m3colors.ui.screen.HomeScreen
import otang.app.m3colors.ui.theme.M3ColorsTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            M3ColorsTheme {
                val navController = rememberNavController()
                NavHost(
                    navController = navController,
                    startDestination = Screen.Home.name
                ) {
                    composable(route = Screen.Home.name) {
                        HomeScreen(navController)
                    }
                    composable(route = Screen.Custom.name) {
                        CustomScreen(navController)
                    }
                }
            }
        }
    }
}

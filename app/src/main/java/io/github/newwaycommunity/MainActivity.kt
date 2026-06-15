package io.github.newwaycommunity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import io.github.newwaycommunity.ui.screen.MainScreen
import io.github.newwaycommunity.ui.theme.AppTheme
import io.github.newwaycommunity.viewmodel.MainViewModel

class MainActivity : ComponentActivity() {
    
    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        setContent {
            val themeMode by viewModel.selectedThemeMode.collectAsState()
            val monetEnabled by viewModel.monetEnabled.collectAsState()

            AppTheme(
                themeMode = themeMode,
                dynamicColor = monetEnabled
            ) {
                Surface(
                    modifier = Modifier.fillMaxSize()
                ) {
                    MainScreen(viewModel = viewModel)
                }
            }
        }
    }
}

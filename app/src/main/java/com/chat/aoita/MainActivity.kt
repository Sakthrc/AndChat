package com.chat.aoita

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.chat.aoita.ui.chat.ChatScreen
import com.chat.aoita.ui.theme.AoitaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AoitaTheme { ChatScreen() }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ChatPreview() {
    AoitaTheme { ChatScreen() }
}

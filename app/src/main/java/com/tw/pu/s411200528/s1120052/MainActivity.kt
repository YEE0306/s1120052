package com.tw.pu.s411200528.s1120052

import android.app.Activity
import android.content.pm.ActivityInfo
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.detectHorizontalDragGestures
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.magnifier
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.tw.pu.s411200528.s1120052.ui.theme.S1120052Theme
import kotlinx.coroutines.delay

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Box {
                Modifier.background(Color(0xff95fe95))

            }
            S1120052Theme {
                setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)

                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    GameScreen(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}







@Composable
fun GameScreen(modifier: Modifier = Modifier) {
    val context = LocalContext.current
    // 背景顏色
    val colors = listOf(
        Color(0xff95fe95),
        Color(0xfffdca0f),
        Color(0xfffea4a4),
        Color(0xffa5dfed)
    )
    var currentIndex by remember { mutableStateOf(0) } // Box 的背景顏色索引
    var isSwiping by remember { mutableStateOf(false) }
    val gameTime = remember { mutableStateOf(0) }
    val score = remember { mutableStateOf(0) }
    val activity = (LocalContext.current as? Activity)
    // 當按鈕點擊時，結束應用程式

    // 這裡使用 finish() 結束應用程式


    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xff95fe95)),
        horizontalAlignment = Alignment.CenterHorizontally, // 元件水平置中
        verticalArrangement = Arrangement.Center // 元件垂直置中
    ) {
        // 顯示期末上機考的文字
        Text(
            text = "2024期末上機考(資管二A廖翊婷)",
            fontSize = 18.sp,
            color = Color.Black
        )

        // 顯示圖片 (假設 class_a 是你放在資源中的圖片)
        Image(
            painter = painterResource(id = R.drawable.class_a),
            contentDescription = "class_a",
            modifier = Modifier.padding(vertical = 16.dp)
        )

        // 顯示遊戲持續時間
        Text(
            text = "遊戲持續時間: ${gameTime.value} 秒",
            fontSize = 20.sp,
            color = Color.Black
        )

        // 顯示玩家的成績
        Text(
            text = "您的成績: ${score.value} 分",
            fontSize = 20.sp,
            color = Color.Black
        )

        // 結束 App 的按鈕
        Button(
            onClick = {
                activity?.finish()
            }
        ) {
            Text(text = "結束App")

        }
    }
}




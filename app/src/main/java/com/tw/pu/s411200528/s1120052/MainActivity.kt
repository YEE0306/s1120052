package com.tw.pu.s411200528.s1120052

import android.content.pm.ActivityInfo
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.magnifier
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.tw.pu.s411200528.s1120052.ui.theme.S1120052Theme

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
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }


            }
        }


    }


    @Composable
    fun Greeting(name: String, modifier: Modifier = Modifier) {

        Column (modifier = Modifier.fillMaxSize().background(Color(0xff95fe95)),

            horizontalAlignment = Alignment.CenterHorizontally
            ){



            Text(
                text = "2024期末上機考(資管二A廖翊婷)\n",
                modifier = modifier
            )

            Image(
                painter = painterResource(id = R.drawable.class_a),
                contentDescription = "圖片"
            )

            Text(
                text = "遊戲持續時間 0 秒",
                modifier = modifier
            )
            Text(
                text = "您的成績 0 分",
                modifier = modifier
            )
            Button(onClick = {
                //your onclick code here
            }) {
                Text(text = "結束App")
            }


        }


    }
}



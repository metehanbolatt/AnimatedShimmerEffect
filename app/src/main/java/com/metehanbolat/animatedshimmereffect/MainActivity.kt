package com.metehanbolat.animatedshimmereffect

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.metehanbolat.animatedshimmereffect.ui.theme.AnimatedShimmerEffectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AnimatedShimmerEffectTheme {
                Column {
                    repeat(7){
                        AnimatedShimmer()
                    }
                }
            }
        }
    }
}
package com.example.wbtechnoschoollesson2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.sizeIn
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ListItemDefaults.contentColor
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import com.example.wbtechnoschoollesson2.ui.buttons.WbOutlineButton
import com.example.wbtechnoschoollesson2.ui.buttons.WbSolidButton
import com.example.wbtechnoschoollesson2.ui.buttons.WbTextButton
import com.example.wbtechnoschoollesson2.ui.theme.UiTheme
import com.example.wbtechnoschoollesson2.ui.theme.WBTechnoschoolLesson2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            WBTechnoschoolLesson2Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Column(modifier = Modifier.padding(innerPadding)) {
                        Line(color = UiTheme.colors.brandColorDefault, enabled = true)
                        Spacer(modifier = Modifier.height(96.dp))
                        Line(color = UiTheme.colors.brandColorDark, enabled = true)
                        Spacer(modifier = Modifier.height(96.dp))
                        Line(color = UiTheme.colors.brandColorDefault, enabled = true)
                        Spacer(modifier = Modifier.height(96.dp))
                        Line(color = UiTheme.colors.brandColorDefault, enabled = false)
                        Spacer(modifier = Modifier.height(96.dp))

                    }
                }
            }
        }
    }

    @Composable
    private fun Line(color: Color, enabled: Boolean) {

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            WbSolidButton(
                text = "Button",
                btnColor = color,
                onClick = {},
                textColor = Color.White,
                enabled = enabled,
                modifier = Modifier.weight(1f)
            )

            WbOutlineButton(
                text = "Button",
                btnColor = color,
                textColor = color,
                onClick = { /*TODO*/ },
                enabled = enabled,
                modifier = Modifier.weight(1f)
            )
            WbTextButton(
                text = "Button",
                btnColor = color,
                textColor = color,
                onClick = { /*TODO*/ },
                enabled = enabled,
                modifier = Modifier.weight(1f)
            )
            MyTypographyRow(
                fontSize = MaterialTheme.typography.bodyLarge.fontSize,
                fontWeight = FontWeight.Normal,
                title = "Heading 1",
                subTitle = "SF Pro Display/32/Bold"
            )

        }
    }

    @Composable
    fun MyTypographyRow(
        modifier: Modifier = Modifier,
        fontSize: TextUnit,
        fontWeight: FontWeight,
        title: String,
        subTitle: String
    ) {
        val text = "The quick brown fox jumps over the lazy dog"
        LazyRow(
            modifier = Modifier
                .sizeIn(minHeight = 64.dp)
        ) {
            item {
                Column(
                    modifier = Modifier
                        .padding(end = 16.dp)
                        .widthIn(200.dp)
                ) {
                    Text(
                        text = title,
                        fontSize = MaterialTheme.typography.titleLarge.fontSize,
                        fontWeight = FontWeight.SemiBold,
                        fontFamily = FontFamily.SansSerif
                    )
                    Text(
                        text = subTitle,
                        fontSize = MaterialTheme.typography.titleSmall.fontSize,
                        color = Color.Gray,
                        fontFamily = FontFamily.SansSerif
                    )
                }
            }
            item {
                Text(
                    text = text,
                    fontSize = fontSize,
                    fontWeight = fontWeight,
                    fontFamily = FontFamily.SansSerif
                )
            }
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun GreetingPreview() {
        WBTechnoschoolLesson2Theme {
            Column {
                Line(color = UiTheme.colors.brandColorDefault, enabled = true)
                Spacer(modifier = Modifier.height(96.dp))
                Line(color = UiTheme.colors.brandColorDark, enabled = true)
                Spacer(modifier = Modifier.height(96.dp))
                Line(color = UiTheme.colors.brandColorDefault, enabled = true)
                Spacer(modifier = Modifier.height(96.dp))
                Line(color = UiTheme.colors.brandColorDefault, enabled = false)
                Spacer(modifier = Modifier.height(96.dp))
                MyTypographyRow(
                    fontSize = MaterialTheme.typography.bodyLarge.fontSize,
                    fontWeight = FontWeight.Normal,
                    title = "Heading 1",
                    subTitle = "SF Pro Display/32/Bold"
                )
            }
        }
    }
}







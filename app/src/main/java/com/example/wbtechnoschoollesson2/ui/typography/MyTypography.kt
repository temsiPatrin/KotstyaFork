package com.example.wbtechnoschoollesson2.ui.typography

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.sizeIn
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import com.example.wbtechnoschoollesson2.ui.theme.UiTheme
import com.example.wbtechnoschoollesson2.ui.theme.WBTechnoschoolLesson2Theme




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
            MyTypographyRow(
                fontSize = MaterialTheme.typography.bodyLarge.fontSize,
                fontWeight = FontWeight.Normal,
                title = "Heading 1",
                subTitle = "SF Pro Display/32/Bold"
            )
        }
    }
}
package com.example.wbtechnoschoollesson2.uiKitScreen

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import com.example.wbtechnoschoollesson2.ui.theme.UiTheme

@Composable
fun TypographyLine(
    title: String,
    typographyStyle: TextStyle,
    modifier: Modifier = Modifier
) {
    val text = "The quick brown fox jumps over the lazy dog"
    LazyRow(
        modifier = modifier,
    ) {
        item {
            Text(
                text = title,
                style = UiTheme.typography.subheading1
            )
            Spacer(modifier = Modifier.width(16.dp))
            Text(
                text = text,
                style = typographyStyle
            )
        }
    }
}
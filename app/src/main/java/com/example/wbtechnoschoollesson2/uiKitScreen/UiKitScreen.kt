package com.example.wbtechnoschoollesson2.uiKitScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.wbtechnoschoollesson2.R
import com.example.wbtechnoschoollesson2.ui.theme.UiTheme

@Composable
fun UiKitScreen(modifier: Modifier = Modifier) {
    LazyColumn(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(56.dp) // чтоб не писать  Spacer(modifier = Modifier.height(56.dp)) каждый раз

    ) {
        item {
            Column(
                verticalArrangement = Arrangement.spacedBy(56.dp)
            ) {
                Heading(text = "Buttons")
                ButtonLine(color = UiTheme.colors.brandColorDefault, enabled = true)
                ButtonLine(color = UiTheme.colors.brandColorDark, enabled = true)
                ButtonLine(color = UiTheme.colors.brandColorDefault, enabled = true)
                ButtonLine(color = UiTheme.colors.brandColorDefault, enabled = false)
            }
        }
        item {
            Column(
                verticalArrangement = Arrangement.spacedBy(56.dp)
            ) {
                Heading(text = "Typography")
                TypographyLine(title = "Heading 1", typographyStyle = UiTheme.typography.heading1)
                TypographyLine(title = "Heading 2", typographyStyle = UiTheme.typography.heading2)
                TypographyLine(
                    title = "Subheading 1",
                    typographyStyle = UiTheme.typography.subheading1
                )
                TypographyLine(
                    title = "Subheading 2",
                    typographyStyle = UiTheme.typography.subheading2
                )
                //todo 2 дописать остальные TypographyLine bodyText1, bodyText2, metadata1, metadata2, metadata2
            }
        }
        item {
            Column(
                verticalArrangement = Arrangement.spacedBy(56.dp)
            ) {
                Heading(text = "Icon and Image")
                Icon(painter = painterResource(id = R.drawable.ic_group), contentDescription = null)
                Image(
                    painter = painterResource(id = R.drawable.ic_group),
                    contentDescription = null
                )
                //todo 3 добавь картинку сам через Image(painter = painterResource(id = R.drawable.НАЗВАНИЕ_ЗАГРУЩЕНОЙ_КАРТИНКИ), contentDescription = null)
                //картинку можно скачать через фигму
            }
        }
        item {
            Heading(text = "Search")
            SearchView()
        }
        item {
            // Чипсы сделай сам можешь скопировать у кого нибудь
        }
    }
}
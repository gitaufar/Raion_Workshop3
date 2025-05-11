package com.example.raion_workshop_3

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import coil.compose.SubcomposeAsyncImage


@Composable
fun MainScreen(
    modifier: Modifier = Modifier
) {

}

@Composable
fun ProductCard(
    image: String,
    title: String,
    desc: String,
){
    Column{

        SubcomposeAsyncImage(
            model = image,
            contentDescription = desc,
        )
        Text(text = title)

    }
}

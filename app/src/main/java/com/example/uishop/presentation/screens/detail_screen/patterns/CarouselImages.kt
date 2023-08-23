package com.example.uishop.presentation.screens.detail_screen.patterns

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PageSize
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.util.lerp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import coil.size.Scale
import kotlin.math.absoluteValue

@Composable
fun CarouselImages(list: List<String>) {
    Column(
        modifier = Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        ImageSlider(images = list)
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun ImageSlider(images: List<String>) {
    val currentImage = remember {
        mutableStateOf("")
    }

    val pagerState = rememberPagerState(pageCount = { 3 }, initialPage = 1)

    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Spacer(modifier = Modifier.padding(10.dp))
        Card(modifier = Modifier.size(300.dp))  {
            AsyncImage(
                modifier = Modifier.fillMaxSize(),
                model = images[pagerState.currentPage],
                contentDescription = null,
                contentScale = ContentScale.Crop
            )
        }
        HorizontalPager(
            modifier = Modifier
                .height(100.dp),
            state = pagerState,
            contentPadding = PaddingValues(horizontal = 150.dp)
        ) {
            Card(
                shape = RoundedCornerShape(10.dp),
                modifier = Modifier
                    .graphicsLayer {
                        val pageOffSet = (
                                (pagerState.currentPage - it) + pagerState
                                    .currentPageOffsetFraction
                                ).absoluteValue
                        scaleY = lerp(
                            start = 0.77f,
                            stop = 1f,
                            fraction = 1f - pageOffSet.coerceIn(0f, 1f)
                        )
                        alpha = lerp(
                            start = 0.5f,
                            stop = 1f,
                            fraction = 1f - pageOffSet.coerceIn(0f, 1f)
                        )
                    }
                    .border(
                        width = 1.dp,
                        color = Color(0xFFEBEBEB),
                        shape = RoundedCornerShape(size = 6.dp)
                    )
                    .width(150.dp)
                    .height(70.dp)
            ) {
                AsyncImage(
                    modifier = Modifier.fillMaxSize(),
                    model = images[it],
                    contentDescription = null,
                    contentScale = ContentScale.Crop
                )
            }
        }
    }


}
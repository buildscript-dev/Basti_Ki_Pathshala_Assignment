package com.example.bastikipathshala.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.systemBars
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import coil.compose.AsyncImage
import com.example.bastikipathshala.R
import com.example.bastikipathshala.navigation.Screen

@Composable
fun HomeScreen(navController : NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(WindowInsets.systemBars.asPaddingValues())
            .padding(horizontal = 16.dp),
    ) {
        Row(
            modifier = Modifier.fillMaxWidth()
                .padding(vertical = 16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text("Basti Ki ", fontSize = 20.sp)
                Text("Pathshala", fontSize = 20.sp, fontWeight = FontWeight.SemiBold)
            }

            Box(
                modifier = Modifier
                    .size(50.dp)
                    .clip(CircleShape)
                    .border(1.dp, color = Color.Black, CircleShape)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.profile),
                    contentDescription = "Logo",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.fillMaxSize()
                )
            }
        }


        Text(
            text = "Empowering young minds through the magic of code.",
            fontSize = 25.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(Modifier.height(20.dp))

        Text(
            text = "Basti Ki Pathshala isn’t just a classroom — it’s a movement. Built for the curious minds in the bastis and local communities, our mission is to empower the next generation of coders, creators, and change-makers. We believe that talent knows no postcode, and with the right tools, guidance, and a lil' bit of hustle, anyone can break into the world of tech. From learning basic programming to building real-world projects, we’re here to unlock potential, line by line, byte by byte.",
            fontSize = 13.sp,
            style = TextStyle(
                lineHeight = 16.sp
            )

        )

        Spacer(Modifier.height(20.dp))

        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            SelectionContainer(modifier = Modifier.clickable(onClick = {
                navController.navigate(Screen.Form.route)
            })){
                Text(
                    text = "Fill The Form",
                    fontWeight = FontWeight.SemiBold,
                    style = TextStyle(textDecoration = TextDecoration.Underline)
                )
            }

            Icon(
                imageVector = Icons.Default.KeyboardArrowRight,
                contentDescription = "Arrow Icon"
            )
        }

        AsyncImage(
            model = "https://bastikipathshala.org/wp-content/uploads/2024/02/Basti-Ki-Pathshala-Official-Logo.jpg",
            contentDescription = "Basti Ki Pathshala Logo",
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .fillMaxWidth()
                .clip(CircleShape)
                .padding(bottom = 16.dp)
        )

        Text(
            text = "Coding Foundation",
            fontSize = 25.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(Modifier.height(20.dp))

        Text(
            text = "We’re on a mission to build a strong coding foundation for every curious mind out there. Whether you're just getting started or dreaming of building the next big thing, we’ve got your back. Read more about our journey and vision in the About section.",
            fontSize = 13.sp,
            style = TextStyle(
                lineHeight = 16.sp
            )
        )

        Spacer(Modifier.height(20.dp))

        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            SelectionContainer(modifier = Modifier.clickable(onClick = {
                navController.navigate(Screen.About.route)
            })) {
                Text(
                    text = "About Us",
                    fontWeight = FontWeight.SemiBold,
                    style = TextStyle(textDecoration = TextDecoration.Underline)
                )
            }

            Icon(
                imageVector = Icons.Default.KeyboardArrowRight,
                contentDescription = "Arrow Icon"
            )
        }


        Row(modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically) { AsyncImage(
            model = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSBU9wlABXpdT3iY6b0zPBLq2oP8wgTD6l3KQ&s",
            contentDescription = "Basti Ki Pathshala Logo",
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .size(200.dp)
                .padding(end = 20.dp)
        )

            Text(
                text ="Coding isn’t just for the pros — it’s for anyone with the guts to start. Learn it, own it, and change your life with it.",
                fontSize = 13.sp,
                style = TextStyle(
                    lineHeight = 16.sp
                )
            )        }


    }
}

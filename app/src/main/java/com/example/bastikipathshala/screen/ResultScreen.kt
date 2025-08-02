package com.example.bastikipathshala.screen


import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ResultCard(
    name: String,
    contact: String,
    city: String,
    age: String,
    skills: String,
    education: String,
    intro: String
) {
    Card(
        modifier = Modifier
            .wrapContentSize()
            .padding(30.dp),
        shape = RoundedCornerShape(25.dp),
        colors = CardDefaults.cardColors(containerColor = Color(0xFFF5F5F5)),
        elevation = CardDefaults.cardElevation(defaultElevation = 10.dp)
    ) {
        Column(modifier = Modifier.padding(16.dp), verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally) {
            Text("Name: $name", fontSize = 20.sp, fontWeight = FontWeight.Bold)
            Text("Contact: $contact", fontSize = 20.sp, fontWeight = FontWeight.Bold)
            Text("City: $city", fontSize = 20.sp, fontWeight = FontWeight.Bold)
            Text("Age: $age", fontSize = 20.sp, fontWeight = FontWeight.Bold)
            Text("Skills: $skills", fontSize = 20.sp, fontWeight = FontWeight.Bold)
            Text("Education: $education", fontSize = 20.sp, fontWeight = FontWeight.Bold)
            Text("Intro: $intro", fontSize = 20.sp, fontWeight = FontWeight.Bold)
        }
    }
}

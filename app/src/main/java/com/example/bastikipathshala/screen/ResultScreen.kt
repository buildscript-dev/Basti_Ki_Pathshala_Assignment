package com.example.bastikipathshala.screen


import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
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
            .fillMaxSize()
            .padding(30.dp)
            .border(1.dp, color = Color.Black)
            .clip(RoundedCornerShape(25.dp)),
        elevation = CardDefaults.cardElevation(defaultElevation = 10.dp) // M3 style
    ) {
        Column(
            modifier = Modifier
                .padding(20.dp)
                .fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            Text("Volunteer Summary", fontWeight = FontWeight.Bold, fontSize = 20.sp)

            DetailRow("Name:", name)
            DetailRow("Contact:", contact)
            DetailRow("City:", city)
            DetailRow("Age:", age)
            DetailRow("Skills:", skills)
            DetailRow("Education:", education)
            DetailRow("Why Join:", intro)
        }
    }
}

@Composable
fun DetailRow(label: String, value: String) {
    Row {
        Text(text = label, fontWeight = FontWeight.SemiBold)
        Spacer(modifier = Modifier.width(8.dp))
        Text(text = value)
    }
}

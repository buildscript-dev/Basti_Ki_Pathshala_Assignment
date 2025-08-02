package com.example.bastikipathshala.screen

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun FormScreen() {
    var volunteerName by remember { mutableStateOf("") }
    var volunteerContact by remember { mutableStateOf("") }
    var volunteerCity by remember { mutableStateOf("") }
    var volunteerAge by remember { mutableStateOf("") }

    // 💡 New fields:
    var volunteerSkills by remember { mutableStateOf("") }
    var volunteerEducation by remember { mutableStateOf("") }
    var volunteerIntro by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(WindowInsets.systemBars.asPaddingValues())
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = "Volunteer Details",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        @Composable
        fun inputField(value: String, onChange: (String) -> Unit, label: String) {
            OutlinedTextField(
                value = value,
                onValueChange = onChange,
                label = { Text(label) },
                singleLine = true,
                shape = RoundedCornerShape(12.dp),
                colors = OutlinedTextFieldDefaults.colors(
                    focusedTextColor = Color.Black,
                    unfocusedTextColor = Color.DarkGray,
                    focusedBorderColor = Color.Black,
                    unfocusedBorderColor = Color.Gray,
                    focusedLabelColor = Color.Black,
                    cursorColor = Color.Black
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp)
            )
        }

        // Existing fields
        inputField(volunteerName, { volunteerName = it }, "Enter your name")
        inputField(volunteerContact, { volunteerContact = it }, "Enter your contact no.")
        inputField(volunteerCity, { volunteerCity = it }, "Enter your city")
        inputField(volunteerAge, { volunteerAge = it }, "Enter your age")

        // 🔥 New fields
        inputField(volunteerSkills, { volunteerSkills = it }, "Enter your skills")
        inputField(volunteerEducation, { volunteerEducation = it }, "Your education level")
        OutlinedTextField(
            value = volunteerIntro,
            onValueChange = { volunteerIntro = it },
            label = { Text("Why do you want to join?") },
            shape = RoundedCornerShape(12.dp),
            colors = OutlinedTextFieldDefaults.colors(
                focusedTextColor = Color.Black,
                unfocusedTextColor = Color.DarkGray,
                focusedBorderColor = Color.Black,
                unfocusedBorderColor = Color.Gray,
                focusedLabelColor = Color.Black,
                cursorColor = Color.Black
            ),
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
            maxLines = 3
        )

        Spacer(modifier = Modifier.height(24.dp))

        Button(
            onClick = {

            },
            shape = RoundedCornerShape(12.dp),
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Submit")
        }
    }
}

//if (isSubmitted) {
//    ResultCard(
//        name = volunteerName,
//        contact = volunteerContact,
//        city = volunteerCity,
//        age = volunteerAge,
//        skills = volunteerSkills,
//        education = volunteerEducation,
//        intro = volunteerIntro
//    )
//}


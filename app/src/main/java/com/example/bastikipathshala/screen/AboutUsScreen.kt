package com.example.bastikipathshala.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.systemBars
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun AboutScreen(navController : NavController){
    Column(modifier = Modifier.fillMaxSize()
        .padding(WindowInsets.systemBars.asPaddingValues())
        .verticalScroll(rememberScrollState())
        .padding(horizontal = 16.dp,
            vertical = 10.dp),
        horizontalAlignment = Alignment.CenterHorizontally){
        Text(
            text = "About Us",
            fontSize = 25.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(Modifier.height(20.dp))

Text(text = "In the narrow lanes of underserved communities, where access to quality education is often a luxury, Basti Ki Pathshala is rewriting the script — not with chalk and blackboards, but with code and creativity. This isn't just another NGO doing surface-level charity work. Basti Ki Pathshala is a movement, a mission, and a mentorship hub that’s bridging the gap between raw potential and real-world opportunities — all through the power of tech.",
    fontSize = 13.sp,
    style = TextStyle(
        lineHeight = 16.sp
    ))
        Spacer(Modifier.height(20.dp))

        Text(text = "At its core, Basti Ki Pathshala is a coding internship foundation that provides students from marginalized areas with practical, hands-on programming experience. It’s not about just teaching Java or Python — it’s about unlocking confidence, building logic, and sparking the kind of digital literacy that can change lives.",
        fontSize = 13.sp,
    style = TextStyle(
        lineHeight = 16.sp
    ))
        Spacer(Modifier.height(20.dp))

        Text(text = "What makes this initiative so powerful is that it's community-rooted and future-focused. Students from bastis and rural belts — who’ve never touched a laptop before — are being introduced to UI design, Android development, web technologies, and real-time collaboration using GitHub. But the learning isn’t limited to just writing code. The foundation emphasizes project-based learning, team communication, problem-solving, and how to think like a developer — all crucial for surviving in today’s tech industry.",
    fontSize = 13.sp,
    style = TextStyle(
        lineHeight = 16.sp
    ))
        Spacer(Modifier.height(20.dp))

        Text(text = "Interns who join Basti Ki Pathshala don’t just learn from a curriculum. They’re mentored by working professionals, open-source contributors, and industry volunteers who believe in creating impact where it matters most. These mentors provide guidance on building portfolios, cracking interviews, and contributing to real-world projects — something most traditional schools never touch on.",
    fontSize = 13.sp,
    style = TextStyle(
        lineHeight = 16.sp
    ))
        Spacer(Modifier.height(20.dp))

        Text(text = "One of the most unique parts of this internship is how inclusive and empowering it is. It doesn’t matter what language you speak, what device you have, or how much English you know. What matters is your curiosity, your drive, and your willingness to hustle. Basti Ki Pathshala takes that raw energy and channels it into something bigger — a purpose, a pathway, and possibly, a profession.",
    fontSize = 13.sp,
    style = TextStyle(
        lineHeight = 16.sp
    ))

        Spacer(Modifier.height(20.dp))

        Text(
            text ="In a world that often overlooks kids from small towns and slums, this foundation says, “You're seen. You're capable. And here's your shot.” That’s powerful.",
    fontSize = 13.sp,
    style = TextStyle(
        lineHeight = 16.sp
    ))

        Spacer(Modifier.height(20.dp))

        Text(
            text = "Beyond the coding itself, the NGO also holds regular sessions on soft skills, resume building, online etiquette, and awareness around freelancing, internships, and open-source. They’re not just creating coders — they’re building independent, confident problem-solvers who can survive and thrive anywhere.",
    fontSize = 13.sp,
    style = TextStyle(
        lineHeight = 16.sp
    ))

        Spacer(Modifier.height(20.dp))

        Text(text = "For many, Basti Ki Pathshala is their first exposure to tech, but for most, it's their first real step toward changing their life. From local learners to future tech leaders — that’s the kind of transformation Basti Ki Pathshala is pushing every single day.",
    fontSize = 13.sp,
    style = TextStyle(
        lineHeight = 16.sp
    ))

        Spacer(Modifier.height(20.dp))

        Text(text =  "So if you're looking to support a movement that’s genuinely shaping India’s tech future, or if you’re someone from a basti who’s hungry to learn — this is your sign. Basti Ki Pathshala is where coding meets courage. Line by line. Byte by byte. " ,
    fontSize = 13.sp,
    style = TextStyle(
        lineHeight = 16.sp
    ))



    }
}
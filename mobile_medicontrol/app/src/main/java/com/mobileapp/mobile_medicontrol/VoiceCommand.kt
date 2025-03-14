package com.mobileapp.mobile_medicontrol

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mobileapp.mobile_medicontrol.ui.theme.*

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun VoiceCommandScreen(
    onBackClick: () -> Unit = {}
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("MediControl") },
                navigationIcon = {
                    IconButton(onClick = onBackClick) {
                        Icon(
                            imageVector = Icons.Default.ArrowBack,
                            contentDescription = "Back"
                        )
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MediWhite
                )
            )
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(MediWhite)
                .padding(paddingValues)
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Iniciar receta",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(vertical = 16.dp)
            )
            
            Text(
                text = "Presione el micrófono y mencione qué receta desea iniciar el día de hoy",
                fontSize = 16.sp,
                textAlign = TextAlign.Center,
                color = MediTextGray,
                modifier = Modifier.padding(horizontal = 24.dp, vertical = 16.dp)
            )
            
            Spacer(modifier = Modifier.height(48.dp))
            
            // Microphone button
            Box(
                modifier = Modifier
                    .size(120.dp)
                    .clip(CircleShape)
                    .background(MediBlue),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_mic),
                    contentDescription = "Microphone",
                    tint = MediWhite,
                    modifier = Modifier.size(60.dp)
                )
            }
            
            Spacer(modifier = Modifier.weight(1f))
            
            // Bottom navigation
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 16.dp),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.padding(horizontal = 8.dp)
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_home),
                        contentDescription = "Home",
                        tint = MediTextGray,
                        modifier = Modifier.size(24.dp)
                    )
                    Text(
                        text = "Home",
                        fontSize = 12.sp,
                        color = MediTextGray
                    )
                }
                
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.padding(horizontal = 8.dp)
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_play),
                        contentDescription = "Iniciar Receta",
                        tint = MediBlue,
                        modifier = Modifier.size(24.dp)
                    )
                    Text(
                        text = "Iniciar Receta",
                        fontSize = 12.sp,
                        color = MediBlue
                    )
                }
                
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.padding(horizontal = 8.dp)
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_medication),
                        contentDescription = "Configuración",
                        tint = MediTextGray,
                        modifier = Modifier.size(24.dp)
                    )
                    Text(
                        text = "Configuración",
                        fontSize = 12.sp,
                        color = MediTextGray
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun VoiceCommandScreenPreview() {
    Mobile_medicontrolTheme {
        VoiceCommandScreen()
    }
}

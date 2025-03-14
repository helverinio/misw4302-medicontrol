package com.mobileapp.mobile_medicontrol

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mobileapp.mobile_medicontrol.ui.theme.*
import com.mobileapp.mobile_medicontrol.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    onNavigateToSettings: () -> Unit = {},
    onItemClick: (String) -> Unit = {},
    onLogout: () -> Unit = {}
) {
    var selectedTab by remember { mutableStateOf(0) }
    
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "MediControl",
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp
                    )
                },
                actions = {
                    // Notification icon with badge
                    BadgedBox(
                        badge = {
                            Badge {
                                Text("1")
                            }
                        },
                        modifier = Modifier.padding(end = 16.dp)
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_notifications),
                            contentDescription = "Notifications",
                            modifier = Modifier.size(24.dp)
                        )
                    }
                    
                    // Profile icon
                    Icon(
                        painter = painterResource(id = R.drawable.ic_person),
                        contentDescription = "Profile",
                        modifier = Modifier
                            .padding(end = 16.dp)
                            .size(24.dp)
                    )
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MediWhite
                )
            )
        },
        bottomBar = {
            NavigationBar(
                containerColor = MediWhite,
                contentColor = MediBlue
            ) {
                // Home tab
                NavigationBarItem(
                    icon = { 
                        Icon(
                            painter = painterResource(id = R.drawable.ic_home),
                            contentDescription = "Home"
                        ) 
                    },
                    label = { Text("Home") },
                    selected = selectedTab == 0,
                    onClick = { selectedTab = 0 },
                    colors = NavigationBarItemDefaults.colors(
                        selectedIconColor = MediBlue,
                        selectedTextColor = MediBlue,
                        indicatorColor = MediWhite
                    )
                )
                
                // Iniciar Receta tab
                NavigationBarItem(
                    icon = { 
                        Icon(
                            painter = painterResource(id = R.drawable.ic_play),
                            contentDescription = "Iniciar Receta"
                        ) 
                    },
                    label = { Text("Iniciar Receta") },
                    selected = selectedTab == 1,
                    onClick = { selectedTab = 1 },
                    colors = NavigationBarItemDefaults.colors(
                        selectedIconColor = MediBlue,
                        selectedTextColor = MediBlue,
                        indicatorColor = MediWhite
                    )
                )
                
                // Configuración tab
                NavigationBarItem(
                    icon = { 
                        Icon(
                            painter = painterResource(id = R.drawable.ic_settings),
                            contentDescription = "Configuración"
                        ) 
                    },
                    label = { Text("Configuración") },
                    selected = selectedTab == 2,
                    onClick = { selectedTab = 2 },
                    colors = NavigationBarItemDefaults.colors(
                        selectedIconColor = MediBlue,
                        selectedTextColor = MediBlue,
                        indicatorColor = MediWhite
                    )
                )
                
                // Salir tab
                NavigationBarItem(
                    icon = { 
                        Icon(
                            painter = painterResource(id = R.drawable.ic_exit),
                            contentDescription = "Salir"
                        ) 
                    },
                    label = { Text("Salir") },
                    selected = selectedTab == 3,
                    onClick = { 
                        selectedTab = 3
                        onLogout()
                    },
                    colors = NavigationBarItemDefaults.colors(
                        selectedIconColor = MediBlue,
                        selectedTextColor = MediBlue,
                        indicatorColor = MediWhite
                    )
                )
            }
        }
    ) { paddingValues ->
        HomeContent(
            modifier = Modifier.padding(paddingValues),
            onItemClick = onItemClick
        )
    }
}

@Composable
fun HomeContent(
    modifier: Modifier = Modifier,
    onItemClick: (String) -> Unit = {}
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(MediGray)
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        // Crisis in progress
        CrisisCard(
            title = "Crisis Enero",
            subtitle = "Próxima dosis: 6:30 pm",
            progress = 0.25f,
            status = "En progreso",
            statusColor = MediBlue,
            statusBackgroundColor = MediLightBlue,
            iconResId = R.drawable.ic_home,
            onClick = { onItemClick("Crisis Enero") }
        )
        
        // Completed crisis
        CrisisCard(
            title = "Crisis Diciembre",
            subtitle = "Última dosis: 15 Mar",
            progress = 1.0f,
            status = "Finalizada",
            statusColor = Color.Green,
            statusBackgroundColor = Color(0xFFE6F7E9),
            iconResId = R.drawable.ic_settings,
            onClick = { onItemClick("Crisis Diciembre") }
        )
    }
}

@Composable
fun CrisisCard(
    title: String,
    subtitle: String,
    progress: Float,
    status: String,
    statusColor: Color,
    statusBackgroundColor: Color,
    iconResId: Int,
    onClick: () -> Unit = {}
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable(onClick = onClick),
        colors = CardDefaults.cardColors(
            containerColor = MediWhite
        ),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 2.dp
        )
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                // Icon
                Box(
                    modifier = Modifier
                        .size(40.dp)
                        .clip(RoundedCornerShape(8.dp))
                        .background(MediLightBlue),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        painter = painterResource(id = iconResId),
                        contentDescription = null,
                        tint = MediBlue,
                        modifier = Modifier.size(24.dp)
                    )
                }
                
                Spacer(modifier = Modifier.width(12.dp))
                
                // Title and subtitle
                Column(
                    modifier = Modifier.weight(1f)
                ) {
                    Text(
                        text = title,
                        fontWeight = FontWeight.Bold,
                        fontSize = 16.sp
                    )
                    
                    Text(
                        text = subtitle,
                        color = MediTextGray,
                        fontSize = 14.sp
                    )
                }
                
                // Status badge
                Box(
                    modifier = Modifier
                        .clip(RoundedCornerShape(16.dp))
                        .background(statusBackgroundColor)
                        .padding(horizontal = 12.dp, vertical = 4.dp)
                ) {
                    Text(
                        text = status,
                        color = statusColor,
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Medium
                    )
                }
            }
            
            Spacer(modifier = Modifier.height(16.dp))
            
            // Progress bar
            LinearProgressIndicator(
                progress = progress,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(8.dp)
                    .clip(RoundedCornerShape(4.dp)),
                color = if (progress >= 1.0f) Color.Green else MediBlue,
                trackColor = MediGray
            )
            
            Spacer(modifier = Modifier.height(8.dp))
            
            // Progress text
            Text(
                text = "${(progress * 100).toInt()}% Completado",
                fontSize = 12.sp,
                color = MediTextGray,
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.End
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    Mobile_medicontrolTheme {
        HomeScreen()
    }
}

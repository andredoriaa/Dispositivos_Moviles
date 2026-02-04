package com.example.moviles.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview (showBackground = true)
@Composable

fun GameOver(){
    Column(modifier = Modifier.fillMaxSize()
            .background(Color(0xFFF8F6EE))
            .padding(20.dp))
    {
        Row(modifier = Modifier.fillMaxWidth()
            , horizontalArrangement = Arrangement.Center){
            Text("Game Over",
                fontSize = 40.sp,
                fontWeight = FontWeight.Bold)
        }

        Spacer(modifier = Modifier.height(height = 12.dp))

        Row(modifier = Modifier.fillMaxWidth()
            , horizontalArrangement = Arrangement.Center){
            Text("7000 points scored in 476 moves. 2 powerups used:",
                fontSize = 12.sp
                )
        }

        Spacer(modifier = Modifier.height(height = 15.dp))

        Row(modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center) {
            Box(
                modifier = Modifier.size(48.dp)
                    .background(Color(0xFFB9AB99), RoundedCornerShape(10.dp)),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    imageVector = Icons.Default.Refresh,
                    contentDescription = null,
                    tint = Color(0xFFEFEDEA)
                )

            }

            Spacer(modifier = Modifier.width(width = 10.dp))

            Box(
                    modifier = Modifier.size(48.dp)
                        .background(Color(0xFFB9AB99), RoundedCornerShape(10.dp)),
            contentAlignment = Alignment.Center
            ) {
            Icon(
                imageVector = Icons.Default.Refresh,
                contentDescription = null,
                tint = Color(0xFFEFEDEA)
            )
        }


        }

        Spacer(modifier = Modifier.height(height = 25.dp))

        Box(
            modifier = Modifier
                .border(4.dp, Color(0xFF9B8675), RoundedCornerShape(14.dp))
                .background(Color(0xFF998574), RoundedCornerShape(14.dp))
                .padding(8.dp)
                .align(Alignment.CenterHorizontally)
        ) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {

                Column() {
                    Row() {
                        Box(
                            modifier = Modifier.size(70.dp).padding(4.dp)
                                .background(Color(0xFFECE3D9), RoundedCornerShape(8.dp)),
                            contentAlignment = Alignment.Center
                        ) {
                            Text("2", fontSize = 20.sp, fontWeight = FontWeight.Bold)
                        }
                        Box(
                            modifier = Modifier.size(70.dp).padding(4.dp)
                                .background(Color(0xFFF47658), RoundedCornerShape(8.dp)),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                "32",
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.White
                            )
                        }
                        Box(
                            modifier = Modifier.size(70.dp).padding(4.dp)
                                .background(Color(0xFFEAE2D8), RoundedCornerShape(8.dp)),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                "2",
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Bold,
                            )
                        }
                        Box(
                            modifier = Modifier.size(70.dp).padding(4.dp)
                                .background(Color(0xFFE9D7B4), RoundedCornerShape(8.dp)),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                "4",
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Bold,
                            )
                        }
                    }

                    Row() {
                        Box(
                            modifier = Modifier.size(70.dp).padding(4.dp)
                                .background(Color(0xFFE8D6B3), RoundedCornerShape(8.dp)),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                "4",
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Bold)
                        }
                        Box(
                            modifier = Modifier.size(70.dp).padding(4.dp)
                                .background(Color(0xFFF15A36), RoundedCornerShape(8.dp)),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                "64",
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.White
                            )
                        }
                        Box(
                            modifier = Modifier.size(70.dp).padding(4.dp)
                                .background(Color(0xFFE7D5B2), RoundedCornerShape(8.dp)),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                "4",
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Bold,
                            )
                        }
                        Box(
                            modifier = Modifier.size(70.dp).padding(4.dp)
                                .background(Color(0xFFEECC55), RoundedCornerShape(8.dp)),
                            contentAlignment = Alignment.Center
                        ) {
                            Text("128", fontSize = 20.sp, fontWeight = FontWeight.Bold, color = Color.White)
                        }
                    }

                    Row() {
                        Box(
                            modifier = Modifier.size(70.dp).padding(4.dp)
                                .background(Color(0xFFEBAA6F), RoundedCornerShape(8.dp)),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                "8",
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.White
                            )
                        }
                        Box(
                            modifier = Modifier.size(70.dp).padding(4.dp)
                                .background(Color(0xFFEECC55), RoundedCornerShape(8.dp)),
                            contentAlignment = Alignment.Center
                        ) {
                            Text("256", fontSize = 20.sp, fontWeight = FontWeight.Bold, color = Color.White)
                        }
                        Box(
                            modifier = Modifier.size(70.dp).padding(4.dp)
                                .background(Color(0xFFF0CD55), RoundedCornerShape(8.dp)),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                "512",
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.White
                            )
                        }
                        Box(
                            modifier = Modifier.size(70.dp).padding(4.dp)
                                .background(Color(0xFFEAA96F), RoundedCornerShape(8.dp)),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                "8",
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.White
                            )
                        }
                    }

                    Row() {
                        Box(
                            modifier = Modifier.size(70.dp).padding(4.dp)
                                .background(Color(0xFFE7D5B2), RoundedCornerShape(8.dp)),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                "4",
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Bold
                            )
                        }
                        Box(
                            modifier = Modifier.size(70.dp).padding(4.dp)
                                .background(Color(0xFFEBAA6F), RoundedCornerShape(8.dp)),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                "8",
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.White
                            )
                        }
                        Box(
                            modifier = Modifier.size(70.dp).padding(4.dp)
                                .background(Color(0xFFEAE2D8), RoundedCornerShape(8.dp)),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                "2",
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Bold
                            )
                        }
                        Box(
                            modifier = Modifier.size(70.dp).padding(4.dp)
                                .background(Color(0xFFE8D6B3), RoundedCornerShape(8.dp)),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                "4",
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Bold
                            )
                        }
                    }
                }
            }
        }

        Spacer(modifier = Modifier.height(height = 25.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        )
        {
            Row(
                modifier = Modifier.weight(1f)

                    .background(Color(0xFF978878), RoundedCornerShape(8.dp))
                    .padding(12.dp), verticalAlignment = Alignment.CenterVertically , horizontalArrangement = Arrangement.Center
            ) {
                Text("Play Again", fontSize = 12.sp, color = Color(0xFFF6F4ED))
                }

            Row(
                modifier = Modifier.weight(1f)
                    .border(1.dp, Color(0xFFBEB5A7), shape = RoundedCornerShape(12.dp))
                    .background(Color(0xFFF8F6EE), RoundedCornerShape(8.dp))
                    .padding(12.dp), verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.Center

            ) {
                Text("Undo", fontSize = 12.sp, color = Color(0xFF786957))
                }
        }

        Spacer(modifier = Modifier.height(height = 15.dp))

        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
            Text("You're out of undos!", color = Color(0xFF968777))
        }
    }



}
package com.example.moviles.ui

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
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
@Preview(showBackground = true)

fun Juego(){
    Column(modifier = Modifier.fillMaxSize().
    background(Color(0xFFF8F6EE)).
    padding(16.dp),) {


        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Icon(
                imageVector = Icons.Default.Menu,
                contentDescription = "Menu",
                tint = Color(0xFF756452),
                modifier = Modifier.size(28.dp)
            )
            Icon(
                imageVector = Icons.Default.Refresh,
                contentDescription = "Menu",
                tint = Color(0xFF9C8F80),
                modifier = Modifier.size(28.dp)
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            "2048",
            fontSize = 40.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF746452),
            modifier = Modifier.align(Alignment.CenterHorizontally)

        )


        Spacer(modifier = Modifier.height(16.dp))


        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        )
        {
            Row(
                modifier = Modifier.weight(1f)
                    .border(1.dp, Color(0xFFBEB5A7), shape = RoundedCornerShape(12.dp))
                    .background(Color(0xFFE9E6D9), RoundedCornerShape(8.dp))
                    .padding(12.dp), verticalAlignment = Alignment.CenterVertically
            ) {
                Text("Score:", fontSize = 12.sp, color = Color(0xFF7C6D5B))
                Spacer(modifier = Modifier.weight(1f))
                Text("1692", fontSize = 18.sp, fontWeight = FontWeight.Bold)
            }

            Row(
                modifier = Modifier.weight(1f)
                    .border(1.dp, Color(0xFFBEB5A7), shape = RoundedCornerShape(12.dp))
                    .background(Color(0xFFF8F6EE), RoundedCornerShape(8.dp))
                    .padding(12.dp), verticalAlignment = Alignment.CenterVertically

            ) {
                Text("Best:", fontSize = 12.sp, color = Color(0xFF786957))
                Spacer(modifier = Modifier.weight(1f))
                Text("7000:", fontSize = 18.sp, fontWeight = FontWeight.Bold)
            }
        }

        Spacer(modifier = Modifier.height(20.dp))

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
                                .background(Color(0xFFEAD8B5), RoundedCornerShape(8.dp)),
                            contentAlignment = Alignment.Center
                        ) {
                            Text("4", fontSize = 20.sp, fontWeight = FontWeight.Bold)
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
                                .background(Color(0xFFEFAC71), RoundedCornerShape(8.dp)),
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
                                .background(Color(0xFFF47557), RoundedCornerShape(8.dp)),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                "32",
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.White
                            )
                        }
                    }

                    Row() {
                        Box(
                            modifier = Modifier.size(70.dp).padding(4.dp)
                                .background(Color(0xFFBCAB97), RoundedCornerShape(8.dp)),
                            contentAlignment = Alignment.Center
                        ) {

                        }
                        Box(
                            modifier = Modifier.size(70.dp).padding(4.dp)
                                .background(Color(0xFFF38D59), RoundedCornerShape(8.dp)),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                "16",
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.White
                            )
                        }
                        Box(
                            modifier = Modifier.size(70.dp).padding(4.dp)
                                .background(Color(0xFFF35A36), RoundedCornerShape(8.dp)),
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
                                .background(Color(0xFFEAD8B5), RoundedCornerShape(8.dp)),
                            contentAlignment = Alignment.Center
                        ) {
                            Text("4", fontSize = 20.sp, fontWeight = FontWeight.Bold)
                        }
                    }

                    Row() {
                        Box(
                            modifier = Modifier.size(70.dp).padding(4.dp)
                                .background(Color(0xFFBCAB97), RoundedCornerShape(8.dp)),
                            contentAlignment = Alignment.Center
                        ) {

                        }
                        Box(
                            modifier = Modifier.size(70.dp).padding(4.dp)
                                .background(Color(0xFFECE3D9), RoundedCornerShape(8.dp)),
                            contentAlignment = Alignment.Center
                        ) {
                            Text("2", fontSize = 20.sp, fontWeight = FontWeight.Bold)
                        }
                        Box(
                            modifier = Modifier.size(70.dp).padding(4.dp)
                                .background(Color(0xFFF0CD55), RoundedCornerShape(8.dp)),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                "128",
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.White
                            )
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
                    }

                    Row() {
                        Box(
                            modifier = Modifier.size(70.dp).padding(4.dp)
                                .background(Color(0xFFBBAA96), RoundedCornerShape(8.dp)),
                            contentAlignment = Alignment.Center
                        ) {

                        }
                        Box(
                            modifier = Modifier.size(70.dp).padding(4.dp)
                                .background(Color(0xFFBAA995), RoundedCornerShape(8.dp)),
                            contentAlignment = Alignment.Center
                        ) {

                        }
                        Box(
                            modifier = Modifier.size(70.dp).padding(4.dp)
                                .background(Color(0xFFEDAB70), RoundedCornerShape(8.dp)),
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
                                .background(Color(0xFFB9A894), RoundedCornerShape(8.dp)),
                            contentAlignment = Alignment.Center
                        ) {

                        }
                    }


                }
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        Row(
            modifier = Modifier.fillMaxWidth()
                ,
            horizontalArrangement = Arrangement.Center
        )

        {

            Row(modifier = Modifier.background(Color(0xFFE8E5D8)).
                padding(all = 6.dp)
                .clip(RoundedCornerShape(12.dp))
            ) {

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

                Spacer(modifier = Modifier.width(4.dp))

                Box(
                    modifier = Modifier.size(48.dp)
                        .background(Color(0xFFB9AB99), RoundedCornerShape(10.dp)),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        imageVector = Icons.Default.Refresh,
                        contentDescription = null,
                        tint = Color(0xFFFDFDFD)
                    )
                }

                Spacer(modifier = Modifier.width(4.dp))

                Box(
                    modifier = Modifier.size(48.dp)
                        .background(Color(0xFFDAD4C4), RoundedCornerShape(10.dp)),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        imageVector = Icons.Default.KeyboardArrowRight,
                        contentDescription = null,
                        tint = Color(0xFFECEAE5)
                    )
                }


            }
        }


    }

}
package com.miguelzamit.profilemiguel.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.miguelzamit.profilemiguel.R

@Composable
fun SocialApp(modifier: Modifier) {

    Column(
        modifier = modifier,
    ) {

        Column (
            modifier = Modifier.fillMaxWidth().padding(horizontal = 15.dp, vertical = 5.dp)
        ){

            Row (){

                Image(
                    painter = painterResource(id = R.drawable.foto),
                    contentDescription = "Miguel",
                    modifier = Modifier
                        .height(60.dp)
                        .width(60.dp)
                        .clip(CircleShape)
                        .border(
                            width = 1.dp,
                            color = Color.Black,
                            shape = CircleShape
                        )
                )

                Column (
                    modifier = Modifier.padding(horizontal = 10.dp)
                ){
                    Text(
                        text = "Good Morning",
                        fontSize = 14.sp
                    )
                    Text(

                        text = "Miguel Zamit",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Black
                    )

                }


            }


        }

    }

}
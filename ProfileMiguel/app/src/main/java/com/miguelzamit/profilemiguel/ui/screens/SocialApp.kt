package com.miguelzamit.profilemiguel.ui.screens

import android.graphics.drawable.Icon
import android.service.autofill.CustomDescription
import android.util.Log
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Celebration
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.DeveloperMode
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Flight
import androidx.compose.material.icons.filled.Groups
import androidx.compose.material.icons.filled.Mail
import androidx.compose.material.icons.filled.MailOutline
import androidx.compose.material.icons.filled.PersonAdd
import androidx.compose.material.icons.filled.PersonRemove
import androidx.compose.material.icons.filled.VideogameAsset
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.SegmentedButtonDefaults.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.miguelzamit.profilemiguel.R


@Composable
fun CustomIconRow(icon: ImageVector, description: String) {
    Row(
        horizontalArrangement = Arrangement.spacedBy(5.dp),
        modifier = Modifier
            .background(Color(0xD0EC853D), shape = RoundedCornerShape(15.dp))
            .padding(3.dp)
    ) {

        Icon(
            imageVector = icon,
            contentDescription = description,
            tint = Color.White
        )
        Text(
            text = description,
            color = Color.White,
            fontWeight = FontWeight.Bold,
            fontSize = 13.sp
        )
    }


}

@Composable
fun CustomImage(image: Int) {

    var clicked: Boolean by rememberSaveable { mutableStateOf(false) }

    Image(
        painter = painterResource(id = image),
        contentDescription = "photo",
        modifier = Modifier
            .width(280.dp)
            .clip(shape = RoundedCornerShape(20.dp))
            .border(2.dp, Color(0xD0EC853D), shape = RoundedCornerShape(20.dp))
    )

    Column(
        modifier = Modifier.fillMaxWidth()
            .padding(30.dp, 0.dp)
    ) {
        Button(
            onClick = {
                clicked = !clicked
            },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0x038D8780),
                contentColor = Color.Black
            )
        ) {
            Icon(
                imageVector =  if (!clicked) Icons.Outlined.FavoriteBorder else Icons.Filled.Favorite,
                contentDescription = "Like",
                modifier = Modifier
                    .width(20.dp)
                    .height(20.dp),
                tint = Color.Red

            )
        }

    }


}

@Composable
fun SocialApp(modifier: Modifier) {

    var messages: Int by rememberSaveable { mutableIntStateOf(5)}

    Column(
        modifier = modifier,
    ) {

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .padding(horizontal = 15.dp)
        ) {

            Row() {

                Image(
                    painter = painterResource(id = R.drawable.foto),
                    contentDescription = "Miguel",
                    modifier = Modifier
                        .height(60.dp)
                        .width(60.dp)
                        .clip(CircleShape)
                )

                Column(
                    modifier = Modifier.padding(horizontal = 10.dp)
                ) {
                    Text(
                        text = "Good Morning",
                        fontSize = 14.sp,
                        color = Color.Gray
                    )
                    Text(
                        text = "Miguel Zamit",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Black
                    )

                }

                var isClicked: Boolean by rememberSaveable { mutableStateOf(false) }
                Spacer(modifier = Modifier.width(30.dp))
                Button(
                    onClick = {
                        isClicked = !isClicked
                    },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0x038D8780),
                        contentColor = Color.LightGray
                    )

                ) {
                    Icon(
                        imageVector = if (!isClicked) Icons.Filled.PersonAdd else Icons.Filled.PersonRemove,
                        contentDescription = if (isClicked) "UnFollow" else "Follow",
                        modifier = Modifier
                            .height(30.dp)
                            .width(30.dp),
                        tint = Color(0xD0EC853D)

                    )
                }

                BadgedBox(
                    badge = {
                        Badge{
                            Text(text = "$messages")
                        }
                    },
                    modifier = Modifier.padding(12.dp)
                ) {
                    Icon(
                        imageVector = Icons.Filled.Mail,
                        contentDescription = "Mail",
                        tint = Color(0xD0EC853D)
                    )
                }

            }

            Column (){
                Spacer(modifier = Modifier.height(20.dp))
                Text(
                    text = "Hobbies",
                    fontWeight = FontWeight.Black
                )
                Column(
                    modifier = Modifier
                        .padding(20.dp, 10.dp)
                        .fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.spacedBy(5.dp)
                ) {
                    CustomIconRow(Icons.Filled.Groups, "Play with friends")
                    CustomIconRow(Icons.Filled.VideogameAsset, "Play videogames")
                    CustomIconRow(Icons.Filled.Flight, "Travel around the world")
                    CustomIconRow(Icons.Filled.DeveloperMode, "Develop applications")
                    CustomIconRow(Icons.Filled.Celebration, "Go to parties")
                }
            }

            Spacer(modifier = Modifier.height(10.dp))
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    ,
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                CustomImage(R.drawable.sam_sulek)
                CustomImage(R.drawable.cbum)
            }

            Column (
                modifier = Modifier.fillMaxWidth()
                    .padding(0.dp, 20.dp)
                    .clip(shape = RoundedCornerShape(20.dp))
                    .background(Color(0x2567645F))
                    ,
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Button(
                    onClick = {
                        ++messages
                    },
                    modifier = Modifier
                        .padding(8.dp) // Aqui es importante el orden
                        .width(58.dp)
                        .height(54.dp)
                        .border(2.dp, Color(0xD0EC853D), shape = CircleShape)
                        ,
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.White,
                        contentColor = Color(0xD0EC853D)
                    ),
                ) {
                    Text(
                        text = "+",
                        fontSize = 20.sp
                    )
                }
            }

        }

    }

}
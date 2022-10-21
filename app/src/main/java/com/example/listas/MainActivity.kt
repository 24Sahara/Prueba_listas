package com.example.listas

import android.content.Intent
import android.graphics.fonts.FontStyle
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.DrawableRes
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.listas.ui.theme.ListasTheme
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material.*
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Componentes()

        }
    }
}


@Composable
fun Componentes() {
    Box(
        modifier = Modifier
            .padding(20.dp, 20.dp)
            .border(
                border = BorderStroke(1.dp, color = Color.Black),
                shape = CutCornerShape(5.dp)
            )
    )
    {
        Box(modifier = Modifier
            .padding(20.dp, 20.dp)
            .border(
                border = BorderStroke(1.dp, color = Color.Black),
                shape = CutCornerShape(5.dp)
            )) {
            Column(modifier = Modifier
                .align(Alignment.TopCenter)
                .padding(30.dp, 30.dp)) {
                Row(modifier = Modifier.padding(2.dp,2.dp), ) {
                    Image(painterResource(id = R.drawable.play)
                        , contentDescription = "imagen1")
                    //Spacer(modifier = Modifier.padding(5.dp))
                    Text(text = "Mis permisos")
                    //Spacer(modifier = Modifier.padding(1.dp))
                    Image(painterResource(id = R.drawable.mayorque)
                        , contentDescription = "imagen1")
                }

    Column(modifier = Modifier.padding(30.dp,50.dp),
        verticalArrangement = Arrangement.Bottom) {
    Row() {
        Image(painterResource(id = R.drawable.pause)
            , contentDescription = "imagen2",)
        Spacer(modifier = Modifier.padding(2.dp))
        Text(text = "Mis actividades")
        Spacer(modifier = Modifier.padding(1.dp))
        Image(painterResource(id = R.drawable.mayorque)
            , contentDescription = "imagen2")
    }
}
                Column() {
                    Row() {
                        Image(painterResource(id = R.drawable.stop)
                            , contentDescription = "imagen3")
                        Spacer(modifier = Modifier.padding(5.dp))
                        Text(text = "Mis permisos")
                        Spacer(modifier = Modifier.padding(1.dp))
                        Image(painterResource(id = R.drawable.mayorque)
                            , contentDescription = "imagen3")
                    }
                }



            }
        }
        Box(modifier = Modifier
            .padding(20.dp, 20.dp)
            .border(
                border = BorderStroke(1.dp, color = Color.Black),
                shape = CutCornerShape(5.dp)
            )
            .align(Alignment.Center)) {
            Column() {
                Row() {
                    Image(painterResource(id = R.drawable.imagen_1)
                        , contentDescription = "imagen1",modifier = Modifier
                                .size(80.dp))
                    Spacer(modifier = Modifier.padding(1.dp))
                    Column() {
                        Text(text = "Gina Laurence", fontSize = 4.em)
                        Text(text = "La perfección no es alcanzable, " +
                                "pero si perseguimos la perfección podemos conseguir la excelencia.",
                            modifier = Modifier.padding(5.dp),
                            textAlign = TextAlign.Justify,fontSize = 3.em)
                    }

                }
                Row() {
                    Image(painterResource(id = R.drawable.imagen_2)
                        , contentDescription = "imagen2",modifier = Modifier
                            .size(75.dp))
                    Spacer(modifier = Modifier.padding(1.dp))
                    Column() {
                        Text(text = "David Smith", fontSize = 4.em)
                        Text(text = "La perfección no es alcanzable, " +
                                "pero si perseguimos la perfección podemos conseguir la excelencia.",
                            modifier = Modifier.padding(5.dp),
                            textAlign = TextAlign.Justify,fontSize = 3.em)
                    }

                }

            }
        }
    }
}


@Preview(showSystemUi = true) //muestra una vista móvil
@Composable
fun vistaPrevia()
{
   Componentes()
}
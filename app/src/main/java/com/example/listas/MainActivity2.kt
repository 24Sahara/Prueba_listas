package com.example.listas

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import com.example.listas.ui.theme.ListasTheme

class MainActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Componentes2()

        }
    }
}
//material design icons para iconos
//flaticon
//hay que colocar de donde se toman las imágenes
@Composable
fun Componentes2()
{
    Box(modifier = Modifier
        .padding(10.dp, 10.dp)
        .border(
            border = BorderStroke(5.dp, color = Color.Blue),
            shape = CutCornerShape(10.dp)
        ))
    {
        Column(modifier = Modifier.padding(20.dp,30.dp)) {
         Text(
             text = "Tipos de vestimenta", fontWeight = FontWeight.Black,
             fontSize = 5.em, modifier = Modifier
                 .align(Alignment.CenterHorizontally)
                 .padding(10.dp))

            Row(modifier = Modifier
                .padding(20.dp, 80.dp)
                .border(
                    border = BorderStroke(1.dp, color = Color.LightGray),
                    shape = CutCornerShape(5.dp)
                )) {
                Column(modifier = Modifier.border(border = BorderStroke(2.dp, color = Color.LightGray),
                    shape = CutCornerShape(5.dp))) {
                    Image(
                        painterResource(id = R.drawable.traje),
                        "Mujer", alignment = Alignment.BottomCenter,
                        modifier = Modifier.size(150.dp,150.dp)
                    )
                    Text(text = "Traje Sastre",fontWeight = FontWeight.Black,
                    modifier = Modifier
                        .padding(5.dp)
                        .align(Alignment.CenterHorizontally))
                    Spacer(modifier = Modifier.padding(5.dp))

                    Row(modifier = Modifier.align(Alignment.CenterHorizontally))
                    {
                        Image(painterResource(id = R.drawable.hexagram),
                            "estrella")
                        Image(painterResource(id = R.drawable.hexagram),
                            "estrella")
                        Image(painterResource(id = R.drawable.hexagram),
                            "estrella")
                        Image(painterResource(id = R.drawable.hexagram),
                            "estrella")
                        Image(painterResource(id = R.drawable.hexagram),
                            "estrella")
                    }
                    Spacer(modifier = Modifier.padding(5.dp))
                    Text(text = "Estilo para un empleo",modifier = Modifier
                        .padding(5.dp)
                        .align(Alignment.CenterHorizontally))
                    Row(modifier = Modifier.align(Alignment.CenterHorizontally))
                    {
                        Image(painterResource(id = R.drawable.phone),
                            "telefono")
                        Spacer(modifier = Modifier.padding(10.dp))
                        Image(painterResource(id = R.drawable.email),
                            "mensaje")
                    }
                }
                Column(modifier = Modifier.border(border = BorderStroke(2.dp, color = Color.LightGray),
                    shape = CutCornerShape(5.dp))) {
                    Image(
                        painterResource(id = R.drawable.casual),
                        "Mujer", alignment = Alignment.BottomCenter,
                        modifier = Modifier.size(150.dp,150.dp),
                    )
                    Text(text = "Vestido Casual",fontWeight = FontWeight.Black,
                        modifier = Modifier
                            .padding(5.dp)
                            .align(Alignment.CenterHorizontally))
                    Spacer(modifier = Modifier.padding(5.dp))

                    Row(modifier = Modifier.align(Alignment.CenterHorizontally)) {
                        Image(painterResource(id = R.drawable.hexagram),
                            "estrella")
                        Image(painterResource(id = R.drawable.hexagram),
                            "estrella")
                        Image(painterResource(id = R.drawable.hexagram),
                            "estrella")
                        Image(painterResource(id = R.drawable.hexagram),
                            "estrella")
                        Image(painterResource(id = R.drawable.hexagram),
                            "estrella")
                    }
                    Spacer(modifier = Modifier.padding(5.dp))
                    Text(text = "Estilo para un paseo",modifier = Modifier
                        .padding(5.dp)
                        .align(Alignment.CenterHorizontally))

                    Row(modifier = Modifier.align(Alignment.CenterHorizontally))
                    {
                        Image(painterResource(id = R.drawable.phone),
                            "telefono")
                        Spacer(modifier = Modifier.padding(10.dp))
                        Image(painterResource(id = R.drawable.email),
                            "mensaje")
                    }
                }

            }
            Row(modifier = Modifier.align(Alignment.CenterHorizontally)) {
                boton()
            }

        }

    }


}
@Composable
fun boton()
{
    val contexto= LocalContext.current
    Button(
        colors = ButtonDefaults.buttonColors
            (backgroundColor = Color.Red),
        onClick = {

            //accion
            //llamar la otra ventana(intent)
            val nueva_ventana=Intent(contexto,MainActivity::class.java)
            contexto.startActivity(nueva_ventana)
        })
    {
        Text("Regresar",color=Color.DarkGray, fontSize = 5.em )
    }


}

@Preview(showSystemUi = true)
@Composable
fun vista() {
   Componentes2()
}
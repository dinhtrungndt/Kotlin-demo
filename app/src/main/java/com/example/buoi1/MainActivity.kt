package com.example.buoi1

import android.graphics.drawable.Icon
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Email
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.buoi1.ui.theme.Buoi1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Buoi1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Main()
                }
            }
        }
    }
}

// Cho copy nội dung
@Composable
fun  SelectableText(){
    SelectionContainer() {
        Text(text = "This text is selectable")
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Main(){
    Column(
        modifier = Modifier
            .background(color = Color(0xFF55E7DB))
            .fillMaxWidth()
            .fillMaxHeight()
    ) {
        Text(
            text = "Hello\n thử nghiệm nè",
            fontSize = 30.sp,
            fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.Bold,
            color = Color.Red,
            modifier = Modifier
                .padding(top = 30.dp, bottom = 30.dp)
                .align(alignment = Alignment.CenterHorizontally)
                .background(color = Color.Black)
                .padding(20.dp),
            textAlign = TextAlign.Center
        )
        Text(text = "Hello mn")

        TextField(
            value = "", onValueChange = {},
            modifier = Modifier.fillMaxWidth(),
            placeholder = { Text(text = "Nhập nè")},
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Phone
            ),
            leadingIcon = {
                Icon(imageVector = Icons.Outlined.Email, contentDescription = "")
            }
        )
        
        OutlinedTextField(
            value = "", onValueChange = {},
            label = { Text(text = "Nhập nè")},
            shape = RoundedCornerShape(20.dp)
            )
        
        Button(onClick = { /*TODO*/ },
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(Color.Red),
            shape = RoundedCornerShape(20.dp)
            ) {
            Text(text = "Click nè", fontSize = 30.sp)
        }

        OutlinedButton(onClick = { /*TODO*/ },
            border = BorderStroke(1.dp, Color.Red)
            ) {
            Text(text = "Click outline")
        }

        Image(painterResource(id = R.mipmap.logo), contentDescription = "" )



    }

    Row (
        modifier = Modifier.background(Color.Red)
            .fillMaxWidth()
            ){
        Text(text = "Hell")
        Text(text = "Hell")
        Text(text = "Hell")
    }
}

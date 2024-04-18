package com.example.part2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.part2.ui.theme.Part2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Part2Theme {
                // A surface container using the 'background' color from the theme


            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Art_space_app()
{
    var  prv = remember {
        mutableIntStateOf(1)
    }
    Scaffold (
        topBar = {
            CenterAlignedTopAppBar(
                title ={
                    Text(text = "Tokyo 東京 ")
                },
                colors = TopAppBarDefaults.smallTopAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.primary,
                    navigationIconContentColor = MaterialTheme.colorScheme.onSecondary,
                    actionIconContentColor = MaterialTheme.colorScheme.secondary
                )
            )

        }

    )

    {
            innerpadding ->
        Surface(
            modifier = Modifier
                .padding(innerpadding)
                .fillMaxSize()
                .background(MaterialTheme.colorScheme.background)
                .verticalScroll(rememberScrollState())
        ){
//Logic

        }
    }
}
@Composable
fun Layout(modifier: Modifier=Modifier)
{
//Layout
    Column ( horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center)
    {

    }
}
@Composable
fun Image()
{

}
@Composable
fun Description()
{

}
fun Buttons()
{

}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Part2Theme {

    }
}
package com.example.shoppingapp.presentation

import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.shoppingapp.R
import com.example.shoppingapp.presentation.utils.CustomTextField

@Preview(showBackground = true)
@Composable
fun LogInScreen() {
    val context = LocalContext.current
    var firstName by remember { mutableStateOf("") }
    var lastName by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var phone by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var confirmPassword by remember { mutableStateOf("") }

    Column(
        modifier =
            Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .windowInsetsPadding(WindowInsets.safeDrawing)

                .background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ) {
        Spacer(modifier = Modifier.weight(1f))
        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(
                imageVector = Icons.Default.Face,
                contentDescription = null,
                modifier = Modifier.size(40.dp)
                , tint = colorResource(R.color.yellow)

            )
            Text(
                text = "Welcome Back",
                fontSize = 30.sp,
                style = TextStyle(fontWeight = FontWeight.Bold),
                modifier = Modifier.padding(16.dp),
                color = colorResource(R.color.yellow)
            )
        }

        CustomTextField(
            value = email,
            onValueChange = { email = it },
            label = "Email",
            leadingIcon = Icons.Default.Email,
            modifier = Modifier
                .padding(top = 10.dp)
                .fillMaxWidth().padding(horizontal = 16.dp)
                .align(Alignment.Start),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
        )

        CustomTextField(
            value = password,
            onValueChange = { password = it },
            label = "Create Password",
            leadingIcon = Icons.Default.Lock,
            modifier = Modifier
                .padding(top = 10.dp)
                .fillMaxWidth().padding(horizontal = 16.dp)
                .align(Alignment.Start),
            visualTransformation = PasswordVisualTransformation(),
        )

        TextButton(onClick = { /*TODO*/ }, modifier = Modifier.align(Alignment.End)) {
            Text(
                text = "Forgot Password?",
                fontSize = 16.sp,
                color = Color.Gray,
                style = TextStyle(fontWeight = FontWeight.W500),
            )
            
        }

        Button(
            modifier = Modifier
                .padding(top = 40.dp)
                .fillMaxWidth().padding(horizontal = 16.dp)
                .align(Alignment.CenterHorizontally),
            shape = RoundedCornerShape(8.dp),
            colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.yellow)),
            onClick = {
                if (

                    email.isNotEmpty() &&

                    password.isNotEmpty()
                ) {
                        Toast.makeText(context, "Sign Up Successful", Toast.LENGTH_SHORT).show()
                    }
                 else {
                    Toast.makeText(context, "Please fill all the fields", Toast.LENGTH_SHORT).show()
                }
            },
        ) {
            Text(
                text = "Log In",
                fontSize = 18.sp,
                style = TextStyle(fontWeight = FontWeight.Bold),
                color = colorResource(id = R.color.white),
                modifier = Modifier.padding(5.dp),
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 18.dp).padding(horizontal = 16.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            HorizontalDivider(modifier = Modifier.weight(1f), thickness = 2.dp)
            Text(text = "OR", fontSize = 14.sp, modifier = Modifier.padding(horizontal = 8.dp))
            HorizontalDivider(modifier = Modifier.weight(1f), thickness = 2.dp)
        }
        OutlinedButton(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .fillMaxWidth().padding(horizontal = 16.dp)
                .align(Alignment.CenterHorizontally),
            shape = RoundedCornerShape(8.dp),
            border = BorderStroke(2.dp, colorResource(R.color.yellow)),
        ) {
            Image(
                painter = painterResource(R.drawable.google),
                contentDescription = null,
                modifier = Modifier.size(24.dp),
            )
            Spacer(modifier = Modifier.size(8.dp))
            Text(
                text = "Log In with Google",
                fontSize = 18.sp,
                style = TextStyle(fontWeight = FontWeight.Bold),
                color = colorResource(id = R.color.yellow),
                modifier = Modifier.padding(5.dp),
            )
        }
        Spacer(modifier = Modifier.weight(1f))
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(
                text = "Don't have an account?",
                fontSize = 16.sp,
            )
            TextButton(
                onClick = {},
            ) {
                Text(
                    text = "SignUp",
                    fontSize = 16.sp,
                    color = colorResource(id = R.color.yellow),
                    style = TextStyle(fontWeight = FontWeight.Bold),
                )
            }
        }
    }
}

package com.example.shoppingapp.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.shoppingapp.presentation.utils.CustomTextField

@Preview(showBackground = true)
@Composable
fun SignUpScreen() {
  val context = LocalContext.current
  var firstName by remember { mutableStateOf("") }
  var lastName by remember { mutableStateOf("") }
  var email by remember { mutableStateOf("") }
  var phone by remember { mutableStateOf("") }
  var password by remember { mutableStateOf("") }
  var confirmPassword by remember { mutableStateOf("") }

  Column(
      modifier = Modifier.fillMaxSize()
          .windowInsetsPadding(WindowInsets.safeDrawing).background(MaterialTheme.colorScheme.surfaceBright),
      horizontalAlignment = Alignment.CenterHorizontally,
  ) {
    Text(
        text = "Sign Up",
        fontSize = 30.sp,
        style = TextStyle(fontWeight = FontWeight.Bold),
        modifier = Modifier.padding(16.dp),
    )
      CustomTextField(
        value = firstName,
        onValueChange = { firstName=it },
        label =  "First Name",
        leadingIcon = Icons.Default.Person,
        modifier = Modifier.padding(16.dp).fillMaxWidth().align(Alignment.Start),
    )
      CustomTextField(
        value = lastName,
        onValueChange = { lastName=it },
        label =  "Last Name",
        leadingIcon =Icons.Default.Person,
        modifier = Modifier.padding(16.dp).fillMaxWidth().align(Alignment.Start),
    )
      CustomTextField(
        value = email,
        onValueChange = { email=it },
        label = "Email",
        leadingIcon =  Icons.Default.Email,
        modifier = Modifier.padding(16.dp).fillMaxWidth().align(Alignment.Start),
    )
      CustomTextField(
        value = phone,
        onValueChange = { phone=it },
        label = "Phone Number",
        prefix = "+91",
        leadingIcon =  Icons.Default.Phone,
        modifier = Modifier.padding(16.dp).fillMaxWidth().align(Alignment.Start),
    )
      CustomTextField(
        value = password,
        onValueChange = { password=it },
        label =  "Password",
        leadingIcon =  Icons.Default.Lock,
        modifier = Modifier.padding(16.dp).fillMaxWidth().align(Alignment.Start),
    )
      CustomTextField(
        value = confirmPassword,
        onValueChange = { confirmPassword=it },
        label = "Confirm Password",
        leadingIcon =  Icons.Default.Lock,
        modifier = Modifier.padding(16.dp).fillMaxWidth().align(Alignment.Start),
    )
  }
}

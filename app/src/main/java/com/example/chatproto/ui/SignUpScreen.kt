package com.example.chatproto.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.chatproto.ui.theme.ChatProtoTheme


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SignUpScreen(
    viewModel: SignUpViewModel = viewModel()
) {
    Column(
        modifier = Modifier.padding(8.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        //Login field
        OutlinedTextField(
            singleLine = true,
            label = { Text(text = "Login") },
            modifier = Modifier.padding(bottom = 8.dp),
            value = viewModel.username.value,
            onValueChange = { username -> viewModel.updateUsername(username)}
        )

        //Password field
        OutlinedTextField(
            modifier = Modifier.padding(bottom = 8.dp),
            singleLine = true,
            label = { Text(text = "Password") },
            value = viewModel.password.value,
            onValueChange = { password -> viewModel.updatePassword(password)},
            visualTransformation = PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
        )
        Button(
            onClick = { viewModel.onEnterClicked() },
            content = { Text(text = "Enter")}
        )
        
    }



}

@Preview(showBackground = true)
@Composable
fun SignUpPreview() {
    ChatProtoTheme {
        SignUpScreen()
    }
}
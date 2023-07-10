package com.example.chatproto.ui

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class SignUpViewModel : ViewModel() {

    private val _username: MutableState<String> = mutableStateOf("")
    val username: State<String> = _username



    private val _password: MutableState<String> = mutableStateOf("")
    val password: State<String> = _password

    fun updateUsername(input: String) {
        _username.value = input
    }

    fun updatePassword(input: String) {
        _password.value = input
    }

    fun onEnterClicked(){}
}
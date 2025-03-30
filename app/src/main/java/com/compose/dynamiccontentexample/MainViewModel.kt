package com.compose.dynamiccontentexample

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {
    val textFieldState : MutableLiveData<String> = MutableLiveData()

    fun onTextChanged(newText: String) {
        textFieldState.value = newText
    }
}
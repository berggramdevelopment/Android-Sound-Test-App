package com.zoundio.sound.testapp

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel(txt: String) : ViewModel() {
    val text = MutableLiveData<String>().apply { value = txt }
}
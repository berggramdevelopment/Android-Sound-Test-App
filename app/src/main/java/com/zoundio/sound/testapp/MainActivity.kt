package com.zoundio.sound.testapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zoundio.sound.testapp.databinding.ActivityMainBinding
import com.zoundio.sound.testapp.utils.getViewModel

class MainActivity : AppCompatActivity() {

    private val vm by lazy { getViewModel { MainViewModel("Welcome to Amped Sound Test App!") } }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(ActivityMainBinding.inflate(layoutInflater).apply { viewModel = vm }.root)
    }
}

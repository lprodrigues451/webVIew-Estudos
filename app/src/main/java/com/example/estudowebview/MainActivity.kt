package com.example.estudowebview

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import com.example.estudowebview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        webViewConfig()
    }

    @SuppressLint("SetJavaScriptEnabled")
    private fun webViewConfig(){
        val webView = binding.webView

        webView.webViewClient = WebViewClient() // Acessa outra coisa da pagina sem sair do app.
        webView.settings.javaScriptEnabled = true // se a pagina da web usa JavaScript.
        webView.loadUrl("https://developer.android.com/?hl=pt-br")
    }
}
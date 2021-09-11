package com.example.fabricspot
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private val web: WebView = findViewById(R.id.web)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        try {
            this.supportActionBar!!.hide()
        } catch (e: NullPointerException) {
        }

        web.settings.javaScriptEnabled = true;
        web.webViewClient = WebViewClient()
        web.loadUrl("https://www.fabricspot.pk")
    }
    override fun onBackPressed() {
        if (web.canGoBack()) {
            web.goBack();
        } else {
            super.onBackPressed();
        }
        super.onBackPressed()
    }
}
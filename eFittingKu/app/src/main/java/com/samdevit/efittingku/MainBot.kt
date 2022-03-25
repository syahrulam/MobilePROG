package com.samdevit.efittingku

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.webkit.WebView
import android.webkit.WebViewClient

class MainBot : AppCompatActivity() {
    private var webView: WebView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_bot)
//        membuat full screen
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        webView = findViewById(R.id.wV1)
        webView!!.webViewClient = WebViewClient()
        webView!!.loadUrl("https://quick-wombat-3.loca.lt/")
        var webSettings = webView!!.settings
        webSettings.javaScriptEnabled = true
        webSettings.domStorageEnabled = true
    }

    override fun onBackPressed() {
        if (webView!!.canGoBack()){
            webView!!.goBack()
        } else{
            super.onBackPressed()
        }
    }
}

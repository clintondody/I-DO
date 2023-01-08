package kampus.merdeka.I.Do.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class Web_View1_Activity : AppCompatActivity() {

    lateinit var webview: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view1)

        lighStatusBar(window)

        webview = findViewById(R.id.webview1)
        webview.webViewClient = WebViewClient()
        webview.loadUrl("https://berbagicerita.id/web/")

        val webSettings = webview.settings

        webSettings.javaScriptEnabled = true

        webSettings.domStorageEnabled = true
    }
}
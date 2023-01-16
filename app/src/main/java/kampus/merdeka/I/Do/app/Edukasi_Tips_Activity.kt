package kampus.merdeka.I.Do.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class Edukasi_Tips_Activity : AppCompatActivity() {

    lateinit var webview : WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edukasi_tips)

        lighStatusBar(window)

        webview = findViewById(R.id.webviewtips)
        webview.webViewClient = WebViewClient()
        webview.loadUrl("https://www.youtube.com/watch?v=gf7l8L02E7I&t=13s")

        webview = findViewById(R.id.webviewtips2)
        webview.webViewClient = WebViewClient()
        webview.loadUrl("https://www.youtube.com/watch?v=j3CMaibDMl0")

        val webSettings = webview.settings

        webSettings.javaScriptEnabled = true

        webSettings.domStorageEnabled = true

    }
}
package kampus.merdeka.I.Do.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class yt1_Activity : AppCompatActivity() {
    lateinit var webyt1 : WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_yt1)

        lighStatusBar(window)

        webyt1 = findViewById(R.id.yt1)
        webyt1.webViewClient = WebViewClient()
        webyt1.loadUrl("https://www.youtube.com/watch?v=gf7l8L02E7I&t=2s")

        val webSettings = webyt1.settings

        webSettings.javaScriptEnabled = true

        webSettings.domStorageEnabled = true
    }
}
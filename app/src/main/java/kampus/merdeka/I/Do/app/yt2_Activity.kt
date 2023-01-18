package kampus.merdeka.I.Do.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class yt2_Activity : AppCompatActivity() {
    lateinit var webyt : WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_yt2)

        lighStatusBar(window)

        webyt = findViewById(R.id.yt2)
        webyt.webViewClient = WebViewClient()
        webyt.loadUrl("https://www.youtube.com/watch?v=j3CMaibDMl0&t=29s")

        val webSettings = webyt.settings

        webSettings.javaScriptEnabled = true

        webSettings.domStorageEnabled = true
    }
}
package kampus.merdeka.I.Do.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class berita_klik_2_Activity : AppCompatActivity() {

    lateinit var webviewberita2 : WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_berita_klik2)

        lighStatusBar(window)

        webviewberita2 = findViewById(R.id.webviewberita2)
        webviewberita2.webViewClient = WebViewClient()
        webviewberita2.loadUrl("https://health.detik.com/berita-detikhealth/d-6000299/ini-yang-sering-dialami-perokok-saat-ingin-berhenti-merokok")

        val webSettings = webviewberita2.settings

        webSettings.javaScriptEnabled = true

        webSettings.domStorageEnabled = true
    }
}
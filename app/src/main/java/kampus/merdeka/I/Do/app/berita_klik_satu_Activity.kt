package kampus.merdeka.I.Do.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.ImageView


class berita_klik_satu_Activity : AppCompatActivity() {

    lateinit var webviewberita : WebView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_berita_klik_satu)

        lighStatusBar(window)

        webviewberita = findViewById(R.id.webviewberita)
        webviewberita.webViewClient = WebViewClient()
        webviewberita.loadUrl("https://www.cnnindonesia.com/gaya-hidup/20181031124444-255-342883/yang-terjadi-pada-tubuh-ketika-berhenti-merokok")

        val webSettings = webviewberita.settings

        webSettings.javaScriptEnabled = true

        webSettings.domStorageEnabled = true


    }
}
package kampus.merdeka.I.Do.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class berita_klik3_Activity : AppCompatActivity() {
    lateinit var webviewberita3 : WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_berita_klik3)

        lighStatusBar(window)

        webviewberita3 = findViewById(R.id.webviewberita2)
        webviewberita3.webViewClient = WebViewClient()
        webviewberita3.loadUrl("https://www.cnnindonesia.com/gaya-hidup/20150531094612-255-56771/18-persen-pelajar-indonesia-sudah-jadi-pecandu-rokok")

        val webSettings = webviewberita3.settings

        webSettings.javaScriptEnabled = true

        webSettings.domStorageEnabled = true
    }
}
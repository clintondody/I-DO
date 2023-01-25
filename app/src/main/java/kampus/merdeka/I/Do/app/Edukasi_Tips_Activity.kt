package kampus.merdeka.I.Do.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import kampus.merdeka.I.Do.app.databinding.ActivityTambahPlanBinding

class Edukasi_Tips_Activity : AppCompatActivity() {



    lateinit var webview : WebView

    var yt1 : ImageView? = null
    var yt2 : ImageView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edukasi_tips)

        lighStatusBar(window)

        yt1 = findViewById(R.id.yt1)

        yt1?.setOnClickListener {
            startActivity(Intent(this@Edukasi_Tips_Activity, yt1_Activity::class.java))
        }
        yt2 = findViewById(R.id.yt2)

        yt2?.setOnClickListener {
            startActivity(Intent(this@Edukasi_Tips_Activity, yt2_Activity::class.java))
        }



    }

}
package kampus.merdeka.I.Do.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class Layanan_Activity : AppCompatActivity() {

    var layananiv1 : ImageView? = null
    var layanantv1 : TextView? = null
    var layanantv11 : TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_layanan)

        lighStatusBar(window)

        layananiv1 = findViewById(R.id.Iv_layanan1)
        layanantv1 = findViewById(R.id.tv_layanan1)
        layanantv11 = findViewById(R.id.tv_layanan1_1)

        layananiv1?.setOnClickListener {
            startActivity(Intent(this@Layanan_Activity, Web_View1_Activity::class.java))
        }
        layanantv1?.setOnClickListener {
            startActivity(Intent(this@Layanan_Activity, Web_View1_Activity::class.java))
        }
        layanantv11?.setOnClickListener {
            startActivity(Intent(this@Layanan_Activity, Web_View1_Activity::class.java))
        }
    }
}
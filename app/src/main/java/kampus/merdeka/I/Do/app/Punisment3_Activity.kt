package kampus.merdeka.I.Do.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.cardview.widget.CardView

class Punisment3_Activity : AppCompatActivity() {
    var selesaipunisment : CardView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_punisment3)

        lighStatusBar(window)

        selesaipunisment = findViewById(R.id.bt_selesai)

        selesaipunisment?.setOnClickListener {
            startActivity(Intent(this@Punisment3_Activity, HomeActivity::class.java))
        }
    }
}
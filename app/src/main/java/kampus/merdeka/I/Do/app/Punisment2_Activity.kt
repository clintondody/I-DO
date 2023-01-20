package kampus.merdeka.I.Do.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.cardview.widget.CardView

class Punisment2_Activity : AppCompatActivity() {
    var progrespunisment : ImageView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_punisment2)

        lighStatusBar(window)

        progrespunisment = findViewById(R.id.progres)

        progrespunisment?.setOnClickListener {
            startActivity(Intent(this@Punisment2_Activity, Punisment3_Activity::class.java))
        }
    }
}
package kampus.merdeka.I.Do.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.cardview.widget.CardView

class Punisment1_Activity : AppCompatActivity() {

    var mulaipunismant : CardView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_punisment1)

        lighStatusBar(window)

        mulaipunismant = findViewById(R.id.bt_mulai_punismant)

        mulaipunismant?.setOnClickListener {
            startActivity(Intent(this@Punisment1_Activity, Punisment2_Activity::class.java))
        }
    }
}
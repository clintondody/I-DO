package kampus.merdeka.I.Do.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.cardview.widget.CardView

class detail_plan2_Activity : AppCompatActivity() {
    var isinyawa : Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_plan2)

        lighStatusBar(window)

        isinyawa = findViewById(R.id.bt_isinyawa)

        isinyawa?.setOnClickListener {
            startActivity(Intent(this@detail_plan2_Activity, Punisment1_Activity::class.java))
        }
    }
}
package kampus.merdeka.I.Do.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.cardview.widget.CardView

class Edit_profile_Activity : AppCompatActivity() {

    var simpanprofile : CardView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_profile)

        lighStatusBar(window)

        simpanprofile = findViewById(R.id.simpan_profile)

        simpanprofile?.setOnClickListener {
            startActivity(Intent(this@Edit_profile_Activity, Setting_Activity::class.java))
        }
    }
}
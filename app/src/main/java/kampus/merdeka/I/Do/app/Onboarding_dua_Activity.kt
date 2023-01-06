package kampus.merdeka.I.Do.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class Onboarding_dua_Activity : AppCompatActivity() {
    var next2: ImageView? = null
    var skip : TextView? = null
    var prev : ImageView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding_dua)

        next2 = findViewById(R.id.next2)
        skip = findViewById(R.id.btn_skip2)
        prev = findViewById(R.id.btn_prev2)

        next2?.setOnClickListener {
            startActivity(Intent(this@Onboarding_dua_Activity, Onboarding_tiga_Activity::class.java))
        }
        skip?.setOnClickListener {
            startActivity(Intent(this@Onboarding_dua_Activity, login_Activity::class.java))
        }
        prev?.setOnClickListener {
            startActivity(Intent(this@Onboarding_dua_Activity, Onboarding_satu_Activity::class.java))
        }
    }
}
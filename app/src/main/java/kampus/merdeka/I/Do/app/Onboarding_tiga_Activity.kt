package kampus.merdeka.I.Do.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class Onboarding_tiga_Activity : AppCompatActivity() {

    var btn_mulai: Button? = null
    var prev : ImageView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding_tiga)

        btn_mulai = findViewById(R.id.btn_mulai)
        prev = findViewById(R.id.btn_prev3)

        btn_mulai?.setOnClickListener {
            startActivity(Intent(this@Onboarding_tiga_Activity, login_Activity::class.java))
        }
        prev?.setOnClickListener {
            startActivity(Intent(this@Onboarding_tiga_Activity, Onboarding_dua_Activity::class.java))
        }
    }


}
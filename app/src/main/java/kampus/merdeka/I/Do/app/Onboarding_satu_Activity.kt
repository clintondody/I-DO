package kampus.merdeka.I.Do.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import kampus.merdeka.I.Do.app.R.id.next1
import kampus.merdeka.I.Do.app.R.id.btn_skip

class Onboarding_satu_Activity : AppCompatActivity() {

    var next1: ImageView? = null
    var skip : TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding_satu)

        next1 = findViewById(R.id.next1)
        skip = findViewById(R.id.btn_skip)

        next1?.setOnClickListener {
            startActivity(Intent(this@Onboarding_satu_Activity, Onboarding_dua_Activity::class.java))
        }
        skip?.setOnClickListener {
            startActivity(Intent(this@Onboarding_satu_Activity, login_Activity::class.java))
        }
    }
}



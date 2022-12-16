package kampus.merdeka.I.Do.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Onboarding_satu_Activity : AppCompatActivity() {

    var next1: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding_satu)

        next1 = findViewById(R.id.next1)

        next1?.setOnClickListener {
            startActivity(Intent(this@Onboarding_satu_Activity, Onboarding_dua_Activity::class.java))
        }
    }
}



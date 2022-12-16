package kampus.merdeka.I.Do.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Onboarding_tiga_Activity : AppCompatActivity() {

    var btn_mulai: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding_tiga)

        btn_mulai = findViewById(R.id.btn_mulai)

        btn_mulai?.setOnClickListener {
            startActivity(Intent(this@Onboarding_tiga_Activity, HomeActivity::class.java))
        }
    }


}
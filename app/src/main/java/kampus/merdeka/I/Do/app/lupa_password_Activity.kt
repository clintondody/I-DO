package kampus.merdeka.I.Do.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class lupa_password_Activity : AppCompatActivity() {
    var kirim_email : TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lupa_password)

        kirim_email = findViewById(R.id.tv_kirim_email)

        kirim_email?.setOnClickListener {
            startActivity(Intent(this@lupa_password_Activity, otp_Activity::class.java))
        }
    }
}
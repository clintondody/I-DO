package kampus.merdeka.I.Do.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class otp_Activity : AppCompatActivity() {
    var verifikasi : TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_otp)

        verifikasi = findViewById(R.id.tv_verifikasi)

        verifikasi?.setOnClickListener {
            startActivity(Intent(this@otp_Activity, otp_sukses_Activity::class.java))
        }

    }
}
package kampus.merdeka.I.Do.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class otp_Activity : AppCompatActivity() {
    var verifikasi : Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_otp)


        lighStatusBar(window)

        verifikasi = findViewById(R.id.bt_verivikasi)

        verifikasi?.setOnClickListener {
            startActivity(Intent(this@otp_Activity, otp_sukses_Activity::class.java))
        }

    }
}
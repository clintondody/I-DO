package kampus.merdeka.I.Do.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class otp_sukses_Activity : AppCompatActivity() {
    var kembali : TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_otp_sukses)

        kembali = findViewById(R.id.tv_kembali)

        kembali?.setOnClickListener {
            startActivity(Intent(this@otp_sukses_Activity, login_Activity::class.java))
        }
    }
}
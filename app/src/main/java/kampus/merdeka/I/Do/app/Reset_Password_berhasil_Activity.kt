package kampus.merdeka.I.Do.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class Reset_Password_berhasil_Activity : AppCompatActivity() {
    var ok : Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reset_password_berhasil)
        lighStatusBar(window)

        ok = findViewById(R.id.btn_ok)

        ok?.setOnClickListener {
            startActivity(Intent(this@Reset_Password_berhasil_Activity, Setting_Activity::class.java))
        }
    }
}
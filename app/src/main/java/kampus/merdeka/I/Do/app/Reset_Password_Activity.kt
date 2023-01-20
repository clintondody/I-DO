package kampus.merdeka.I.Do.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Reset_Password_Activity : AppCompatActivity() {
    var reset : Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reset_password)

        lighStatusBar(window)

        reset = findViewById(R.id.bt_reset)

        reset?.setOnClickListener {
            startActivity(Intent(this@Reset_Password_Activity, Reset_Password_berhasil_Activity::class.java))
        }
    }
}
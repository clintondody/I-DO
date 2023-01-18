package kampus.merdeka.I.Do.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Register_Berhasil_Activity : AppCompatActivity() {

    var berhasil : Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_berhasil)

        lighStatusBar(window)

        berhasil = findViewById(R.id.btn_reg_berhasil)

        berhasil?.setOnClickListener {
            startActivity(Intent(this@Register_Berhasil_Activity, login_Activity::class.java))
        }
    }
}
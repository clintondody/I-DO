package kampus.merdeka.I.Do.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

class register_Activity : AppCompatActivity() {

    var daftar_akun : Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)


        lighStatusBar(window)

        daftar_akun = findViewById(R.id.btn_daftar)

        daftar_akun?.setOnClickListener {
            startActivity(Intent(this@register_Activity, Register_Berhasil_Activity::class.java))
        }

    }
}
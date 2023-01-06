package kampus.merdeka.I.Do.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import kotlin.math.tan

class login_Activity : AppCompatActivity() {

    var lupa_password : TextView? = null
    var login : Button? = null
    var daftar : TextView? = null
    var tanpa_login : TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)



        lupa_password = findViewById(R.id.tv_lupapw)
        login = findViewById(R.id.btn_login)
        daftar = findViewById(R.id.tv_daftar)
        tanpa_login = findViewById(R.id.tv_tanpa_login)

        lupa_password?.setOnClickListener {
            startActivity(Intent(this@login_Activity, lupa_password_Activity::class.java))
        }

        login?.setOnClickListener {
            startActivity(Intent(this@login_Activity, HomeActivity::class.java))
        }
        daftar?.setOnClickListener {
            startActivity(Intent(this@login_Activity, register_Activity::class.java))
        }

        tanpa_login?.setOnClickListener {
            startActivity(Intent(this@login_Activity, HomeActivity::class.java))
        }
    }
}
package kampus.merdeka.I.Do.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.cardview.widget.CardView

class Setting_Activity : AppCompatActivity() {

    var reset_password : CardView? = null
    var kebijakan_privasi : TextView? = null
    var ubahprofile : TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_setting)


        lighStatusBar(window)

        reset_password = findViewById(R.id.risetpassword)
        ubahprofile = findViewById(R.id.ubah_profile)
        kebijakan_privasi = findViewById(R.id.TV_kebijakan_privasi)

        kebijakan_privasi?.setOnClickListener {
            startActivity(Intent(this@Setting_Activity, Privacy_Policy_Activity::class.java))
        }
        reset_password?.setOnClickListener {
            startActivity(Intent(this@Setting_Activity, Reset_Password_Activity::class.java))
        }
        ubahprofile?.setOnClickListener {
            startActivity(Intent(this@Setting_Activity, Edit_profile_Activity::class.java))
        }




        val btnAlerts = findViewById<TextView>(R.id.bt_keluar)

        btnAlerts.setOnClickListener {
            val builder = AlertDialog.Builder(this@Setting_Activity)
                .create()
            val view = View.inflate(this@Setting_Activity,R.layout.costum_view_layout,null)
            val  imageView = view.findViewById<TextView>(R.id.keluar)
            builder.setView(view)

            imageView.setOnClickListener {
                builder.dismiss()
            }
            builder.setCanceledOnTouchOutside(false)
            builder.show()
            view.findViewById<TextView>(R.id.btn_Ya).setOnClickListener {
                startActivity(Intent(this@Setting_Activity,login_Activity::class.java))
            }
            view.findViewById<TextView>(R.id.batal).setOnClickListener {
                startActivity(Intent(this@Setting_Activity,Setting_Activity::class.java))
            }
        }
    }
}
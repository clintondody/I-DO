package kampus.merdeka.I.Do.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AlertDialog

class register_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)


        lighStatusBar(window)


        val btnAlerts = findViewById<Button>(R.id.btn_daftar_akun)

        btnAlerts.setOnClickListener {
            val builder = AlertDialog.Builder(this@register_Activity)
                .create()
            val view = View.inflate(this@register_Activity,R.layout.costum_view_layout,null)
            val  imageView = view.findViewById<ImageView>(R.id.img_succes)
            builder.setView(view)

            imageView.setOnClickListener {
                builder.dismiss()
            }
            builder.setCanceledOnTouchOutside(false)
            builder.show()
            view.findViewById<Button>(R.id.btn_ok).setOnClickListener {
                startActivity(Intent(this@register_Activity,login_Activity::class.java))
            }
        }
    }
}
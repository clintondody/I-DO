package kampus.merdeka.I.Do.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Reset_Password_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reset_password)

        lighStatusBar(window)
    }
}
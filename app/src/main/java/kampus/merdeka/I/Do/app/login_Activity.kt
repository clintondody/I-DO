package kampus.merdeka.I.Do.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import kampus.merdeka.I.Do.app.databinding.ActivityLoginBinding
import kotlin.math.tan

class login_Activity : AppCompatActivity() {

    var lupa_password : TextView? = null
    var daftar : TextView? = null
    var tanpa_login : TextView? = null
    lateinit var auth : FirebaseAuth
    lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityLoginBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        lighStatusBar(window)
        auth = FirebaseAuth.getInstance()

        lupa_password = findViewById(R.id.tv_lupapw)

        daftar = findViewById(R.id.tv_daftar)
        tanpa_login = findViewById(R.id.tv_tanpa_login)

        lupa_password?.setOnClickListener {
            startActivity(Intent(this@login_Activity, lupa_password_Activity::class.java))
        }


        daftar?.setOnClickListener {
            startActivity(Intent(this@login_Activity, register_Activity::class.java))
        }

        tanpa_login?.setOnClickListener {
            startActivity(Intent(this@login_Activity, HomeActivity::class.java))
        }


        binding.btlogin.setOnClickListener{
            val email = binding.emailLogin.text.toString()
            val password = binding.passwordLogin.text.toString()


            if (email.isEmpty()){
                binding.emailLogin.error = "Email Wajib Diisi"
                binding.emailLogin.requestFocus()
                return@setOnClickListener
            }

            if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
                binding.emailLogin.error = "Email Tidak Valid"
                binding.emailLogin.requestFocus()
                return@setOnClickListener
            }

            if (password.isEmpty()){
                binding.passwordLogin.error = "Password Wajib Diisi"
                binding.passwordLogin.requestFocus()
                return@setOnClickListener
            }


            LoginFirebase(email,password)
        }

    }

    private fun LoginFirebase(email: String, password: String) {
        auth.signInWithEmailAndPassword(email,password)
            .addOnCompleteListener(this){
                if (it.isSuccessful){
                    Toast.makeText(this, "Selamat datang $email", Toast.LENGTH_SHORT).show()
                    val intent = Intent (this,HomeActivity::class.java)
                    startActivity(intent)
                } else{
                    Toast.makeText(this,"${it.exception?.message}", Toast.LENGTH_SHORT).show()
                }
            }
    }


    override fun onBackPressed() {
        super.onBackPressed()
        moveTaskToBack(true)
        finish()
    }
}
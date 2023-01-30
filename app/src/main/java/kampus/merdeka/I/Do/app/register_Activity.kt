package kampus.merdeka.I.Do.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.google.firebase.auth.FirebaseAuth
import kampus.merdeka.I.Do.app.databinding.ActivityRegisterBinding
import java.util.regex.Pattern

class register_Activity : AppCompatActivity() {

    lateinit var auth: FirebaseAuth
    lateinit var binding: ActivityRegisterBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        lighStatusBar(window)

        auth = FirebaseAuth.getInstance()


        binding.btnDaftar.setOnClickListener{
            val email = binding.editEmailRegister.text.toString()
            val password = binding.passwordRegister.text.toString()


            if (email.isEmpty()){
                binding.editEmailRegister.error = "Email Wajib Diisi"
                binding.editEmailRegister.requestFocus()
                return@setOnClickListener
            }

            if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
                binding.editEmailRegister.error = "Email Tidak Valid"
                binding.editEmailRegister.requestFocus()
                return@setOnClickListener
            }

            if (password.isEmpty()){
                binding.passwordRegister.error = "Password Wajib Diisi"
                binding.passwordRegister.requestFocus()
                return@setOnClickListener
            }



            if (password.length < 8){
                binding.passwordRegister.error = "Password Minimal 8 Karakter"
                binding.passwordRegister.requestFocus()
                return@setOnClickListener
            }


            RegisterFirebase(email,password)
        }



    }

    private fun RegisterFirebase(email: String, password: String) {
        auth.createUserWithEmailAndPassword(email,password)
            .addOnCompleteListener(this){
                if (it.isSuccessful){
                    Toast.makeText(this, "Regiater Berhasil", Toast.LENGTH_SHORT).show()
                    val intent = Intent (this,Register_Berhasil_Activity::class.java)
                    startActivity(intent)
                } else{
                    Toast.makeText(this,"${it.exception?.message}", Toast.LENGTH_SHORT).show()
                }
            }
    }
}
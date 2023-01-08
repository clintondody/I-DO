package kampus.merdeka.I.Do.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Button
import android.widget.TextView
import androidx.core.content.ContentProviderCompat.requireContext
import kampus.merdeka.I.Do.app.databinding.ActivityBeritaKlikSatuBinding.inflate
import kampus.merdeka.I.Do.app.databinding.ActivityHomeBinding
import kampus.merdeka.I.Do.app.databinding.ActivityTambahPlanBinding

class tambah_plan_Activity : AppCompatActivity() {

    private lateinit var binding: ActivityTambahPlanBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTambahPlanBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val jenisadiksi = resources.getStringArray(R.array.jenis_adiksi)
        val arrayAdapter = ArrayAdapter(this, R.layout.list_item, jenisadiksi)
        binding.autoComplateText.setAdapter(arrayAdapter)

        lighStatusBar(window)


        val btnmulaiplan : TextView = findViewById(R.id.btn_mulai_plan)
        btnmulaiplan.setOnClickListener {
            val btnmulai = Intent(this@tambah_plan_Activity, HomeActivity::class.java)
            startActivity(btnmulai)
        }



    }
}
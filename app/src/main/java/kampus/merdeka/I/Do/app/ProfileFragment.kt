package kampus.merdeka.I.Do.app

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

class ProfileFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profile, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val setting: ImageView = view.findViewById(R.id.btn_setting)
        setting.setOnClickListener {
            val bt_setting = Intent(this@ProfileFragment.activity, Setting_Activity::class.java)
            startActivity(bt_setting)
        }

        val layanan: ImageView = view.findViewById(R.id.Iv_layanan2)
        layanan.setOnClickListener {
            val layanann = Intent(this@ProfileFragment.activity, Layanan_Activity::class.java)
            startActivity(layanann)
        }

        val layanan2: TextView = view.findViewById(R.id.tv_layanan2)
        layanan2.setOnClickListener {
            val layanann2 = Intent(this@ProfileFragment.activity, Layanan_Activity::class.java)
            startActivity(layanann2)
        }
    }

}
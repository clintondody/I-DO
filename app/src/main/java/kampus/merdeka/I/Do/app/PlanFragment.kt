package kampus.merdeka.I.Do.app

import android.os.Bundle
import android.content.Intent
import android.text.Layout
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView


class PlanFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_plan, container, false)


    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val btntambahplan: ImageView = view.findViewById(R.id.btn_fab)
        btntambahplan.setOnClickListener {
            val btnArtikel = Intent(this@PlanFragment.activity, tambah_plan_Activity::class.java)
            startActivity(btnArtikel)
        }

        val btnlayanan : TextView = view.findViewById(R.id.layanan)
        btnlayanan.setOnClickListener {
            val btn_layanan = Intent(this@PlanFragment.activity, Layanan_Activity::class.java)
            startActivity(btn_layanan)
        }

        val btnlihatdetail : TextView = view.findViewById(R.id.btn_detail)
        btnlihatdetail.setOnClickListener {
            val btndetail = Intent(this@PlanFragment.activity, detail_plan_Activity::class.java)
            startActivity(btndetail)
        }

    }
}
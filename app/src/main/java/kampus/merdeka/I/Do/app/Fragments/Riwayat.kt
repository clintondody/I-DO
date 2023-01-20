package kampus.merdeka.I.Do.app.Fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.cardview.widget.CardView
import kampus.merdeka.I.Do.app.R
import kampus.merdeka.I.Do.app.Riwayat_selesai_Activity
import kampus.merdeka.I.Do.app.detail_plan2_Activity


class Riwayat : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_riwayat, container, false)


    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val lihatriwayat: CardView = view.findViewById(R.id.lihatriwayat)
        lihatriwayat.setOnClickListener {
            val lihatriwayat = Intent(this@Riwayat.activity, Riwayat_selesai_Activity::class.java)
            startActivity(lihatriwayat)
        }
    }
}
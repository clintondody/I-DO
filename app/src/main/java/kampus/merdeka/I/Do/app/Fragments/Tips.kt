package kampus.merdeka.I.Do.app.Fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import kampus.merdeka.I.Do.app.R
import kampus.merdeka.I.Do.app.berita_klik3_Activity
import kampus.merdeka.I.Do.app.yt1_Activity
import kampus.merdeka.I.Do.app.yt2_Activity


class Tips : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tips, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val yt1: ImageView = view.findViewById(R.id.yt1)
        yt1.setOnClickListener {
            val yt1 = Intent(this@Tips.activity, yt1_Activity::class.java)
            startActivity(yt1)
        }

        val yt2: ImageView = view.findViewById(R.id.yt2)
        yt2.setOnClickListener {
            val yt2 = Intent(this@Tips.activity, yt2_Activity::class.java)
            startActivity(yt2)
        }
    }
}

package kampus.merdeka.I.Do.app.Fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.ImageView
import kampus.merdeka.I.Do.app.*


class Berita : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_berita, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val beritaklik1: ImageView = view.findViewById(R.id.img1)
        beritaklik1.setOnClickListener {
            val beritaklik1 = Intent(this@Berita.activity, berita_klik_satu_Activity::class.java)
            startActivity(beritaklik1)
        }

        val beritaklik2: ImageView = view.findViewById(R.id.iv_berita2)
        beritaklik2.setOnClickListener {
            val beritaklik2 = Intent(this@Berita.activity, berita_klik_2_Activity::class.java)
            startActivity(beritaklik2)
        }

        val beritaklik3: ImageView = view.findViewById(R.id.iv_berita3)
        beritaklik3.setOnClickListener {
            val beritaklik3 = Intent(this@Berita.activity, berita_klik3_Activity::class.java)
            startActivity(beritaklik3)
        }

    }
}

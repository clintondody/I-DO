package kampus.merdeka.I.Do.app.Fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import kampus.merdeka.I.Do.app.R
import kampus.merdeka.I.Do.app.berita_klik3_Activity
import kampus.merdeka.I.Do.app.yt1_Activity
import kampus.merdeka.I.Do.app.yt2_Activity


class Tips : Fragment() {

    private lateinit var detailsTextView: TextView
    private lateinit var detailsImage: ImageView

    private lateinit var detailsTextView2: TextView
    private lateinit var detailsImage2: ImageView

    private lateinit var detailsTextView3: TextView
    private lateinit var detailsImage3: ImageView

    private lateinit var detailsTextView4: TextView
    private lateinit var detailsImage4: ImageView

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
        detailsTextView=view.findViewById(R.id.detailsText)
        detailsImage=view.findViewById(R.id.detailsImage)
        val cardView=view.findViewById<CardView>(R.id.pmo)
        cardView.setOnTouchListener { view, motionEvent ->
            detailsTextView.visibility=View.VISIBLE
            detailsTextView.text=getString(R.string.berhenti_pmo)
            print(resources.getString(R.string.berhenti_pmo))
            detailsImage.visibility=View.VISIBLE
            true
        }
        detailsTextView2=view.findViewById(R.id.detailsText2)
        detailsImage2=view.findViewById(R.id.detailsImage2)
        val cardView2=view.findViewById<CardView>(R.id.rokok)
        cardView2.setOnTouchListener { view, motionEvent ->
            detailsTextView2.visibility=View.VISIBLE
            detailsTextView2.text=getString(R.string.berhenti_merokok)
            print(resources.getString(R.string.berhenti_merokok))
            detailsImage2.visibility=View.VISIBLE
            true
        }
        detailsTextView3=view.findViewById(R.id.detailsText3)
        detailsImage3=view.findViewById(R.id.detailsImage3)
        val cardView3=view.findViewById<CardView>(R.id.alkohol)
        cardView3.setOnTouchListener { view, motionEvent ->
            detailsTextView3.visibility=View.VISIBLE
            detailsTextView3.text=getString(R.string.berhenti_alkohol)
            print(resources.getString(R.string.berhenti_alkohol))
            detailsImage3.visibility=View.VISIBLE
            true
        }
        detailsTextView4=view.findViewById(R.id.detailsText4)
        detailsImage4=view.findViewById(R.id.detailsImage4)
        val cardView4=view.findViewById<CardView>(R.id.sosmed)
        cardView4.setOnTouchListener { view, motionEvent ->
            detailsTextView4.visibility=View.VISIBLE
            detailsTextView4.text=getString(R.string.berhenti_media_sosial)
            print(resources.getString(R.string.berhenti_media_sosial))
            detailsImage4.visibility=View.VISIBLE
            true
        }
    }
}

package kampus.merdeka.I.Do.app

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import kampus.merdeka.I.Do.app.Adapter.MyAdapter
import org.w3c.dom.Text

class EducationFragment : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_education, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val tv1: TextView = view.findViewById(R.id.tv1)
        tv1.setOnClickListener {
            val tv1 =
                Intent(this@EducationFragment.activity, berita_klik_satu_Activity::class.java)
            startActivity(tv1)
        }

        val img1: ImageView = view.findViewById(R.id.img1)
        img1.setOnClickListener {
            val img1 =
                Intent(this@EducationFragment.activity, berita_klik_satu_Activity::class.java)
            startActivity(img1)
        }

        val image2: ImageView = view.findViewById(R.id.iv_berita2)
        image2.setOnClickListener {
            val image2 =
                Intent(this@EducationFragment.activity, berita_klik_2_Activity::class.java)
            startActivity(image2)
        }

        val image3: ImageView = view.findViewById(R.id.iv_berita3)
        image3.setOnClickListener {
            val image3 =
                Intent(this@EducationFragment.activity, berita_klik3_Activity::class.java)
            startActivity(image3)
        }

    }

}
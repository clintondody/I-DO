package kampus.merdeka.I.Do.app

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import kampus.merdeka.I.Do.app.Adapter.Adapter_profile

class ProfileFragment : Fragment() {

    private lateinit var tabLayout2: TabLayout
    private lateinit var viewPager2: ViewPager


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profile, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        tabLayout2 = view.findViewById(R.id.tabLayout2)
        viewPager2 = view.findViewById(R.id.viewPager2)

        tabLayout2.addTab(tabLayout2.newTab().setText("Statistik"))
        tabLayout2.addTab(tabLayout2.newTab().setText("Pencapaian"))
        tabLayout2.addTab(tabLayout2.newTab().setText("RIwayat"))
        tabLayout2.tabGravity = TabLayout.GRAVITY_FILL

        val adapter = Adapter_profile(activity?.applicationContext!!, childFragmentManager,
            tabLayout2.tabCount)
        viewPager2.adapter = adapter

        viewPager2.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tabLayout2))
        tabLayout2.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener{
            override fun onTabSelected(tab: TabLayout.Tab?) {
                viewPager2.currentItem = tab!!.position
            }
            override fun onTabUnselected(tab: TabLayout.Tab?) {}
            override fun onTabReselected(tab: TabLayout.Tab?) {}

        })

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
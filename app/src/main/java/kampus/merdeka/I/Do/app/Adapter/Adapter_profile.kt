package kampus.merdeka.I.Do.app.Adapter

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import kampus.merdeka.I.Do.app.Fragments.*

internal class Adapter_profile ( var context: Context, fm : FragmentManager, var totalTabs : Int): FragmentPagerAdapter(fm){

    override fun getItem(position: Int): Fragment {
        return when(position){
            0 -> {
                Statistik_Fragment()
            }
            1 -> {
                Pencapaian()
            }
            2 -> {
                Riwayat()
            }else -> getItem(position)
        }
    }
    override fun getCount(): Int {
        return totalTabs
    }
}

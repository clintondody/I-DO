package kampus.merdeka.I.Do.app.Adapter

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import kampus.merdeka.I.Do.app.Fragments.Berita
import kampus.merdeka.I.Do.app.Fragments.Tips

internal class MyAdapter (var context: Context, fm: FragmentManager, var totalTabs: Int): FragmentPagerAdapter(fm){


    override fun getItem(position: Int): Fragment {
     return when(position){
         0 -> {
             Berita()
         }
         1 -> {
             Tips()
         }
         else -> getItem(position)
     }
    }
    override fun getCount(): Int {
        return totalTabs
    }
}
package kampus.merdeka.I.Do.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import kampus.merdeka.I.Do.app.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    private lateinit var binding : ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        replaceFragment(PlanFragment())

        binding.bottomNavigationView.setOnItemSelectedListener {

            when(it.itemId){

                R.id.plan -> replaceFragment(PlanFragment())
                R.id.education -> replaceFragment(EducationFragment())
                R.id.profile -> replaceFragment(ProfileFragment())

                else ->{


                }
            }
            true
        }
    }

    private fun replaceFragment(fragment: Fragment){

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frame_layout,fragment)
        fragmentTransaction.commit()
    }
}
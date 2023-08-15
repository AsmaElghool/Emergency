package myproject1.ash1.emergency.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import me.relex.circleindicator.CircleIndicator3
import myproject1.ash1.emergency.adapter.MyPagerAdapter
import myproject1.ash1.emergency.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    val fragments= listOf(EmergencyCall(),FirstAidKit(),SocialMedia(),)
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()
        initViewPager()
    }

    private fun initViewPager() {
        val pagerAdapter=MyPagerAdapter(this,fragments)
        binding.viewPager.adapter=pagerAdapter
        val indicator: CircleIndicator3 = binding.indicator
        indicator.setViewPager(binding.viewPager)
    }

}

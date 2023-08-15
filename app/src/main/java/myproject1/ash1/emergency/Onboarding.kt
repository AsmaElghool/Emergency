package myproject1.ash1.emergency

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import me.relex.circleindicator.CircleIndicator3
import myproject1.ash1.emergency.adapter.MyPagerAdapter
import myproject1.ash1.emergency.databinding.FragmentOnboardingBinding
import myproject1.ash1.emergency.ui.EmergencyCall
import myproject1.ash1.emergency.ui.FirstAidKit
import myproject1.ash1.emergency.ui.SocialMedia


class Onboarding : Fragment() {

lateinit var binding:FragmentOnboardingBinding
    val fragments= listOf(EmergencyCall(), FirstAidKit(), SocialMedia(),)
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding=FragmentOnboardingBinding.inflate(layoutInflater)
        initViewPager()
        return binding.root

    }
    private fun initViewPager() {
        val pagerAdapter= MyPagerAdapter(requireActivity().supportFragmentManager,fragments,lifecycle)
        binding.viewPager.adapter=pagerAdapter
        val indicator: CircleIndicator3 = binding.indicator
        indicator.setViewPager(binding.viewPager)
    }
}
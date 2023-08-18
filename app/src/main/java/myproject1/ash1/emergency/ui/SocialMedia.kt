package myproject1.ash1.emergency.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import myproject1.ash1.emergency.R
import myproject1.ash1.emergency.databinding.FragmentOnboardingBinding
import myproject1.ash1.emergency.databinding.FragmentSocialMediaBinding

class SocialMedia : Fragment() {
    lateinit var binding: FragmentSocialMediaBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding = FragmentSocialMediaBinding.inflate(layoutInflater)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val viewPager = activity?.findViewById<ViewPager2>(R.id.viewPager)
        binding.SocialMediaBack.setOnClickListener {
            viewPager?.currentItem = 1
        }
    }

}
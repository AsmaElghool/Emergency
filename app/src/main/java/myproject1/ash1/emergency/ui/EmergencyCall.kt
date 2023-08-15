package myproject1.ash1.emergency.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.viewpager2.widget.ViewPager2
import myproject1.ash1.emergency.R
import myproject1.ash1.emergency.databinding.FragmentEmergencyCallBinding


class EmergencyCall : Fragment() {
  lateinit var binding: FragmentEmergencyCallBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding= FragmentEmergencyCallBinding.inflate(layoutInflater)
        callBack()
        return binding.root
    }

       fun callBack(){
           val viewPager=activity?.findViewById<ViewPager2>(R.id.viewPager)
           binding.skip.setOnClickListener{
                viewPager?.currentItem=3
           }
           binding.nextBtn.setOnClickListener{
               viewPager?.currentItem=1
           }
       }

}
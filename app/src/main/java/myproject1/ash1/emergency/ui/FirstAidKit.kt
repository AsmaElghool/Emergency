package myproject1.ash1.emergency.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.navigation.fragment.findNavController
import androidx.viewpager2.widget.ViewPager2
import myproject1.ash1.emergency.R
import myproject1.ash1.emergency.databinding.FragmentEmergencyCallBinding
import myproject1.ash1.emergency.databinding.FragmentFirstAidKitBinding


class FirstAidKit : Fragment() {

    lateinit var binding: FragmentFirstAidKitBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding= FragmentFirstAidKitBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val viewPager=activity?.findViewById<ViewPager2>(R.id.viewPager)
        binding.firstAidKitIcSkip.setOnClickListener{
            viewPager?.currentItem=0
        }
        binding.nextBtn.setOnClickListener{
            viewPager?.currentItem=2
        }
    }

//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//
//        requireActivity().onBackPressedDispatcher.addCallback(
//            viewLifecycleOwner,
//            object : OnBackPressedCallback(true) {
//                override fun handleOnBackPressed() {
//                    requireActivity().finish()
//                }
//            }
//        )
//    }


}
package myproject1.ash1.emergency.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.fragment.app.FragmentManager
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.viewpager2.widget.ViewPager2
import myproject1.ash1.emergency.R
import myproject1.ash1.emergency.databinding.FragmentEmergencyCallBinding


class EmergencyCall : Fragment() {
    private lateinit var onBackPressedCallback: OnBackPressedCallback
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
             //  findNavController().popBackStack() // دي هتخليه يرجه للفراجمنت اللي قبله
               viewPager?.currentItem=1
           }
       }


//    fun forBackStack(){
//       var fm:FragmentManager  = getSupportFragmentManager()
//    }



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





    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        onBackPressedCallback = object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                requireActivity().finish()
            }
        }
        requireActivity().onBackPressedDispatcher.addCallback(
            viewLifecycleOwner,
            onBackPressedCallback
        )
    }
    override fun onDestroyView() {
        super.onDestroyView()
        onBackPressedCallback.remove()
    }

//    private lateinit var onBackPressedCallback: OnBackPressedCallback
//
//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//
//        onBackPressedCallback = object : OnBackPressedCallback(true) {
//            override fun handleOnBackPressed() {
//                requireActivity().finish() // Exit the app
//            }
//        }
//
//        requireActivity().onBackPressedDispatcher.addCallback(
//            viewLifecycleOwner,
//            onBackPressedCallback
//        )
//    }
//
//    override fun onDestroyView() {
//        super.onDestroyView()
//        onBackPressedCallback.remove()
//    }


}
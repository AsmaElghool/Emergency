package myproject1.ash1.emergency.ui

import android.annotation.SuppressLint
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import myproject1.ash1.emergency.R

class Splash : Fragment() {
    @SuppressLint("SuspiciousIndentation")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
       val view=inflater.inflate(R.layout.fragment_splash,container,false)
          Handler(Looper.myLooper()!!).postDelayed({
           findNavController().navigate(R.id.action_splash_to_onboarding)
          },1000)
        return view
    }

}
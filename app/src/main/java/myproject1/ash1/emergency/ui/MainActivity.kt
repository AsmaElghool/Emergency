package myproject1.ash1.emergency.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import myproject1.ash1.emergency.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

    }


}

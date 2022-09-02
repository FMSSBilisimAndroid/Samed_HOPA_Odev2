package com.dag.odev2fmss

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dag.odev2fmss.databinding.ActivityLoginBinding
import com.dag.odev2fmss.databinding.ActivityMainBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.loginText1.setOnClickListener {
            val intent = Intent(this@LoginActivity,SingUpActivity::class.java)
            startActivity(intent)
        }

        binding.loginBackButton.setOnClickListener {
            val intent = Intent(this@LoginActivity,MainActivity::class.java)
            startActivity(intent)
        }
    }
}
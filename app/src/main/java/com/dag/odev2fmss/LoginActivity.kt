package com.dag.odev2fmss

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
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
        loginClicked()
    }

    private fun loginClicked() {
        val username = binding.loginUsernameText.text
        val password = binding.loginPasswordText.text

        binding.loginButton.setOnClickListener {
            loginCheck(username, password)
        }
    }

    private fun loginCheck(username:Editable?, password:Editable?) {
        if (username?.isEmpty() == true) {
            binding.loginUsernameLayout.error = " "
        } else {
            binding.loginUsernameLayout.error = null
        }

        if (password?.isEmpty() == true) {
            binding.loginPasswordLayout.error = " "
        } else {
            binding.loginPasswordLayout.error = null
        }
    }
}
package com.dag.odev2fmss

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.widget.EditText
import com.dag.odev2fmss.databinding.ActivitySingUpBinding

class SingUpActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySingUpBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySingUpBinding.inflate(layoutInflater)
        setContentView(binding.root)

        backClicked()
        singUpClicked()
    }

    private fun backClicked() {
        binding.singUpBackButton.setOnClickListener {
            val intent = Intent(this@SingUpActivity,LoginActivity::class.java)
            startActivity(intent)
        }
    }

    private fun singUpClicked() {
        val email = binding.enterEmailText.text
        val username = binding.createUsernameText.text
        val password = binding.createPasswordText.text

        binding.singUpButton.setOnClickListener {
            singUpCheck(email, username, password)
        }
    }

    private fun singUpCheck(email:Editable?, username:Editable?, password:Editable?) {
        if (email?.isEmpty() == true){
            binding.enterEmailLayout.error = " "
        } else {
            binding.enterEmailLayout.error = null
        }

        if (username?.isEmpty() == true){
            binding.createUsernameLayout.error = " "
        } else {
            binding.createUsernameLayout.error = null
        }

        if (password?.isEmpty() == true){
            binding.createPasswordLayout.error = " "
        } else {
            binding.createPasswordLayout.error = null
        }
    }
}
package com.example.midoctor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonSignUp.setOnClickListener {

            val email = editTextEmail.text.toString().trim()
            val password = editTextPassword.text.toString().trim()
            val name = editTextName.text.toString().trim()
            val school = editTextSchool.text.toString().trim()


            if (email.isEmpty()) {
                editTextEmail.error = "Email requerido"
                editTextEmail.requestFocus()
                return@setOnClickListener
            }


            if (password.isEmpty()) {
                editTextPassword.error = "Password requerido"
                editTextPassword.requestFocus()
                return@setOnClickListener
            }

            if (name.isEmpty()) {
                editTextName.error = "Nombre requerido"
                editTextName.requestFocus()
                return@setOnClickListener
            }

            if (school.isEmpty()) {
                editTextSchool.error = "Apellido requerido"
                editTextSchool.requestFocus()
                return@setOnClickListener
            }
        }
    }
}
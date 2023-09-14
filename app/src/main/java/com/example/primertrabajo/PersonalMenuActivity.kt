package com.example.primertrabajo

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.content.Intent

class PersonalMenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_personal_menu)

        val welcomeTextView = findViewById<TextView>(R.id.welcomeTextView)
        val balanceTextView = findViewById<TextView>(R.id.balanceTextView)


        val userName = "Usuario Ejemplo"
        val userBalance = 100.00

        welcomeTextView.text = "Bienvenido, $userName"
        balanceTextView.text = "Saldo: $$userBalance"

        val profileButton = findViewById<Button>(R.id.profileButton)
        profileButton.setOnClickListener {
            val intent = Intent(this, UserProfileActivity::class.java)
            startActivity(intent)
        }

        val btnAccountDetails = findViewById<Button>(R.id.btnAccountDetails)
        btnAccountDetails.setOnClickListener {
            val intent = Intent(this, AccountDetailActivity::class.java)
            startActivity(intent)
        }


    }
}

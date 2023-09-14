package com.example.primertrabajo

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class UserProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_profile)

        val saveProfileButton = findViewById<Button>(R.id.saveProfileButton)
        saveProfileButton.setOnClickListener {

            finish()
        }
    }
}

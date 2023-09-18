package com.driuft.hellosquirrel

import android.os.Build
import android.os.Bundle
import android.view.WindowInsets
import android.view.WindowManager
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.content.res.AppCompatResources
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var profileImage: ImageView
    private lateinit var profileName: TextView
    private lateinit var profileBio: TextView
    private lateinit var dogImageView: ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        configureViews()
        setupProfile()

    }

    fun onButtonClick(view: View) {
        //Button click makes dog image visible
        dogImageView.setImageResource(R.drawable.dog)
        dogImageView.visibility = View.VISIBLE
        Toast.makeText(this, "Thanks!", Toast.LENGTH_SHORT).show()
    }


    private fun configureViews() {
        profileImage = findViewById(R.id.profile_image)
        profileName = findViewById(R.id.profile_name)
        profileBio = findViewById(R.id.profile_bio)
        dogImageView = findViewById(R.id.dogImageView)
    }

    private fun setupProfile() {
        configureImage()
        configureName()
    }

    private fun configureImage() {
        profileImage.setImageDrawable(AppCompatResources.getDrawable(this, R.drawable.avatar_14))
        dogImageView.setImageDrawable(AppCompatResources.getDrawable(this, R.drawable.dog))
    }

    private fun configureName() {
        profileName.text = getString(
            R.string.full_name,
            getString(R.string.first_name),
            getString(R.string.last_name)
        )
    }
}
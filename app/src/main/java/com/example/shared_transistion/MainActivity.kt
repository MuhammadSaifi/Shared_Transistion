package com.example.shared_transistion

import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityOptionsCompat
import androidx.core.view.ViewCompat

import android.app.ActivityOptions
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
// add transition in our style.xml file
    // add windowContentTransition and set it true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // title is the our app page in toolbar
        title = "Activity 1"
        image1.setOnClickListener {
            val intent = Intent(this, Activity2::class.java)
            val option = ActivityOptionsCompat.makeSceneTransitionAnimation(this, image1, ViewCompat.getTransitionName(image1)!!)
            startActivity(intent, option.toBundle())
        }
    }
}

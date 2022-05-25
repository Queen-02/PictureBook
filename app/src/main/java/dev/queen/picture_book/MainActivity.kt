package dev.queen.picture_book

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var nxt: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        nxt = findViewById(R.id.btnNxt)

       nxt.setOnClickListener {
           var intent = Intent(this, SecondPageActivity:: class.java)
           startActivity(intent)
       }
    }
}
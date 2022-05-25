package dev.queen.picture_book

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FourthPageActivity : AppCompatActivity() {
    lateinit var btnPrvFour: Button
    lateinit var btnNxtFour: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourth_page)

        btnPrvFour = findViewById(R.id.btnPrvThree)
        btnNxtFour = findViewById(R.id.btnNxtThree)

        btnPrvFour.setOnClickListener {
            val intent = Intent(this, ThirdPageActivity::class.java)
            startActivity(intent)
        }

        btnNxtFour.setOnClickListener {
            val intent = Intent(this, FifthPageActivity::class.java)
            startActivity(intent)
        }
    }
}
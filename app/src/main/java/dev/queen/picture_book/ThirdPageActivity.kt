package dev.queen.picture_book

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ThirdPageActivity : AppCompatActivity() {
    lateinit var prvTwo: Button
    lateinit var nxtTwo: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third_page)

        prvTwo = findViewById(R.id.btnPrvTwo)
        nxtTwo = findViewById(R.id.btnNxtTwo)

        prvTwo.setOnClickListener {
            val intent = Intent(this, SecondPageActivity::class.java)
            startActivity(intent)
        }

        nxtTwo.setOnClickListener {
            val intent = Intent(this, FourthPageActivity::class.java)
            startActivity(intent)
        }
    }
}
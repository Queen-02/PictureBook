package dev.queen.picture_book

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FifthPageActivity : AppCompatActivity() {
    lateinit var previous: Button
    lateinit var bckHome: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fifth_page)
        previous = findViewById(R.id.btnPrvFour)
        bckHome = findViewById(R.id.btnBack)

        previous.setOnClickListener {
            val intent = Intent(this, FourthPageActivity::class.java)
            startActivity(intent)
        }

        bckHome.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
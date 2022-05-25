package dev.queen.picture_book

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SecondPageActivity : AppCompatActivity() {
    lateinit var prev : Button
    lateinit var next: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_page)
        prev = findViewById(R.id.btnPrvOne)
        next = findViewById(R.id.btnNxtOne)

        prev.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        next.setOnClickListener {
            val intent = Intent(this, ThirdPageActivity::class.java)
            startActivity(intent)
        }
    }
}
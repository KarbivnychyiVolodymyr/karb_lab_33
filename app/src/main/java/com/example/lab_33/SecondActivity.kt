package com.example.lab_33

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    private lateinit var infoTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        infoTextView = findViewById(R.id.info_text_view)

        val infoType = intent.getStringExtra("info_type")

        when (infoType) {
            "author" -> infoTextView.text = "Автор: Карбівничий Володимир"
            "faculty" -> infoTextView.text = "Факультет: Інформаційних Технологій"
            "city" -> infoTextView.text = "Місто: Київ"
        }
    }
}

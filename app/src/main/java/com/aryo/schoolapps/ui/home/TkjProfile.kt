package com.aryo.schoolapps.ui.home

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.aryo.schoolapps.R
class TkjProfile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tkj_profile)

        val btnKembali: Button = findViewById(R.id.btn_kembali)
        btnKembali.setOnClickListener {
            finish()
        }
    }
}
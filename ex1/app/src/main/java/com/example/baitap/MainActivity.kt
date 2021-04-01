package com.example.baitap

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        onclick()
    }

    private fun onclick() {
        radio.setOnCheckedChangeListener { _, checkedId ->
            when (checkedId) {
                R.id.radio_don -> {
                    text_title.text = "This is Don"
                    image.setImageResource(R.drawable.don)
                }
                R.id.radio_leo -> {
                    text_title.text = "This is Leo"
                    image.setImageResource(R.drawable.leo)
                }
                R.id.radio_mike -> {
                    text_title.text = "This is Mike"
                    image.setImageResource(R.drawable.mike)
                }
                R.id.radio_raph -> {
                    text_title.text = "This is Raph"
                    image.setImageResource(R.drawable.raph)
                }
            }
        }

    }
}

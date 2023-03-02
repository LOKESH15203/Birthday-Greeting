package com.example.aa3birthdaygreetings

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_birthday_greet.*

class BirthdayGreet : AppCompatActivity() {

    companion object{
        const val NAME_EXTRA = "name_extra"
    }

    // pre-existing code
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greet)

        // written by me
        val name = intent.getStringExtra(NAME_EXTRA)

        textView.text = "Happy Birthday $name"
    }
}
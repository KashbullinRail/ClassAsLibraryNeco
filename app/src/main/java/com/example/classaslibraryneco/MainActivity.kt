package com.example.classaslibraryneco

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.classaslibrary.HelperClass


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val helpers = HelperClass()

    }
}
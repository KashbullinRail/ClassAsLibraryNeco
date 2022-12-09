package com.example.classaslibraryneco

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.classaslibrary.HelperClass


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.example.classaslibrary.R.layout.connect)

        val btn = findViewById<Button>(com.example.classaslibrary.R.id.btnConnect)

        val helpers = HelperClass()

    }
}
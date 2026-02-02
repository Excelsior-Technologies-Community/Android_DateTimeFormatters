package com.ext.android_datetimeformatters

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.ext.datetimeformatter.core.DateFormatter
import com.ext.datetimeformatter.model.DatePattern

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val formattedDate = DateFormatter.format(
            "2026-02-02",
            DatePattern.API_DATE,
            DatePattern.READABLE_DATE
        )

        Log.d("TEST", formattedDate)
        // Output → 02 Feb 2026
    }
}
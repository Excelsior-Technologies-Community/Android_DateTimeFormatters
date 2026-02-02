package com.ext.android_datetimeformatters

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.ext.datetimeformatter.core.DateFormatter
import com.ext.datetimeformatter.core.JavaTimeFormatter
import com.ext.datetimeformatter.extensions.formatWithJavaTime
import com.ext.datetimeformatter.model.DatePattern
import java.time.ZoneId

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
        val indiaTime = "2026-02-02T12:00:00".formatWithJavaTime(
            from = DatePattern.ISO_DATE_TIME,
            to = DatePattern.READABLE_DATE_TIME,
            zoneId = ZoneId.of("Asia/Kolkata")
        )

        Log.d("ZONE_TEST", indiaTime)
    }
}